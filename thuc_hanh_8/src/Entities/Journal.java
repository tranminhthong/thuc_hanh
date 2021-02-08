package Entities;

public class Journal extends Documents {
    private String soPhatHanh;
    private int thangPhatHanh;

    public Journal() {
    }

    public Journal(int code, String nameProducer, int soBanPhatHanh, String soPhatHanh, int thangPhatHanh) {
        super(code, nameProducer, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "Journal: " +
                "soPhatHanh='" + soPhatHanh + '\'' +
                ", thangPhatHanh=" + thangPhatHanh + ", " + super.toString();
    }
}
