package Entities;

public class ThiSinh {
    private int soBaoDanh;
    private String ten;
    private String diaChi;
    private String khuVuc;

    public ThiSinh() {
    }

    public ThiSinh(int soBaoDanh, String ten, String diaChi, String khuVuc) {
        this.soBaoDanh = soBaoDanh;
        this.ten = ten;
        this.diaChi = diaChi;
        this.khuVuc = khuVuc;
    }

    public int getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(int soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getKhuVuc() {
        return khuVuc;
    }

    public void setKhuVuc(String khuVuc) {
        this.khuVuc = khuVuc;
    }

    @Override
    public String toString() {
        return "số báo danh: " + soBaoDanh +
                ", tên: '" + ten + '\'' +
                ", địa chỉ: '" + diaChi + '\'' +
                ", khu vực ưu tiên: '" + khuVuc;
    }
}
