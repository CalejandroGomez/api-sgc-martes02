package org.example.apisgcmartes02.service;

import org.example.apisgcmartes02.models.Course;
import java.util.List;

public interface CourseService {

    void save (Course course);
    Course findById(Long id);
    void deleteById(Long id);
    List<Course> findAll();
}
