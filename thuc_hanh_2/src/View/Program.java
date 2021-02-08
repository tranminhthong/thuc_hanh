package View;

import Behaviors.CustomerManagement;
import Behaviors.ReceiptManagement;
import Entities.Customer;
import Entities.Receipt;

import java.util.Scanner;

public class Program {
    static CustomerManagement cm = new CustomerManagement();
    static ReceiptManagement rm = new ReceiptManagement();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        startMenu:
        do {
            System.out.print("---------------Menu-------------------" +
                    "\n1: Customer Management" +
                    "\n2: Receipt Management" +
                    "\n3: Calculate the customer's electricity bill" +
                    "\nEnter your choice: ");
            try {
                int choice1 = Integer.parseInt(sc.nextLine());
                switch (choice1) {
                    case 1:

                        do {
                            System.out.print("------------------Customer Management-------------------" +
                                    "\n1: Add customer" +
                                    "\n2: Update customer" +
                                    "\n3: Delete customer" +
                                    "\n4: Show a customer" +
                                    "\n5: Show All" +
                                    "\n0: Back" +
                                    "\nEnter your choice: ");
                            int choice2 = Integer.parseInt(sc.nextLine());
                            switch (choice2) {
                                case 1:
                                    Customer customer = Menus.getInfoCustomer();
                                    cm.addCustomer(customer);
                                    break;
                                case 2:
                                    Customer customer1 = Menus.getInfoCustomer();
                                    cm.update(customer1);
                                    break;
                                case 3:
                                    System.out.println("Nhập mã công tơ của khách hàng muốn xóa");
                                    long electricMeterCode = Integer.parseInt(sc.nextLine());
                                    cm.delete(electricMeterCode);
                                    break;
                                case 4:
                                    System.out.println("Nhập mã công tơ khách hàng muốn xem");
                                    long electricMeterCode1 = Integer.parseInt(sc.nextLine());
                                    Customer customer2 = cm.getACustomer(electricMeterCode1);
                                    System.out.println(customer2);
                                    break;
                                case 5:
                                    cm.show();
                                    break;
                                case 0:
                                    continue startMenu;
                                default:
                                    System.err.println("Try again!");
                            }
                        } while (true);

                    case 2:
                        do {
                            System.out.print("-----------------Receipt Management------------------" +
                                    "\n1: Add receipt" +
                                    "\n2: Show receipt" +
                                    "\n0: Back" +
                                    "\nEnter choice: ");
                            int choice3 = Integer.parseInt(sc.nextLine());
                            switch (choice3) {
                                case 1:
                                    System.out.println("Nhập mã công tơ khách hàng:");
                                    long electricMeterCode = Long.parseLong(sc.nextLine());
                                    Receipt receipt = Menus.getInfoReceipt();
                                    Customer customer = cm.getACustomer(electricMeterCode);
                                    receipt.setCustomer(customer);
                                    rm.add(receipt);
                                    break;
                                case 2:
                                    rm.show();
                                    break;
                                case 0:
                                    continue startMenu;
                                default:
                                    System.err.println("Enter Error");
                            }
                        } while (true);
                    case 3:
                        System.out.println("Nhập mã công tơ của khách hàng: ");
                        long electricMeterCode = Long.parseLong(sc.nextLine());
                        int money = rm.calculateBill(electricMeterCode);
                        System.out.println(cm.getACustomer(electricMeterCode).toString()
                                + " Tiền điện: " + money + " VNĐ");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Enter Error");
            }
        } while (true);
    }
}
