package repositories;

import models.Student;

import java.util.List;

public interface StudentRepository {

    void save(Student student);
    Student findById(Long id);
    void deleteById(Long id);
    List<Student> findAll();

}
