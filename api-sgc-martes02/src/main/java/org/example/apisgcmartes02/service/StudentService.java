package org.example.apisgcmartes02.service;

import org.example.apisgcmartes02.models.Student;

import java.util.List;

public interface StudentService {

    void save(Student student);
    Student findById(Long id);
    void deleteById(Long id);
    List<Student> findAll();
}
