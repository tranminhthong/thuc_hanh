package View;

import Behaviors.OfficerManagement;
import Enttities.Engineer;
import Enttities.Officers;
import Enttities.Staff;
import Enttities.Worker;

import java.util.Scanner;

public class NewProgram {
    static Scanner sc = new Scanner(System.in);
    static OfficerManagement<Officers> om = new OfficerManagement<>();

    public static void main(String[] args) {
        startMenu:
        do {
            System.out.print("-----------------Officer Management-------------------" +
                    "\n1: Add Officer" +
                    "\n2: Update Officer" +
                    "\n3: Delete Officer" +
                    "\n4: Display an Officer by name" +
                    "\n5: Display all list Officer" +
                    "\n6: Calculate salary" +
                    "\n Enter your choice: ");
            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        do {
                            System.out.print("-----------------Add Officer-------------------" +
                                    "\n1: Add Worker" +
                                    "\n2: Add Staff" +
                                    "\n3: Add Engineer" +
                                    "\n0: Back" +
                                    "\nEnter your choice: ");
                            int choice1 = Integer.parseInt(sc.nextLine());
                            switch (choice1) {
                                case 1:
                                    Worker worker = (Worker) Menus.getInfoOfficer("worker");
                                    om.add(worker);
                                    break;
                                case 2:
                                    Staff staff = (Staff) Menus.getInfoOfficer("staff");
                                    om.add(staff);
                                    break;
                                case 3:
                                    Engineer engineer = (Engineer) Menus.getInfoOfficer("engineer");
                                    om.add(engineer);
                                    break;
                                case 0:
                                    continue startMenu;
                                default:
                                    System.out.println("Enter error");
                            }
                        } while (true);
                    case 2:
                        do {
                            System.out.print("-----------------Update Officer-------------------" +
                                    "\n1: Update Worker" +
                                    "\n2: Update Staff" +
                                    "\n3: Update Engineer" +
                                    "\n0: Back" +
                                    "\nEnter your choice: ");
                            int choice2 = Integer.parseInt(sc.nextLine());
                            switch (choice2) {
                                case 1:
                                    Worker worker1 = (Worker) Menus.getInfoOfficer("worker");
                                    om.update(worker1);
                                    break;
                                case 2:
                                    Staff staff1 = (Staff) Menus.getInfoOfficer("staff");
                                    om.update(staff1);
                                    break;
                                case 3:
                                    Engineer engineer1 = (Engineer) Menus.getInfoOfficer("staff");
                                    om.update(engineer1);
                                    break;
                                case 0:
                                    continue startMenu;
                                default:
                                    System.out.println("Enter error");
                            }
                        } while (true);
                    case 3:
                        do {
                            System.out.print("-----------------Delete Officer-------------------" +
                                    "\n1: Delete Worker" +
                                    "\n2: Delete Staff" +
                                    "\n3: Delete Engineer" +
                                    "\n0: Back" +
                                    "\nEnter your choice: ");
                            int choice3 = Integer.parseInt(sc.nextLine());
                            switch (choice3) {
                                case 1:
                                    System.out.println("Enter id of worker want to delete");
                                    int id = Integer.parseInt(sc.nextLine());
                                    om.delete(id);
                                    break;
                                case 2:
                                    System.out.println("Enter id of staff want to delete");
                                    int id1 = Integer.parseInt(sc.nextLine());
                                    om.delete(id1);
                                    break;
                                case 3:
                                    System.out.println("Enter id of engineer want to delete");
                                    int id2 = Integer.parseInt(sc.nextLine());
                                    om.delete(id2);
                                    break;
                                case 0:
                                    continue startMenu;
                                default:
                                    System.out.println("Enter error");
                            }
                        } while (true);
                    case 4:
                        System.out.println("Enter officer's name you want to display");
                        String name = sc.nextLine();
                        System.out.println(om.getOfficerByName(name));
                        break;
                    case 5:
                        om.showAll();
                        break;
                    case 6:
                        System.out.print("Enter officer's id: ");
                        int id = Integer.parseInt(sc.nextLine());
                        Officers o = om.search(id);
                        System.out.println(o.toString());
                        System.out.print("Enter day: ");
                        int day = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter bonus: ");
                        int bonus = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter penalty: ");
                        int penalty = Integer.parseInt(sc.nextLine());
                        System.out.println(o.getClass().getSimpleName() + " '"
                                + o.getName() + "' has total salary is: "
                                + om.calculateSalary(id, day, bonus, penalty) + " VNĐ");
                        break;
                    default:
                        System.out.println("Enter error");
                }
            } catch (Exception e) {
                System.out.println("Enter error");
            }
        } while (true);
    }
}