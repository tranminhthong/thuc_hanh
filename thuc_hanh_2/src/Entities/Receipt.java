package Entities;

import Entities.Customer;

public class Receipt {
    private int oldNumber;
    private int newNumber;
    private Customer customer;
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }



    public Receipt(int oldNumber, int newNumber, Customer customer) {
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
        this.customer = customer;
    }

    public Receipt() {
    }

    public int getOldNumber() {
        return oldNumber;
    }

    public void setOldNumber(int oldNumber) {
        this.oldNumber = oldNumber;
    }

    public int getNewNumber() {
        return newNumber;
    }

    public void setNewNumber(int newNumber) {
        this.newNumber = newNumber;
    }

    @Override
    public String toString() {
        return "Receipt {" +
                "oldNumber = " + oldNumber +
                ", newNumber = " + newNumber +
                ", customer = " + customer +
                '}';
    }

}
