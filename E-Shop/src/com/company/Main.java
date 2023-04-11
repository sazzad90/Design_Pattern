package com.company;

import com.company.Shop;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Shop MeenaBazar = new Shop();
        User user1 = new User("Rafiq","rafiq@gmail.com", MeenaBazar);
        User user2 = new User("Shafiq","sf@gmail.com", MeenaBazar);

        // Add users to mediator
        MeenaBazar.addUser(user1);
        MeenaBazar.addUser(user2);

        // User 1 adds products to cart
        Product product1 = new Product("Pen", 10);
        Product product2 = new Product("Pencil", 20);
        Product product3 = new Product("Brush", 30);

        user1.addToCart(product1);
        user1.addToCart(product2);
        user1.addToCart(product3);
        user1.removeFromCart(product2);

        // User 2 adds products to cart
        user2.addToCart(product3);
        user2.addToCart(product1);

        MeenaBazar.placeOrder(user1, new CreditCardPayment("123456", "24/2/26"));


        MeenaBazar.placeOrder(user2, new PaypalPayment("gg@gmail.com", "abcd"));

        Account account = new Account(user1);
        account.showAccountInfo();

    }
}






