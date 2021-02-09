package Entities;

public class Customer {
    private String name;
    private String dateOfBirth;
    private int identity;

    public Customer(String name, String dateOfBirth, int identity) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", identity=" + identity +
                '}';
    }
}
