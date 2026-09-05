package com.cs425.FinalExam.Controller;

import com.cs425.FinalExam.Dto.RegisterDto;
import com.cs425.FinalExam.Entity.Register;
import com.cs425.FinalExam.Service.ResgisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("register")
public class ResgisterController {
    @Autowired
    private ResgisterService registerService;

    @PostMapping
    public String register(@PathVariable Long id, @RequestBody RegisterDto register){
        return registerService.register(id,register);
    }
}
