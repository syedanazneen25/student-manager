package com.example.student_manager.service;

import com.example.student_manager.repository.StudentRepository;
import com.example.student_manager.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student createStudent(String name, String email){
        return studentRepository.save(new Student(name, email));
    }

    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    public long getCount(){
        return studentRepository.count();
    }
}
