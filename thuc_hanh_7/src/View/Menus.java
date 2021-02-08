package View;

import Entities.Officer;
import Entities.Teacher;

import java.util.Scanner;

public class Menus {
    static Scanner sc = new Scanner(System.in);

    public static Teacher getInfoTeach() {
        System.out.print("Enter teacher's id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter teacher's name:");
        String name = sc.nextLine();
        System.out.print("Enter date of birth: ");
        String date = sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        return new Teacher(id, name, date, address);
    }

    public static Officer getInfoOfficer() {
        System.out.print("Enter basic salary: ");
        int basicSalary = Integer.parseInt(sc.nextLine());
        System.out.print("Enter bonus: ");
        int bonus = Integer.parseInt(sc.nextLine());
        System.out.print("Enter penalty: ");
        int penalty = Integer.parseInt(sc.nextLine());
        return new Officer(basicSalary, bonus, penalty, null);

    }
}
