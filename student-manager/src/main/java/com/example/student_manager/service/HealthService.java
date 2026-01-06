package com.example.student_manager.service;

import org.springframework.stereotype.Service;

@Service
public class HealthService {
    public String getHealthCheck(){
        return "Backend is Running";
    }

    public String getAppName(){
        return "Student Manager App";
    }
}
