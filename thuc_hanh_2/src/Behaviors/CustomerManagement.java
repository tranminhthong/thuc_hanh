package Behaviors;

import Entities.Customer;

import java.util.ArrayList;

public class CustomerManagement {
    ArrayList<Customer> customers = new ArrayList<>();
    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public Customer getACustomer(long electricMeterCode){
        Customer c = new Customer();
        for (Customer customer: customers){
            if (customer.getElectricMeterCode()==electricMeterCode){
                c = customer;
            }
        }
        return c;
    }

    public void show(){
        for (Customer c: customers){
            System.out.println(c.toString());
        }
    }

    public void update(Customer customer){
        for (Customer customerUpdate: customers){
            if (customerUpdate.getElectricMeterCode()==customer.getElectricMeterCode()){
                customerUpdate.setName(customer.getName());
                customerUpdate.setNumberHouse(customer.getNumberHouse());
            }
        }
    }

    public void delete(long electricMeterCode){
        for (Customer c: customers){
            if(c.getElectricMeterCode()==electricMeterCode){
                customers.remove(c);
            }
        }
    }

}
