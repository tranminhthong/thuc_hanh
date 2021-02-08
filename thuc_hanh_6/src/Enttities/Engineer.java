package Enttities;

public class Engineer extends Officers {
    private String majors;

    public Engineer(int id, String name, String gender, String dateOfBirth, String address, String majors) {
        super(id, name, gender, dateOfBirth, address);
        this.majors = majors;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    @Override
    public String toString() {
        return "Engineer " + super.toString() +
                "majors='" + majors + "}";
    }
}
