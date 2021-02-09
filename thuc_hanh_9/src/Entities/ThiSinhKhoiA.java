package Entities;

public class ThiSinhKhoiA extends ThiSinh {
    private final String MON_THI = "Toán, Lý, Hóa";

    public ThiSinhKhoiA(int soBaoDanh, String ten, String diaChi, String khuVuc) {
        super(soBaoDanh, ten, diaChi, khuVuc);
    }

    public String getMON_THI() {
        return MON_THI;
    }

    @Override
    public String toString() {
        return "Thí sinh khối A: " + super.toString() +
                ", Môn thi: '" + MON_THI + "'";
    }
}
