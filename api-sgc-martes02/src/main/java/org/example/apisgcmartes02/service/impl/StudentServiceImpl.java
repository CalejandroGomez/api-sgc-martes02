package org.example.apisgcmartes02.service.impl;


import org.example.apisgcmartes02.models.Student;
import org.example.apisgcmartes02.repositories.StudentRepository;
import org.example.apisgcmartes02.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    private final StudentRepository studentRepository;

    // injection por dependencia se crea por el constructor
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;

    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);

    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
