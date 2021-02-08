package Entities;

public class Documents {
    private int code;
    private String nameProducer;
    private int soBanPhatHanh;

    public Documents() {
    }

    public Documents(int code, String nameProducer, int soBanPhatHanh) {
        this.code = code;
        this.nameProducer = nameProducer;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNameProducer() {
        return nameProducer;
    }

    public void setNameProducer(String nameProducer) {
        this.nameProducer = nameProducer;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    @Override
    public String toString() {
        return "code=" + code +
                ", nameProducer='" + nameProducer + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh;
    }
}
