package Enttities;

public class KySu extends Officers {
    private String majors;

    public KySu() {
    }

    public KySu(int id, String name, String dateOfBirth, String address, String majors) {
        super(id, name, dateOfBirth, address);
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
        return "KySu{" +
                "majors='" + majors + '\'' +
                '}';
    }
}
