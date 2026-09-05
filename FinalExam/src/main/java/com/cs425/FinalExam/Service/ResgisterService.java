package com.cs425.FinalExam.Service;

import com.cs425.FinalExam.Dto.RegisterDto;
import com.cs425.FinalExam.Entity.Register;
import com.cs425.FinalExam.Entity.Workshop;
import com.cs425.FinalExam.Mapper.RegisterMapper;
import com.cs425.FinalExam.Repository.RegisterRepository;
import com.cs425.FinalExam.Repository.WorkshopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class ResgisterService {
    @Autowired
    private RegisterRepository registerRepository;
    @Autowired
    private RegisterMapper registerMapper;
    @Autowired
    private WorkshopRepository workshopRepository;

    public ResgisterService(RegisterRepository registerRepository, RegisterMapper registerMapper, WorkshopRepository workshopRepository) {
        this.registerRepository = registerRepository;
        this.registerMapper = registerMapper;
        this.workshopRepository = workshopRepository;
    }

    public String register(Long wsId,RegisterDto registerDto) {
        Workshop workshop = workshopRepository.findById(wsId).get();
        Register register;
        if(workshop != null) {
            if (isWorkShopFull(workshop.getWorkshopId()))
            {
                register = registerMapper.toEntity(registerDto);
                register.setWorkshop(workshop);
                if(register.getRegisterDate().isAfter(workshop.getRegisteredDeadline()))
                {
                    return "The deadline has passed";
                }
                else {
                    registerRepository.save(register);

                    return "Register successfully";
                }
            }
            else {
                return "Workshop is not full";
            }
        }
        return "Workshop does not exist";
    }

    private boolean isWorkShopFull(Long wsId)
    {
        int totalRegistered = 1;
        Workshop workshop = workshopRepository.findById(wsId).get();
        if(workshop.getCapacity() < totalRegistered) {
            return true;
        }
        return false;
    }
}
