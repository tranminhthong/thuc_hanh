package Enttities;

public class Worker extends Officers {
    private String level;

    public Worker(int id, String name, String gender, String dateOfBirth, String address, String level) {
        super(id, name, gender, dateOfBirth, address);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker " + super.toString() +
                "level=" + level + "}";
    }
}
