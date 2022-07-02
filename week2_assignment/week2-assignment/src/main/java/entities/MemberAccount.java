package entities;

import utilities.excepitions.InsufficientBalanceException;

public class MemberAccount {

    private static int increaseID = 0;
    private int id;
    private String name;
    private String surname;
    private String memberCode;
    private double balance;
    private String phoneNumber;

    public MemberAccount() {
        this.id = ++increaseID;
    }

    public MemberAccount(int id, String name, String surname, String memberCode, double balance, String phoneNumber) {
        this.id = ++increaseID;
        this.name = name;
        this.surname = surname;
        this.memberCode = memberCode;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
    }

    public static int getIncreaseID() {
        return increaseID;
    }

    public static void setIncreaseID(int increaseID) {
        MemberAccount.increaseID = increaseID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = getId() + getName().substring(0, 2);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) throws InsufficientBalanceException {
        if (balance < 0) {
            System.out.println("Invalid balance !, Please enter value bigger than 0"); // attention message without exception
            throw new InsufficientBalanceException("Please enter value bigger than 0");
        } else {
            this.balance = balance;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
