import entities.Bill;
import entities.BillType;
import entities.MemberAccount;
import utilities.excepitions.InsufficientBalanceException;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws InsufficientBalanceException {
        //water bill
        Bill waterBill = new Bill();
        waterBill.setAmount(100);
        waterBill.setBillType(BillType.Water.getId());
        waterBill.setProcessDate(new Date());

        //phone bill
        Bill phoneBill = new Bill();
        waterBill.setAmount(500);
        waterBill.setBillType(BillType.Phone.getId());
        waterBill.setProcessDate(new Date());

        //Member account
        MemberAccount ozer = new MemberAccount();
        ozer.setName("Ozer");
        ozer.setSurname("Yasin");
        ozer.setBalance(1500.0);
        ozer.setPhoneNumber("5063650001");

        //Member account2
        MemberAccount yasin = new MemberAccount();
        ozer.setName("Yasin");
        ozer.setSurname("Özer");
        ozer.setBalance(5500.0);
        ozer.setPhoneNumber("5063650002");


    }
}
