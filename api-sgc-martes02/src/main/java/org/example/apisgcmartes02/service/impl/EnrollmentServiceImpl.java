package org.example.apisgcmartes02.service.impl;

import org.example.apisgcmartes02.repositories.EnrollmentRepository;
import org.example.apisgcmartes02.models.Enrollment;
import org.example.apisgcmartes02.service.EnrollmentService;

import java.util.List;

public class EnrollmentServiceImpl implements EnrollmentService {

    private final EnrollmentRepository enrollmentRepository;

    public EnrollmentServiceImpl(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    @Override
    public void save(Enrollment enrollment) {

    }

    @Override
    public Enrollment findById(Long id) {
        return enrollmentRepository.findById(id);
    }

    @Override
    public void deleteBy(Long id) {

    }

    @Override
    public List<Enrollment> findAll() {
        return List.of();
    }
}
