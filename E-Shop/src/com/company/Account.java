package com.company;

public class Account extends AccountManager{
    public Account(User user){
        super(user);

    }
    @Override
    public void showName() {
        System.out.println(user.getUsername());
    }

    @Override
    public void showEmail() {
        System.out.println(user.getEmail());
    }

}
