import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
    ArrayList<Receipt> receipts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addCustomer() {
        boolean flag = false;
        while (!flag) {
            try {
                System.out.print("Nhập tên khách hàng: ");
                String name = sc.nextLine();
                System.out.print("Nhập số nhà: ");
                int numberHouse = Integer.parseInt(sc.nextLine());
                System.out.print("Nhập mã công tơ: ");
                long electricMeterCode = Long.parseLong(sc.nextLine());
                System.out.print("Nhập chỉ số cũ: ");
                int oldNumber = Integer.parseInt(sc.nextLine());
                System.out.print("Nhập chỉ số mới: ");
                int newNumber = Integer.parseInt(sc.nextLine());
                Customer customer = new Customer(name, numberHouse, electricMeterCode);
                Receipt receipt = new Receipt(oldNumber, newNumber, customer);
                receipts.add(receipt);
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai");
            }
        }
    }

    public void displayReceipt() {
        if (receipts.size() == 0) {
            System.out.println("null");
        } else
            for (Receipt receipt : receipts) {
                System.out.println("Name: " + receipt.customer.getName()
                        + ", số nhà: " + receipt.customer.getNumberHouse()
                        + ", số công tơ: " + receipt.customer.getElectricMeterCode());
            }
    }

    public void displayACustomer(long electricMeterCode) {
        for (Receipt receipt : receipts) {
            if (receipt.customer.getElectricMeterCode() == electricMeterCode) {
                System.out.println("Thông tin biên lai khách hàng: ");
                System.out.println("+ Name: " + receipt.customer.getName()
                        + "\n+ Số nhà: " + receipt.customer.getNumberHouse()
                        + "\n+ Mã công tơ: " + receipt.customer.getElectricMeterCode());
            }
        }
    }

    public void calculateMoney() {
        for (Receipt r : receipts) {
            int money = (r.getNewNumber() - r.getOldNumber()) * 750;
            System.out.println("Tiền điện của khách hàng '" + r.customer.getName()
                    + "' có mã công tơ '" + r.customer.getElectricMeterCode() + "' là:  "
                    + money);
        }
    }

    public void calculateMoneyOfACustomer() {
        boolean flag = false;
        while (!flag) {
            try {
                System.out.print("Nhập mã công tơ của khách hàng muốn tính tiền: ");
                long electricMeterCode = Long.parseLong(sc.nextLine());

                for (Receipt r : receipts) {
                    if (r.customer.getElectricMeterCode() == electricMeterCode) {
                        int money = (r.getNewNumber() - r.getOldNumber()) * 750;
                        System.out.println("Tiền điện của khách hàng '" + r.customer.getName()
                                + "' có mã công tơ '" + r.customer.getElectricMeterCode() + "' là:  "
                                + money);
                    }
                }
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai");
            }
        }

    }

    public void update() {
        System.out.print("Nhập mã công tơ khách hàng muốn sửa: ");
        long electricMeterCode = Long.parseLong(sc.nextLine());
        for (Receipt r : receipts) {
            if (r.customer.getElectricMeterCode() == electricMeterCode) {
                displayACustomer(electricMeterCode);
                System.out.print("Nhập tên mới: ");
                String newName = sc.nextLine();
                r.customer.setName(newName);
                displayACustomer(electricMeterCode);
            }
        }
    }

}
