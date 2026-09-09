package data;

import java.util.ArrayList;
import java.util.List;

import models.Course;
import models.Student;
import models.Enrollment; // Agregar a los imports


public class DataStore {

    private List<Student> listStudent= new ArrayList<>();
    private List<Course> listCours = new ArrayList<>();


    // ... dentro de tu clase DataStore, junto a las otras listas:
    private List<Enrollment> listEnrollment = new ArrayList<>();


    //
    public List<Student> getStudentList() {
        return listStudent;
    }
    public Student getStudent(Long id) {
        for (Student student : listStudent) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }
    //Agregar estudiante
    public void addStudent(Student student) {
        listStudent.add(student);
    }

    // remove
    public void removeStudent(Long id) {
        Student student = getStudent(id);
        if (student != null) {
            listStudent.remove(student);
        }
    }

    public void updateStudent(Long id, Student student) {
        for (Student stud : listStudent) {
            if (stud.getId().equals(id)) {
                stud.setFirstName(student.getFirstName());
                stud.setLastName(student.getLastName());
                stud.setEmail(student.getEmail());
                stud.setPhone(student.getPhone());
                break;
            }
        }
    }

    // ==================== COURS METHODS ====================

    public List<Course> getCoursList() {
        return listCours;
    }

    public Course getCours(Long id) {
        for (Course course : listCours) {
            if (course.getId() == (id)) {
                return course;
            }
        }
        return null;
    }

    public void addCours(Course course) {
        listCours.add(course);
    }

    public void removeCours(Long id) {
        Course course = getCours(id);
        if (course != null) {
            listCours.remove(course);
        }
    }

    public void updateCours(Long id, Course updatedCourse) {
        Course existingCourse = getCours(id);
        if (existingCourse != null) {
            existingCourse.setCode(updatedCourse.getCode());
            existingCourse.setName(updatedCourse.getName());
            existingCourse.setDescription(updatedCourse.getDescription());
            existingCourse.setCapacity(updatedCourse.getCapacity());
        }
    }

    // ==================== ENROLLEMENT METHODS ====================


    // READ ALL
    public List<Enrollment> getEnrollementList() {
        return listEnrollment;
    }

    // READ ONE
    public Enrollment getEnrollement(Long id) {
        for (Enrollment enrollment : listEnrollment) {
            if (enrollment.getId().equals(id)) {
                return enrollment;
            }
        }
        return null; // Retorna null si no lo encuentra
    }

    // CREATE
    public void addEnrollement(Enrollment enrollment) {
        listEnrollment.add(enrollment);
    }

    // DELETE
    public void removeEnrollement(Long id) {
        Enrollment enrollment = getEnrollement(id);
        if (enrollment != null) {
            listEnrollment.remove(enrollment);
        }
    }

    // UPDATE
    public void updateEnrollement(Long id, Enrollment updatedEnrollment) {
        Enrollment existingEnrollment = getEnrollement(id);
        if (existingEnrollment != null) {
            existingEnrollment.setStudentName(updatedEnrollment.getStudentName());
            existingEnrollment.setEnrollmentDate(updatedEnrollment.getEnrollmentDate());
            existingEnrollment.setState(updatedEnrollment.isState());
        }
    }

}


