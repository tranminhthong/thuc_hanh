package View;

import Entities.Book;
import Entities.Student;

import java.util.Scanner;

public class Menus {
    static Scanner sc = new Scanner(System.in);

    public static Book getInfoBooK() {
        System.out.print("Enter book's id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter book's name: ");
        String name = sc.nextLine();
        return new Book(id, name);
    }

    public static Student getInfoStudent() {
        System.out.print("Enter student's id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter student's name: ");
        String name = sc.nextLine();
        System.out.println("Enter student's class: ");
        String className = sc.nextLine();
        return new Student(id, name, className);
    }

}
