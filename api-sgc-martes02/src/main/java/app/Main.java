package app;

import data.DataStore;
import models.Course;
import models.Student;
import models.Enrollement;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

             DataStore dataStore = new DataStore();



/*
        student.add( new Student(1L, "Juan", "alvarez", "juan@gmail.com", "5552020"));
        student.add( new Student(2L, "Alejo", "Smith", "alejo@cesde.com", "4455050"));
        student.add( new Student(3L, "ryan", "gomez", "ryan@gmail.com", "4443030"));
        student.add( new Student(4L, "John", "muñoz", "john@gmail.com", "1111010"));
        student.add( new Student(5L, "Camilo", "Ramirez", "camilo@gmail.com", "8508080"));*/

       /* System.out.println("List of Students:");
        for(Student students : student) {
            System.out.println("ID: " + students.getId() + ", Name: " + students.getFirstName() + ", Last Name: " + students.getLastName() + ", Email: " + students.getEmail() + ", Phone: " + students.getPhone());
        }
        
        cours.add(new Course(1L, "CS101", "Matemáticas", "Curso de matematicas básico", 30));
        cours.add(new Course(2L, "CS102", "Física", "Curso de física básico", 25));
        cours.add(new Course(3L, "CS103", "Química", "Curso de química básico", 20));
        cours.add(new Course(4L, "CS104", "Biología", "Curso de biología básico", 25));
        cours.add(new Course(5L, "CS105", "Historia", "Curso de historia básico", 30));

        System.out.println("\nList of Courses:");
        for(Course courses : cours) {
            System.out.println("ID: " + courses.getId() + ", Code: " + courses.getCode() + ", Name: " + courses.getName() + ", Description: " + courses.getDescription() + ", Capacity: " + courses.getCapacity());
        }
        */



       // DataInitialization.loadData(dataStore);

        dataStore.addStudent( new Student(1L, "Juan", "alvarez", "juan@gmail.com", "5552020"));

        dataStore.getStudentList().forEach(student ->  {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getFirstName() + ", Last Name: " + student.getLastName() + ", Email: " + student.getEmail() + ", Phone: " + student.getPhone());}
        );

        dataStore.addCours(new Course(1L, "CS101", "Matemáticas", "Curso de matematicas básico", 30));
        dataStore.getCoursList().forEach(course -> {
                    System.out.println("ID: " + course.getId() + ", Code: " + course.getCode() + ", Name: " + course.getName() + ", Description: " + course.getDescription() + ", Capacity: " + course.getCapacity());

                }

                );

        dataStore.addEnrollement(new Enrollement(1L, "Juan Perez", new javax.print.attribute.standard.DateTimeAtCreation(new java.util.Date()), true));

// Imprimiendo los datos para verificar que se guardó correctamente
        dataStore.getEnrollementList().forEach(enrollement -> {
            System.out.println("ID: " + enrollement.getId() +
                    ", Student Name: " + enrollement.getStudentName() +
                    ", Date: " + enrollement.getEnrollementDate() +
                    ", State: " + enrollement.isState());
        });




    }
}
