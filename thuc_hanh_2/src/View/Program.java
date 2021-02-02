package View;

import Behaviors.CustomerManagement;
import Behaviors.ReceiptManagement;
import Entities.Customer;
import Entities.Receipt;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    static CustomerManagement cm = new CustomerManagement();
    static ReceiptManagement rm = new ReceiptManagement();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        startMenu:
        do {
            System.out.println("---------------------------------------------------");
            System.out.println("1: Customer Management");
            System.out.println("2: Receipt Management");
            System.out.println("3: Calculate the customer's electricity bill");
            int choice1 = Integer.parseInt(sc.nextLine());
            switch (choice1) {
                case 1:
                    try {
                        do {
                            System.out.println("-------------------------------------------------------------");
                            System.out.println("1: Add");
                            System.out.println("2: Update");
                            System.out.println("3: Delete");
                            System.out.println("4: Show a customer");
                            System.out.println("5: Show All");
                            System.out.println("0: Back");
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
                                    System.out.println("Try again!");
                            }
                        } while (true);
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                    }
                case 2:
                    do {
                        System.out.println("------------------------------------------------------------");
                        System.out.println("1: Add");
                        System.out.println("2: Show");
                        System.out.println("0: Back");
                        int choice3 = Integer.parseInt(sc.nextLine());
                        switch (choice3) {
                            case 1:
                                System.out.println("Nhập mã công tơ khách hàng:");
                                long electricMeterCode = Long.parseLong(sc.nextLine());
                                System.out.println("Nhập chỉ số cũ: ");
                                int oldNumber = Integer.parseInt(sc.nextLine());
                                System.out.println("Nhập chỉ số mới: ");
                                int newNumber = Integer.parseInt(sc.nextLine());
                                Customer customer = cm.getACustomer(electricMeterCode);
                                Receipt receipt = new Receipt(oldNumber, newNumber, customer);
                                rm.add(receipt);
                                break;
                            case 2:
                                rm.show();
                                break;
                            case 0:
                                continue startMenu;
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
        } while (true);
    }
}
