package com.example.student_manager.controller;

import com.example.student_manager.service.HealthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;

@RestController
@RequestMapping("/")
public class HealthController {
    private final HealthService healthService;

    public HealthController (HealthService healthService){
        this.healthService = healthService;
    }

    @GetMapping("health")
    public String health(){
        return healthService.getHealthCheck();
    }

    @GetMapping("name")
    public String name(){
        return healthService.getAppName();
    }
}
