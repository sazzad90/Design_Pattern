package com.company;

public class PaypalPayment implements Payment{
    private String email;
    private String password;
    private double balance = 1000.0;

    public PaypalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        if(amount>balance) System.out.println("Insufficient Balance");
        else System.out.println("Completing PayPal payment of $" + amount);
    }
}

