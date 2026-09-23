package org.example.apisgcmartes02.repositories;

import org.example.apisgcmartes02.models.Course;

import java.util.List;

public interface CourseRepository {

    void save(Course course);
    Course findById(Long id);
    Course deleteById(Long id);
    List<Course> findALl();

}
