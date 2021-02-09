package Entities;

import java.util.List;

public class Hotel {
    private int numberRoom;
    private int day;
    private String typeRoom;
    private int price;
    List<Customer> customers;

    public Hotel(int numberRoom, String typeRoom, int price, List<Customer> customers) {
        this.numberRoom = numberRoom;
        this.typeRoom = typeRoom;
        this.price = price;
        this.customers = customers;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "day=" + day +
                ", typeRoom='" + typeRoom + '\'' +
                ", price=" + price +
                ", customers=" + customers +
                '}';
    }
}
