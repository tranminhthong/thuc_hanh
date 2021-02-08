package Entities;

import java.util.List;

public class Family {
    private int id;
    private int numberHouse;
    private int numberOfFamilyMember;
    List<Person> persons;

    public Family() {
    }

    public Family(int id, int numberHouse, int numberOfFamilyMember, List<Person> persons) {
        this.id = id;
        this.numberHouse = numberHouse;
        this.numberOfFamilyMember = numberOfFamilyMember;
        this.persons = persons;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(int numberHouse) {
        this.numberHouse = numberHouse;
    }

    public int getNumberOfFamilyMember() {
        return numberOfFamilyMember;
    }

    public void setNumberOfFamilyMember(int numberOfFamilyMember) {
        this.numberOfFamilyMember = numberOfFamilyMember;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "Family "+id+" number house "+numberHouse+" has "+numberOfFamilyMember+" member is "+persons+"\n";
    }
}
