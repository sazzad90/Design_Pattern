package com.company;

import java.util.ArrayList;
import java.util.List;

// User class
public class User {
    private String username;
    private String email;
    private ShopMediator mediator;


    public User(String username,String email, ShopMediator mediator) {
        this.username = username;
        this.email = email;
        this.mediator = mediator;
        mediator.addUser(this);
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void addToCart(Product product) {
       mediator.addProductToCart(this, product);
    }

    public void removeFromCart(Product product) {
        mediator.removeProductFromCart(this, product);
    }



}
