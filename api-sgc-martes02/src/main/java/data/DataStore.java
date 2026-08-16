package data;

import java.util.ArrayList;
import java.util.List;

import models.Cours;
import models.Student;


public class DataStore {

    private List<Student> listStudent= new ArrayList<>();
    private List<Cours> listCours = new ArrayList<>();




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

    public void addStudent(Student student) {
        listStudent.add(student);
    }

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

    public List<Cours> getCoursList() {
        return listCours;
    }

    public Cours getCours(Long id) {
        for (Cours cours : listCours) {
            if (cours.getId() == (id)) {
                return cours;
            }
        }
        return null;
    }

    public void addCours(Cours cours) {
        listCours.add(cours);
    }

    public void removeCours(Long id) {
        Cours cours = getCours(id);
        if (cours != null) {
            listCours.remove(cours);
        }
    }

    public void updateCours(Long id, Cours updatedCours) {
        Cours existingCours = getCours(id);
        if (existingCours != null) {
            existingCours.setCode(updatedCours.getCode());
            existingCours.setName(updatedCours.getName());
            existingCours.setDescription(updatedCours.getDescription());
            existingCours.setCapacity(updatedCours.getCapacity());
        }
    }

    // ==================== ENROLLEMENT METHODS ====================




}


