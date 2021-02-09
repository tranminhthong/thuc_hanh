package View;

import Entities.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menus {
    static Scanner sc = new Scanner(System.in);

    public static List<Customer> getInfoCustomer() {
        List<Customer> customers = new ArrayList<>();
        System.out.print("Enter number of customer: ");
        int numberCus = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numberCus; i++) {
            System.out.println(">>>Enter info of customer " + (i + 1) + "<<<");
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter date of birth: ");
            String dob = sc.nextLine();
            System.out.print("Enter identity: ");
            int id = Integer.parseInt(sc.nextLine());
            Customer customer = new Customer(name, dob, id);
            customers.add(customer);
        }
        return customers;
    }
}
