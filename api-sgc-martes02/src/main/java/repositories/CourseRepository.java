package repositories;

import models.Course;

import java.util.List;

public interface CourseRepository {

    void save(Course course);
    Course findById(Long id);
    Course deleteById(Long id);
    List<Course> findALl();

}
