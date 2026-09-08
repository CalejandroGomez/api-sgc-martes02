package service.impl;


import models.Student;
import repositories.StudentRepository;
import service.StudentService;

import java.util.List;

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
