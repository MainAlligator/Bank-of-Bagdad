package com.company;

public class Main {

    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setNumber(12345);
        account1.setCustomerName("Igor");
        account1.setCustomerEmailAddress("igor@gmail.com");
        account1.setCustomerPhoneNumber("+3805032145");
        System.out.println("Number account: " + account1.getNumber());
        System.out.println("Customer name: " + account1.getCustomerName());
        System.out.println("Customer email Adress: " + account1.getCustomerEmailAddress());
        System.out.println("Customer phone Number: " + account1.getCustomerPhoneNumber());
        account1.deposit(200);
        account1.withdrawal(200);
        System.out.println("***************************");
        System.out.println();

        Account account2 = new Account();
        account2.setNumber(45678);
        account2.setCustomerName("Husam");
        account2.setCustomerEmailAddress("muh@alrabiamail.com");
        account2.setCustomerPhoneNumber("+678654321");
        System.out.println("Number account: " + account2.getNumber());
        System.out.println("Customer name: " + account2.getCustomerName());
        System.out.println("Customer email Adress: " + account2.getCustomerEmailAddress());
        System.out.println("Customer phone Number: " + account2.getCustomerPhoneNumber());
        account2.deposit(1000000);
        account2.withdrawal(1000);
    }
}
