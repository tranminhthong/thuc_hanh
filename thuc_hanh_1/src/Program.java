import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Method m = new Method();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Menu");
            System.out.println("1: Thuê phòng");
            System.out.println("2: Tìm kiếm thông tin một người");
            System.out.println("3: Trả phòng, thanh toán");
            int choice1 = Integer.parseInt(sc.nextLine());
            switch (choice1) {
                case 1:
                    System.out.println("\nDanh sách phòng trống");
                    m.listRoom();
                    System.out.print("\nChọn số phòng: ");
                    int numberRoom1 = Integer.parseInt(sc.nextLine());
                    int numberRoom = m.checkInputNumberRoom(numberRoom1);
                    System.out.print("Nhập thời gian thuê phòng: ");
                    int timeStart = Integer.parseInt(sc.nextLine());
                    m.setTime(numberRoom, timeStart);
                    boolean flag = true;
                    do {
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println("Menu");
                        System.out.println("1: Thêm người");
                        System.out.println("2: Xóa ");
                        System.out.println("3: Thông tin phòng");
                        System.out.println("0: quay lại");
                        int choice = Integer.parseInt(sc.nextLine());
                        switch (choice) {
                            case 1:
                                m.addPerson(numberRoom);
                                break;
                            case 2:
                                m.deletePerson(numberRoom);
                                break;
                            case 3:

                                m.searchRoom(numberRoom);
                                break;
                            case 0:
                                flag = false;
                                break;
                        }
                    } while (flag);
                    break;
                case 2:
                    System.out.println("Nhập id:");
                    int id1 = Integer.parseInt(sc.nextLine());
                    System.out.println(m.searchPerson(id1).toString());
                    break;
                case 3:
                    m.pay();
                    break;
            }
        } while (true);
    }
}