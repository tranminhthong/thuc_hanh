package Entities;

public class Person {
    private int identity;
    private String name;
    private int age;


    public Person() {
    }

    public Person(int identity, String name, int age) {
        this.identity = identity;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        return getName() + ": " + getAge() + " tuổi, CMND: " + getIdentity();
    }
}
