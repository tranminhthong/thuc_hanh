package View;

import Behaviors.Method;
import Entities.Person;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Method m = new Method();
        Scanner sc = new Scanner(System.in);
        startMenu:
        do {
            System.out.println("--------------------Menu-------------------------" +
                    "\n1: Thuê phòng" +
                    "\n2: Tìm kiếm thông tin một người" +
                    "\n3: Trả phòng, thanh toán" +
                    "\nNhập lựa chọn của bạn: ");
            try {
                int choice1 = Integer.parseInt(sc.nextLine());
                switch (choice1) {
                    case 1:
                        System.out.println("\nDanh sách phòng trống");
                        m.listRoom();
                        System.out.print("\nChọn số phòng: ");
                        int numberRoom = Integer.parseInt(sc.nextLine());
                        System.out.print("Nhập thời gian thuê phòng: ");
                        int timeStart = Integer.parseInt(sc.nextLine());
                        m.setTime(numberRoom, timeStart);
                        do {
                            System.out.print("-------------------Quản lý phòng-----------------------" +
                                    "\n1: Thêm người" +
                                    "\n2: Cập nhật" +
                                    "\n3:  Xóa người" +
                                    "\n4: Hiển thị thông tin phòng" +
                                    "\n0: Quay lại" +
                                    "\nChọn: ");
                            int choice = Integer.parseInt(sc.nextLine());
                            switch (choice) {
                                case 1:
                                    Person person = Menus.getInfoPerson();
                                    m.addPerson(person,numberRoom);
                                    break;
                                case 2:
                                    System.out.print("Nhập id cần cập nhật: ");
                                    int idUpdate = Integer.parseInt(sc.nextLine());
                                    System.out.print("Nhập tên: ");
                                    String  name = sc.nextLine();
                                    m.update(numberRoom,idUpdate,name);
                                    break;
                                case 3:
                                    System.out.print("Nhập id cần xóa: ");
                                    int id = Integer.parseInt(sc.nextLine());
                                    m.deletePerson(id,numberRoom);
                                    break;
                                case 4:
                                    m.displayRoom(numberRoom);
                                    break;
                                case 0:
                                    continue startMenu;
                                default:
                                    System.out.println("Enter Error");
                            }
                        } while (true);
                    case 2:
                        System.out.println("Nhập id:");
                        int id1 = Integer.parseInt(sc.nextLine());
                        System.out.println(m.searchPerson(id1).toString());
                        break;
                    case 3:
                        System.out.print("Nhập số phòng: ");
                        int numRoom = Integer.parseInt(sc.nextLine());
                        m.displayRoom(numRoom);
                        System.out.print("Nhập thời gian trả phòng: ");
                        int timeEnd = Integer.parseInt(sc.nextLine());
                        int total = m.pay(numRoom,timeEnd);
                        System.out.println("Tổng tiền phải thanh toán là: "+total+" VNĐ");
                        break;
                }
            }catch (Exception e){
                System.out.println("Enter Error");
            }
        } while (true);
    }
}