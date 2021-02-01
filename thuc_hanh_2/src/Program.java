import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Methods m = new Methods();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------------------------------------------------------------------");
            System.out.println("Menu");
            System.out.println("1: Thêm khách hàng");
            System.out.println("2: Hiển thị thông tin các biên lai");
            System.out.println("3: Hiển thị thông tin biên lai của một khách hàng");
            System.out.println("4: Tiền điện của tất cả khách hàng: ");
            System.out.println("5: Tiền điện của một khách hàng");
            System.out.println("6: Thay đổi thông tin khách hàng");
            System.out.print("Nhập lựa chọn: ");
            boolean flag = false;
            int choice = 0;
            while (!flag) {
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    if (choice > 0 && choice < 7) {
                        flag = true;
                    } else throw new NumberFormatException();
                } catch (NumberFormatException e) {
                    System.out.println("Nhập sai. Phải nhập 1 số trong bảng menu");
                    System.out.print("Nhập lựa chọn: ");
                }
            }

            switch (choice) {
                case 1:
                    m.addCustomer();
                    break;
                case 2:
                    m.displayReceipt();
                    break;
                case 3:
                    if (m.receipts.size() == 0) {
                        System.out.println("null");
                    } else {
                        System.out.print("Nhập mã số công tơ khách hàng muốn xem: ");
                        long electricMeterCode = Long.parseLong(sc.nextLine());
                        m.displayACustomer(electricMeterCode);
                    }
                    break;
                case 4:
                    m.calculateMoney();
                    break;
                case 5:
                    m.calculateMoneyOfACustomer();
                    break;
                case 6:
                    m.update();
                    break;
            }
        } while (true);
    }
}
