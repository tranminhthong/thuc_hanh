package Entities;

public class ThiSinhKhoiB extends ThiSinh{
    private final String MON_THI = "Toán, Hóa, Sinh";

    public ThiSinhKhoiB(int soBaoDanh, String ten, String diaChi, String khuVuc) {
        super(soBaoDanh, ten, diaChi, khuVuc);
    }

    public String getMON_THI() {
        return MON_THI;
    }

    @Override
    public String toString() {
        return "Thí sinh khối B: " + super.toString() +
                ", Môn thi: '" + MON_THI + "'";
    }
}
