package View;

import Behaviors.ResidentialManagement;
import Entities.Family;
import Entities.Person;
import Entities.Residential;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menus {
    static Scanner sc = new Scanner(System.in);

    public static Person getInfoPerson() {
        System.out.print("Enter Person's id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Person's name: ");
        String name = sc.nextLine();
        System.out.print("Enter Person's date of birth: ");
        String dateOfBirth = sc.nextLine();
        System.out.print("Enter Person's gender: ");
        String gender = sc.nextLine();
        System.out.print("Enter Person's career: ");
        String career = sc.nextLine();
        return new Person(id, name, dateOfBirth, gender, career);
    }

    public static Family getInfoFamily() {
        System.out.print("Enter Family's id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Family's numberHouse: ");
        int numberHouse = Integer.parseInt(sc.nextLine());
        List<Person> person = new ArrayList<>();
        return new Family(id, numberHouse, 0, person);
    }

    public static void getInfoUpdate(){
        System.out.print("Enter Resident's  id: ");
        int idR = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Family's id: ");
        int idF = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Person's id: ");
        int idP = Integer.parseInt(sc.nextLine());
        System.out.print("Enter name update: ");
        String name = sc.nextLine();
        ResidentialManagement.update(idR,idP,idF,name);
    }
}
