package service.impl;

import repositories.EnrollmentRepository;
import models.Enrollment;
import service.EnrollmentService;

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
        return Enrollment;
    }

    @Override
    public void deleteBy(Long id) {

    }

    @Override
    public List<Enrollment> findAll() {
        return List.of();
    }
}
