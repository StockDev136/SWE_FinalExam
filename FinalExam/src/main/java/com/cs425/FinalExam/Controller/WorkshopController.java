package com.cs425.FinalExam.Controller;

import com.cs425.FinalExam.Dto.WorkshopDto;
import com.cs425.FinalExam.Entity.Workshop;
import com.cs425.FinalExam.Service.WorkshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/workshops")
public class WorkshopController {
    @Autowired
    private WorkshopService workshopService;
    public WorkshopController(WorkshopService workshopService) {
        this.workshopService = workshopService;
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Workshop> getWorkshop(){
        return workshopService.getWorkshop();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Workshop getWorkshopById(@PathVariable long id){
        return workshopService.getWorkshopById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Workshop createWorkshop(@RequestBody WorkshopDto workshop){
        return workshopService.saveWorkshop(workshop);
    }
}
