package service;
import java.util.List;
import models.Enrollment;

public interface EnrollmentService {

    void save(Enrollment enrollment);
    Enrollment findById(Long id);
    void deleteBy(Long id);
    List<Enrollment> findAll();

}
