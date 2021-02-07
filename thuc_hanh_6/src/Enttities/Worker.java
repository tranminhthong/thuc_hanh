package Enttities;

public class CongNhan extends Officers {
    private double level;

    public CongNhan() {
    }

    public CongNhan(int id, String name, String dateOfBirth, String address, double level) {
        super(id, name, dateOfBirth, address);
        this.level = level;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "level=" + level +
                '}';
    }
}
