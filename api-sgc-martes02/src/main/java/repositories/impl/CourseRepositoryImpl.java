package repositories.impl;

import models.Course;
import repositories.CourseRepository;

import java.util.List;

public class CourseRepositoryImpl implements CourseRepository {

    private final List <Course> courses;

    public CourseRepositoryImpl(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public void save(Course course) {
        courses.add(course);

    }

    @Override
    public Course findById(Long id) {
        for (Course course: courses){
            if (course.getId() == (id)){
                return course;
            }
        }


        return null;
    }

    @Override
    public Course deleteById(Long id) {
        Course course = findById(id);
        if (course != null) {

            courses.remove(course);
        }
        return null;
    }

    @Override
    public List<Course> findALl() {
        return courses;
    }
}
