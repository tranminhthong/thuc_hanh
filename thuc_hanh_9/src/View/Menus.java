package View;

import Entities.ThiSinh;
import Entities.ThiSinhKhoiA;
import Entities.ThiSinhKhoiB;
import Entities.ThiSinhKhoiC;

import java.util.Scanner;

public class Menus {
    static Scanner sc = new Scanner(System.in);

    public static ThiSinh getInfoThiSinh() {
        do {
            System.out.print("------------------" +
                    "\n1: Thêm thí sinh khối A" +
                    "\n2: Thêm thí sinh khối B" +
                    "\n3: Thêm thí sinh khối C" +
                    "\nChọn: ");
            try {
                int choice = Integer.parseInt(sc.nextLine());
                String str = "";
                switch (choice) {
                    case 1:
                        str = "A";
                        break;
                    case 2:
                        str = "B";
                        break;
                    case 3:
                        str = "C";
                        break;
                    default:
                        System.err.println("Try Again");
                }
                System.out.print("Nhập số báo danh: ");
                int sbd = Integer.parseInt(sc.nextLine());
                System.out.print("Nhập tên thí sinh: ");
                String name = sc.nextLine();
                System.out.print("Nhập địa chỉ: ");
                String address = sc.nextLine();
                System.out.print("Nhập khu vực: ");
                String khuVuc = sc.nextLine();
                switch (str) {
                    case "A":
                        return new ThiSinhKhoiA(sbd, name, address, khuVuc);
                    case "B":
                        return new ThiSinhKhoiB(sbd, name, address, khuVuc);
                    case "C":
                        return new ThiSinhKhoiC(sbd, name, address, khuVuc);
                }
            } catch (Exception e) {
                System.err.println("Try Again");
            }
        } while (true);

    }
}
