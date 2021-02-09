package Behaviors;

import Entities.Customer;
import Entities.Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelManagement {
    static List<Hotel> rooms = new ArrayList<>();

    static {
        rooms.add(new Hotel(101, "A", 500000, new ArrayList<>()));
        rooms.add(new Hotel(102, "A", 500000, new ArrayList<>()));
        rooms.add(new Hotel(103, "B", 600000, new ArrayList<>()));
        rooms.add(new Hotel(104, "B", 600000, new ArrayList<>()));
        rooms.add(new Hotel(105, "C", 800000, new ArrayList<>()));
        rooms.add(new Hotel(201, "C", 800000, new ArrayList<>()));
        rooms.add(new Hotel(202, "D", 1000000, new ArrayList<>()));
        rooms.add(new Hotel(203, "D", 1000000, new ArrayList<>()));
        rooms.add(new Hotel(204, "Vip", 1500000, new ArrayList<>()));
        rooms.add(new Hotel(205, "Super Vip", 2000000, new ArrayList<>()));
    }

    public void addCustomer(List<Customer> customers, int numberRoom, int day) {
        for (Hotel r : rooms) {
            if (r.getNumberRoom() == numberRoom) {
                r.setCustomers(customers);
                r.setDay(day);
            }
        }
    }

    public void checkRoom(int num) throws Exception {
        boolean check = false;
        for (Hotel r : rooms) {
            if (r.getNumberRoom() == num) {
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("No room or had customer");
            throw new Exception();
        }
    }

    public void updateCustomer(int identity, String name) {
        for (Hotel r : rooms) {
            for (Customer c : r.getCustomers()) {
                if (c.getIdentity() == identity) {
                    c.setName(name);
                    System.out.println("Update successful!\n" + c);
                    break;
                }
            }
        }
    }

    public void checkCustomer(int id) throws Exception {
        boolean check = false;
        for (Hotel r : rooms) {
            for (Customer c : r.getCustomers()) {
                if (c.getIdentity() == id) {
                    check = true;
                    break;
                }
            }
        }
        if (!check) {
            System.out.println("No Customer with this identity");
            throw new Exception();
        }
    }

    public boolean deleteCustomer(int identity) {
        for (Hotel r : rooms) {
            for (Customer c : r.getCustomers()) {
                if (c.getIdentity() == identity) {
                    r.getCustomers().remove(c);
                    return true;
                }
            }

        }
        return false;
    }

    public void showOneRoom(int numberRoom) {
        for (Hotel r : rooms) {
            if (r.getNumberRoom() == numberRoom) {
                if (r.getCustomers().size() == 0) System.out.println("Room is empty");
                else System.out.println(r);
            }
        }
    }

    public void showInfoAllCustomer() {
        boolean check = false;
        for (Hotel r : rooms) {
            for (Customer c : r.getCustomers()) {
                System.out.println(c + " Room: " + r.getNumberRoom());
                check = true;
            }
        }
        if (!check) System.out.println("No customer in hotel");
    }

    public int payRoom(int id) {
        int bill = 0;
        for (Hotel r : rooms) {
            for (Customer c : r.getCustomers()) {
                if (c.getIdentity() == id) {
                    bill = r.getDay() * r.getPrice();
                    r.getCustomers().clear();
                    break;
                }
            }
        }
        return bill;
    }

    public void showRoom() {
        for (Hotel r : rooms) {
            if (r.getCustomers().size() == 0)
                System.out.printf("Room: %s   |   Price: %s VNĐ  |   Type: %s\n",
                        r.getNumberRoom(),
                        r.getPrice(),
                        r.getTypeRoom());
        }
    }

}
