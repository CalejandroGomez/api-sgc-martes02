package org.example.apisgcmartes02.repositories.impl;

import org.example.apisgcmartes02.models.Student;
import org.example.apisgcmartes02.repositories.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private final List<Student> students;

    public StudentRepositoryImpl(List<Student> students) {
        this.students = students;
    }


    @Override
    public void save(Student student) {
        students.add(student);
    }

    @Override
    public Student findById(Long id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;

    }

    @Override
    public void deleteById(Long id) {
        Student student = findById(id);
        if (student != null) {
            students.remove(student);
        }

    }

    @Override
    public List<Student> findAll() {
        //return List.of();
        return students;
    }
}
