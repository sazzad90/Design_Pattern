package com.company;


public abstract class AccountManager {
    protected User user;

    public AccountManager(User user) {
        this.user = user;
    }
    public void showAccountInfo(){
        System.out.println("\nUser details:\n");
        showName();
        showEmail();
    }
    public abstract void showName();
    public abstract void showEmail();

}
