package Behaviors;

import Entities.Customer;

import java.util.ArrayList;

public class CustomerManagement {
    ArrayList<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer getACustomer(long electricMeterCode) {
        Customer c = new Customer();
        boolean check = false;
        for (Customer customer : customers) {
            if (customer.getElectricMeterCode() == electricMeterCode) {
                c = customer;
                check = true;
            }
        }
        if (!check) c = null;
        return c;
    }

    public void show() {
        if (customers.size() == 0) {
            System.out.println("List is null");
        }else
        for (Customer c : customers) {
            System.out.println(c.toString());
        }
    }

    public void update(Customer customer) {
        for (Customer customerUpdate : customers) {
            if (customerUpdate.getElectricMeterCode() == customer.getElectricMeterCode()) {
                customerUpdate.setName(customer.getName());
                customerUpdate.setNumberHouse(customer.getNumberHouse());
            }
        }
    }

    public void delete(long electricMeterCode) {
        for (Customer c : customers) {
            if (c.getElectricMeterCode() == electricMeterCode) {
                customers.remove(c);
                break;
            }
        }
    }

    public boolean isListNull(){
        boolean check = false;
        if (customers.size()==0){
            check = true;
        }
        return check;
    }
}
