package com.company;

public class CreditCardPayment implements Payment {
    private String cardNumber;
    private String expirationDate;
    private double balance = 100000.0;

    public CreditCardPayment(String cardNumber,  String expirationDate) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(double amount) {
        if(amount>balance) System.out.println("Insufficient Balance");

        else System.out.println("Completing credit card payment of $" + amount );
    }
}

