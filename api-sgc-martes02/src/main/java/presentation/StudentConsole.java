package presentation;

import models.Student;
import service.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentConsole {


    private final StudentService studentService;
    private final java.util.Scanner scanner;

    public StudentConsole (StudentService studentService){
        this.studentService = studentService;
        this.scanner = new Scanner(System.in);
    }

    public void createStudent() {
        System.out.println("\n--- Crear Estudiante ----");
        System.out.println("Ingrese ID: ");
        Long id = Long.parseLong(scanner.nextLine());
        System.out.println("Ingrese su nombre: ");
        String firstName = scanner.nextLine();
        System.out.println("Ingrese su apellido: ");
        String lastName = scanner.nextLine();
        System.out.println("Ingrese Email: ");
        String email = scanner.nextLine();
        System.out.println("Ingrese Teléfono: ");
        String phone = scanner.nextLine();

        Student student = new Student(id, firstName, lastName, email, phone);
        studentService.save(student);
        System.out.println("Estudiante creado con éxito");
    }

    public void listStudent(){

        List<Student> students = studentService.findAll();
        students.forEach(System.out::print);
    }
}
