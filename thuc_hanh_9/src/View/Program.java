package View;

import Behaviors.TuyenSinh;
import Entities.ThiSinh;

import java.util.Scanner;

public class Program {
    static Scanner input = new Scanner(System.in);
    static TuyenSinh<ThiSinh> ts = new TuyenSinh<>();

    public static void main(String[] args) {
        do {
            System.out.print("------Tuyển Sinh------" +
                    "\n1: Thêm thí sinh" +
                    "\n2: Sửa thông tin" +
                    "\n3: Xóa thí sinh" +
                    "\n4: Tìm kiếm thí sinh theo số báo danh" +
                    "\nLựa chọn: ");
            try {
                int choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        ThiSinh thiSinh = Menus.getInfoThiSinh();
                        ts.add(thiSinh);
                        break;
                    case 2:
                        System.out.print("Nhập số báo danh thí sinh muốn sửa: ");
                        int sbd = Integer.parseInt(input.nextLine());
                        System.out.print("Nhập tên mới: ");
                        String name = input.nextLine();
                        ts.update(name, sbd);
                        break;
                    case 3:
                        System.out.print("Nhập số báo danh thí sinh muốn xóa: ");
                        int sbd1 = Integer.parseInt(input.nextLine());
                        ts.delete(sbd1);
                        break;
                    case 4:
                        System.out.print("Nhập số báo danh thí sinh muốn tìm: ");
                        int sbd2 = Integer.parseInt(input.nextLine());
                        ThiSinh thiSinh1 = ts.searchBySbd(sbd2);
                        System.out.println(thiSinh1.toString());
                        break;
                }
            } catch (Exception e) {
                System.err.println("Try Again");
            }
        } while (true);
    }
}
