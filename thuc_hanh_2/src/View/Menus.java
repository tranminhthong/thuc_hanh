package View;

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


}
