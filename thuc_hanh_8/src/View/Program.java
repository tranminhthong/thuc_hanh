package View;

import Behaviors.Management;
import Entities.Documents;

import java.util.Scanner;

public class Program {
    static Scanner sc = new Scanner(System.in);
    static Management<Documents> mg = new Management<>();

    public static void main(String[] args) {
        do {
            System.out.print("-------Management-------" +
                    "\n1: Add Document" +
                    "\n2: Update Document" +
                    "\n3: Delete Document" +
                    "\n4: Search document by code" +
                    "\nEnter choice: ");
            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        Documents document = Menus.getInfoDocument();
                        mg.add(document);
                        break;
                    case 2:
                        System.out.print("Nhập mã tài liệu cần sửa: ");
                        int code = Integer.parseInt(sc.nextLine());
                        System.out.print("Nhập tên nhà xuất bản cập nhật: ");
                        String nameProducer = sc.nextLine();
                        mg.update(nameProducer, code);
                        break;
                    case 3:
                        System.out.print("Nhập mã  tài liệu cần xóa: ");
                        int code1 = Integer.parseInt(sc.nextLine());
                        mg.delete(code1);
                        break;
                    case 4:
                        System.out.print("Nhập mã tài liệu muốn tìm: ");
                        int code2 = Integer.parseInt(sc.nextLine());
                        System.out.println(mg.searchDocumentByCode(code2));
                        break;
                    default:
                        System.err.println("Try Again");
                }
            } catch (Exception e) {
                System.err.println("Try Again");
            }
        } while (true);
    }
}
