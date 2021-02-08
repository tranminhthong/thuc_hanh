package Entities;

import java.util.List;

public class Residential {
    private int id;
    private String nameResidential;
    List<Family> families;

    public Residential() {
    }

    public Residential(int id, String nameResidential, List<Family> families) {
        this.id = id;
        this.nameResidential = nameResidential;
        this.families = families;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameResidential() {
        return nameResidential;
    }

    public void setNameResidential(String nameResidential) {
        this.nameResidential = nameResidential;
    }

    public List<Family> getFamilies() {
        return families;
    }

    public void setFamilies(List<Family> families) {
        this.families = families;
    }

    @Override
    public String toString() {
        return "Resident '"+nameResidential+"':\n"+families;
    }
}
