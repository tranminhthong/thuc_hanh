package View;

import Behaviors.ResidentialManagement;
import Entities.Family;
import Entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ResidentialManagement rm = new ResidentialManagement();
        do {
            System.out.print("------Residential  Management------" +
                    "\n1: Add Family" +
                    "\n2: Update Family" +
                    "\n3: Delete Family" +
                    "\n4: Display a Family" +
                    "\n5: Display all Family" +
                    "\n6: Families has person equal 80 year old" +
                    "\nEnter choice: ");
            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Enter Resident's id: ");
                        int idR = Integer.parseInt(sc.nextLine());
                        List<Person> personList = new ArrayList<>();
                        Family family = Menus.getInfoFamily();
                        System.out.print("Enter number of member: ");
                        int member = Integer.parseInt(sc.nextLine());
                        family.setNumberOfFamilyMember(member);
                        for (int i = 0; i < member; i++) {
                            System.out.println("Person " + (i + 1) + ": ");
                            Person person = Menus.getInfoPerson();
                            personList.add(person);
                        }
                        family.setPersons(personList);
                        rm.addFamily(family, idR);
                        break;
                    case 2:
                        Menus.getInfoUpdate();
                        break;
                    case 3:
                        System.out.print("Enter Resident's id: ");
                        int idR3 = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter Family's id: ");
                        int idF = Integer.parseInt(sc.nextLine());
                        rm.delete(idR3,idF);
                        break;
                    case 4:
                        System.out.print("Enter Resident's id: ");
                        int idR4 = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter Family's id: ");
                        int idF1 = Integer.parseInt(sc.nextLine());
                        System.out.println(rm.getFamily(idR4,idF1));
                        break;
                    case 5:
                        System.out.print("Enter Resident's id: ");
                        int idR2 = Integer.parseInt(sc.nextLine());
                        rm.displayFamilyOfResident(idR2);
                        break;
                    case 6:
                        rm.displayFamilyHasPersonEqual80();
                        break;
                    default:
                        System.err.println("Enter Error. Please Try Again!");
                }
            } catch (Exception e) {
                System.err.println("Enter Error. Please Try Again!");
            }


        } while (true);
    }
}
