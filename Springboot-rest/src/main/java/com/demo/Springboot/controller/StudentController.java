package com.demo.Springboot.controller;

import com.demo.Springboot.model.Student;
import com.demo.Springboot.repository.StudentRepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentRepo studentRepo;


    @PostMapping("/create")
    public Student create(@Valid @RequestBody Student student){

        return studentRepo.save(student);
    }
}
