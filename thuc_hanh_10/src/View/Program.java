package View;

import Behaviors.HotelManagement;
import Entities.Customer;

import java.util.List;
import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);
    static HotelManagement hm = new HotelManagement();

    public static void main(String[] args) {
        do {
            System.out.println("---------Hotel Management---------" +
                    "\n1: Add Customer" +
                    "\n2: Update Customer" +
                    "\n3: Delete Customer" +
                    "\n4: Display info of the room" +
                    "\n5: Display all Customer in Hotel" +
                    "\n6: Check out hotel" +
                    "\nEnter your choice: ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        hm.showRoom();
                        System.out.print("Enter number room: ");
                        int num = Integer.parseInt(scanner.nextLine());
                        hm.checkRoom(num);
                        System.out.print("Enter days: ");
                        int days = Integer.parseInt(scanner.nextLine());
                        List<Customer> customers = Menus.getInfoCustomer();
                        hm.addCustomer(customers, num, days);
                        break;
                    case 2:
                        System.out.print("Enter identity customer update: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        hm.checkCustomer(id);
                        System.out.print("Enter name update: ");
                        String name = scanner.nextLine();
                        hm.updateCustomer(id, name);
                        break;
                    case 3:
                        System.out.println("Enter identity customer delete: ");
                        int id1 = Integer.parseInt(scanner.nextLine());
                        hm.checkCustomer(id1);
                        System.out.println(hm.deleteCustomer(id1));
                        break;
                    case 4:
                        System.out.print("Enter number room: ");
                        int numb = Integer.parseInt(scanner.nextLine());
                        hm.checkRoom(numb);
                        hm.showOneRoom(numb);
                        break;
                    case 5:
                        hm.showInfoAllCustomer();
                        break;
                    case 6:
                        System.out.print("Enter identity customer: ");
                        int id2 = Integer.parseInt(scanner.nextLine());
                        hm.checkCustomer(id2);
                        System.out.println("Total money payable: " + hm.payRoom(id2) + " VNĐ");
                        break;
                    default:
                        System.err.println("Enter Error. Try Again");
                }
            } catch (Exception e) {
                System.err.println("Enter Error. Try Again");
            }
        } while (true);
    }
}
