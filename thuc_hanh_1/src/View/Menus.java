package View;

import Entities.Person;

import java.util.Scanner;

public class Menus {
    static Scanner sc = new Scanner(System.in);
    public static Person getInfoPerson(){
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        return new Person(id,name,age);
    }
}
