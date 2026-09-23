package org.example.apisgcmartes02.service;
import java.util.List;
import org.example.apisgcmartes02.models.Enrollment;

public interface EnrollmentService {

    void save(Enrollment enrollment);
    Enrollment findById(Long id);
    void deleteBy(Long id);
    List<Enrollment> findAll();

}
