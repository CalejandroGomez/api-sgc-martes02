package org.example.apisgcmartes02.repositories.impl;

import org.example.apisgcmartes02.models.Enrollment;
import org.example.apisgcmartes02.repositories.EnrollmentRepository;

import java.util.List;

public class EnrollmentRepositoryImpl implements EnrollmentRepository {

    private final List <Enrollment> enrollments;

    public EnrollmentRepositoryImpl(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    @Override
    public void save(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    @Override
    public Enrollment findById(Long id) {
        for (Enrollment enrollment : enrollments){
            if(enrollment.getId().equals(id)){
                return enrollment;
            }
        }

        return null;
    }

    @Override
    public Enrollment deleteById(Long id) {

        Enrollment enrollment = findById(id);
        if (enrollment != null){

            enrollments.remove(enrollment);
        }
        return null;
    }

    @Override
    public List<Enrollment> findAll() {
        return enrollments;
    }
}
