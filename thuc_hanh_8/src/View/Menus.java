package View;

import Entities.Book;
import Entities.Documents;
import Entities.Journal;
import Entities.Newspaper;

import java.util.Scanner;

public class Menus {
    static Scanner sc = new Scanner(System.in);

    public static Documents getInfoDocument() {
        System.out.print("-----Add Document------" +
                "\n1: Add book" +
                "\n2: Add newspaper" +
                "\n3: Add journal" +
                "\nEnter choice: ");
        int choice = Integer.parseInt(sc.nextLine());
        String str = "";
        switch (choice) {
            case 1:
                str = "book";
                break;
            case 2:
                str = "newspaper";
                break;
            case 3:
                str = "journal";
                break;
            default:
                System.err.println("Try Again");
        }
        System.out.print("Nhập mã tài liệu: ");
        int code = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên nhà xuất bản: ");
        String name = sc.nextLine();
        System.out.print("Nhập số bản phát hành: ");
        int soBan = Integer.parseInt(sc.nextLine());

        switch (str) {
            case "book":
                System.out.print("Nhập tên tác giả: ");
                String nameAuthor = sc.nextLine();
                System.out.print("Nhập số trang: ");
                int page = Integer.parseInt(sc.nextLine());
                return new Book(code, name, soBan, nameAuthor, page);
            case "newspaper":
                System.out.print("Nhập ngày phát hành: ");
                String date = sc.nextLine();
                return new Newspaper(code, name, soBan, date);
            case "journal":
                System.out.print("Nhập số phát hành: ");
                String soPhat = sc.nextLine();
                System.out.print("Nhập tháng phát hành: ");
                int month = Integer.parseInt(sc.nextLine());
                return new Journal(code, name, soBan, soPhat, month);
        }
        return null;
    }
}
