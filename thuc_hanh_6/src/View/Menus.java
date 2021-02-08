package View;

import Enttities.Engineer;
import Enttities.Officers;
import Enttities.Staff;
import Enttities.Worker;

import java.util.Scanner;

public class Menus {
    static Scanner sc = new Scanner(System.in);


    public static Officers getInfoOfficer(String str) {
        System.out.println("Enter id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter gender");
        String gender = sc.nextLine();
        System.out.println("Enter dateOfBirth");
        String dateOfBirth = sc.nextLine();
        System.out.println("Enter address");
        String address = sc.nextLine();
        switch (str) {
            case "worker":
                System.out.print("Enter level: ");
                String level = sc.nextLine();
                return new Worker(id, name, gender, dateOfBirth, address, level);
            case "staff":
                System.out.print("Enter work: ");
                String work = sc.nextLine();
                return new Staff(id, name, gender, dateOfBirth, address, work);
            case "engineer":
                System.out.print("Enter major: ");
                String major = sc.nextLine();
                return new Engineer(id, name, gender, dateOfBirth, address, major);
        }
        return null;
    }

}
