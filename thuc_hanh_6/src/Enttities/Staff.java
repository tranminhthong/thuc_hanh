package Enttities;

public class NhanVien extends Officers {
    private String work;

    public NhanVien() {
    }

    public NhanVien(int id, String name, String dateOfBirth, String address, String work) {
        super(id, name, dateOfBirth, address);
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
        return "NhanVien{" +
                "work='" + work + '\'' +
                '}';
    }
}

