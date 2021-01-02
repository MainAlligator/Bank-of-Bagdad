package com.company;

public class Account {


    private int number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public int getNumber() {

        return number;
    }

    public void setNumber(int number) {

        this.number = number;
    }

    public double getBalance() {

        return balance;
    }

    public String getCustomerName() {

        return customerName;
    }

    public void setCustomerName(String customerName) {

        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {

        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {

        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {

        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {

            balance += amount;
            System.out.println("Funds contributed: " + getBalance());

        }
    }

    public double withdrawal(double amount) {


        balance -= amount;
        if (balance  < 0) {
            System.out.println("Balance Insufficient funds.");
            return 0;
        } else {
            System.out.println("Balance: " + getBalance());

        }
        return balance;


    }
}
