package org.example.apisgcmartes02.controllers;

import org.example.apisgcmartes02.models.Enrollment;
import org.example.apisgcmartes02.service.EnrollmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/enrollment")
public class EnrollmentController {

    private final EnrollmentService enrollmentService{
        this.enrollmentService = enrollmentService;
    }

    @GetMapping
    public List<Enrollment> getAll(){

        return enrollmentService.findAll();
    }


    @GetMapping("/{id}")
    public Enrollment get



}
