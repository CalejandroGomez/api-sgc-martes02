package presentation;

import models.Course;
import models.Enrollment;
import service.EnrollmentService;

import java.util.List;
import java.util.Scanner;

public class EnrollmentConsole {

    private final EnrollmentService enrollmentService;
    private final Scanner scanner;

    public EnrollmentConsole(EnrollmentService enrollmentService) {
        this.enrollmentService = enrollmentService;
        this.scanner = new Scanner(System.in);
    }

    public void createEnrollment() {
        System.out.println("\n --- Crear Matricula ---");
        System.out.println("Ingrese ID: ");
        Long id = Long.parseLong(scanner.nextLine());

        System.out.println("Ingrese su nombre: ");
        String firstName = scanner.nextLine();

        java.time.LocalDateTime enrollmentDate = java.time.LocalDateTime.now();

        System.out.println("Ingrese el estado (true para activo, false para inactivo): ");
        boolean state = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("¡Matrícula creada exitosamente!");
    }

    public void listEnrollment(){

        List<Enrollment> enrollment= enrollmentService.findAll();
        enrollment.forEach(System.out::print);
    }
}
