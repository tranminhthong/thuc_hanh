package View;

import Behaviors.CustomerManagement;
import Entities.Customer;
import Entities.Receipt;

import java.util.Scanner;

public class Menus {
    static Scanner sc = new Scanner(System.in);

    public static Customer getInfoCustomer() {
        System.out.print("Nhập tên khách hàng: ");
        String name = sc.nextLine();
        System.out.print("Nhập số nhà: ");
        int numberHouse = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập mã công tơ: ");
        long electricMeterCode = Long.parseLong(sc.nextLine());
        return new Customer(name, numberHouse, electricMeterCode);
    }
     public static Receipt getInfoReceipt(){
         System.out.println("Nhập chỉ số cũ: ");
         int oldNumber = Integer.parseInt(sc.nextLine());
         System.out.println("Nhập chỉ số mới: ");
         int newNumber = Integer.parseInt(sc.nextLine());
         Customer customer = new Customer();
         return new Receipt(oldNumber,newNumber,customer);
     }

}
