package entities;

import java.util.Date;

public class Bill {
    private static int increaseID = 0;
    private int id;
    private int amount;
    private Date processDate;
    private int billType;

    public Bill() {
        this.id = ++increaseID; // for auto increase of Bill object
    }

    public Bill(int amount, Date processDate, int billType) {
        this.id = ++increaseID; //auto increment 1
        this.amount = amount;
        this.processDate = processDate;
        this.billType = billType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    public int getBillType() {
        return billType;
    }

    public void setBillType(int billType) {
        this.billType = billType;
    }
}
