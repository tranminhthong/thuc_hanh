package Entities;

public class ThiSinhKhoiC extends ThiSinh {
    private final String MON_THI = "Văn, Sử, Địa";

    public ThiSinhKhoiC(int soBaoDanh, String ten, String diaChi, String khuVuc) {
        super(soBaoDanh, ten, diaChi, khuVuc);
    }

    public String getMON_THI() {
        return MON_THI;
    }

    @Override
    public String toString() {
        return "Thí sinh khối C: " + super.toString() +
                ", Môn thi: '" + MON_THI + "'";
    }
}
