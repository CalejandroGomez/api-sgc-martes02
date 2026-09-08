package presentation;

import service.CourseService;

import java.util.Scanner;

public class CourseConsole {

    private final CourseService courseService;
    private final java.util.Scanner scanner;

    public CourseConsole (CourseService courseService){
        this.courseService = courseService;
        this.scanner = new Scanner(System.in);
    }

    public void createCourse(){

        System.out.println("\n--- Crear Curso ----");
        System.out.println("Ingrese ID: ");
        Long id = Long.parseLong(scanner.nextLine());
        System.out.println("Ingrese Nombre del curso: ");
        String name = scanner.nextLine();
        System.out.println("Ingrese Descripción del curso: ");
        String description = scanner.nextLine();



    }

}
