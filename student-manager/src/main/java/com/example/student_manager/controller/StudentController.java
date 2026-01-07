package com.example.student_manager.controller;

import com.example.student_manager.entity.Student;
import com.example.student_manager.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("student")

public class StudentController {
    private final StudentService studentService;
    public StudentController (StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();

    }

    @GetMapping("/count")
    public long getCount(){
        return studentService.getCount();
    }
    @PostMapping
    public Student create(@RequestBody Map<String, String> body){
        String name = body.get("name");
        String email = body.get("email");

        if (name == null || name.isBlank() || email == null || email.isBlank() ){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Name and Email are required.");
        }
        return studentService.createStudent(name, email);
    }
}
