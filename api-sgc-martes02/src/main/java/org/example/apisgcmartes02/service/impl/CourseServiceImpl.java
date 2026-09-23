package org.example.apisgcmartes02.service.impl;

import org.example.apisgcmartes02.models.Course;
import org.example.apisgcmartes02.repositories.CourseRepository;
import org.example.apisgcmartes02.service.CourseService;

import java.util.List;

public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id);
    }

    @Override
    public List<Course> findAll() {
        return courseRepository.findALl();
    }
}
