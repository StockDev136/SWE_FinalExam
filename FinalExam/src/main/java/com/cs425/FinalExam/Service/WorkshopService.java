package com.cs425.FinalExam.Service;

import com.cs425.FinalExam.Dto.WorkshopDto;
import com.cs425.FinalExam.Entity.Workshop;
import com.cs425.FinalExam.Mapper.WorkshopMapper;
import com.cs425.FinalExam.Repository.WorkshopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WorkshopService {
    @Autowired
    private WorkshopRepository workshopRepository;
    @Autowired
    private WorkshopMapper workshopMapper;

    public WorkshopService(WorkshopRepository workshopRepository) {
        this.workshopRepository = workshopRepository;
    }

    public List<Workshop> getWorkshop(){
        return  workshopRepository.findAll();
    }

    public Workshop getWorkshopById(long id){
        return workshopRepository.findById(id).get();
    }

    public Workshop  saveWorkshop(WorkshopDto workshop){
       Workshop ws = workshopMapper.toEntity(workshop);
        return workshopRepository.save(ws);
    }
}
