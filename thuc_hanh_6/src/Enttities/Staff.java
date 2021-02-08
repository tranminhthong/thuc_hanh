package Enttities;

public class Staff extends Officers {
    private String work;

    public Staff() {
    }

    public Staff(int id, String name, String gender, String dateOfBirth, String address, String work) {
        super(id, name, gender, dateOfBirth, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Staff " + super.toString() +
                "work='" + work + "}";
    }
}

