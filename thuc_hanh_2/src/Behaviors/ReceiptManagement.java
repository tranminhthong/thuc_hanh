package Behaviors;

import Entities.Receipt;

import java.util.ArrayList;

public class ReceiptManagement {
    ArrayList<Receipt> receipts = new ArrayList<>();

    public void add(Receipt receipt) {
        receipts.add(receipt);
    }

    public void show() {
        if (receipts.size() == 0) {
            System.out.println("List is null");
        }else
        for (Receipt r : receipts) {
            System.out.println(r.toString());
        }
    }

    public int calculateBill(long electricMeterCode) {
        int money = 0;
        for (Receipt r : receipts) {
            if (r.getCustomer().getElectricMeterCode() == electricMeterCode) {
                money = (r.getNewNumber() - r.getOldNumber()) * 750;
            }
        }
        return money;
    }
}
