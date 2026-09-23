package org.example.apisgcmartes02.controllers;

import org.example.apisgcmartes02.models.Student;
import org.example.apisgcmartes02.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping
    public void save(Student student){
        studentService.save(student);
    }

    @GetMapping
    public List<Student> findAll(){

        return studentService.findAll();
    }



}
