package View;

import Behaviors.OfficerManagement;
import Entities.Officer;
import Entities.Teacher;

import java.util.Scanner;

public class Program {
    static Scanner sc = new Scanner(System.in);
    static OfficerManagement om = new OfficerManagement();

    public static void main(String[] args) {
        startMenu:
        do {
            System.out.print("----------Officer Management----------" +
                    "\n1: Add Officer" +
                    "\n2: Update Officer" +
                    "\n3: Delete Officer" +
                    "\n4: Show" +
                    "\n5: Calculate salary" +
                    "\nEnter choice: ");
            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        Teacher teacher = Menus.getInfoTeach();
                        Officer officer = Menus.getInfoOfficer();
                        officer.setTeacher(teacher);
                        om.addOfficer(officer);
                        break;
                    case 2:
                        System.out.print("Enter teacher's id:");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter teacher's name update:");
                        String name = sc.nextLine();
                        om.update(name, id);
                        break;
                    case 3:
                        System.out.print("Enter teacher's id you want to delete: ");
                        int id0 = Integer.parseInt(sc.nextLine());
                        om.delete(id0);
                        break;
                    case 4:
                        do {
                            System.out.print("-----Show-----" +
                                    "\n1: Show a Teacher" +
                                    "\n2: Show all" +
                                    "\n0: Back" +
                                    "\nEnter choice: ");
                            try {
                                int choice1 = Integer.parseInt(sc.nextLine());
                                switch (choice1) {
                                    case 1:
                                        System.out.print("Enter Teacher's id: ");
                                        int id1 = Integer.parseInt(sc.nextLine());
                                        System.out.println(om.showTeacher(id1));
                                        break;
                                    case 2:
                                        om.showAll();
                                        break;
                                    case 0:
                                        continue startMenu;
                                    default:
                                        System.err.println("Try Again");
                                }
                            } catch (Exception e) {
                                System.err.println("Try Again");
                            }

                        } while (true);
                    case 5:
                        do {
                            System.out.print("-------Calculate Salary-------" +
                                    "\n1: Calculate salary of a Teacher" +
                                    "\n2: Calculate salary of all Teacher" +
                                    "\n3: Display all Teacher has salary greater 8 millions" +
                                    "\n0: Back" +
                                    "\nEnter choice: ");
                            try {
                                int choice2 = Integer.parseInt(sc.nextLine());
                                switch (choice2) {
                                    case 1:
                                        System.out.print("Enter teacher's id: ");
                                        int id2 = Integer.parseInt(sc.nextLine());
                                        System.out.println();
                                        System.out.println(om.showTeacher(id2) + " Lương thực lĩnh = " + om.calculateSalaryById(id2));
                                        break;
                                    case 2:
                                        om.showSalaryAll();
                                        break;
                                    case 3:
                                        om.displayOfficerSalaryGreater8million();
                                        break;
                                    case 0:
                                        continue startMenu;
                                    default:
                                        System.err.println("Try Again");
                                }
                            } catch (Exception e) {
                                System.err.println("Try Again");
                            }

                        } while (true);
                    default:
                        System.err.println("Enter Error. Try Again!");
                }
            } catch (Exception e) {
                System.err.println("Enter Error. Try Again!");
            }
        } while (true);
    }
}
