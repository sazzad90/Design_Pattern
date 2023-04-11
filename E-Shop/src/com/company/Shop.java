package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Shop implements ShopMediator {

    private Map<String, List<Product>> userCart = new HashMap<String, List<Product>>();
    private Map<String, User> users = new HashMap<String, User>();

    @Override
    public void addProductToCart(User user, Product product) {
        List<Product> tmpCart = userCart.get(user.getUsername());

        if (tmpCart == null) {
            tmpCart = new ArrayList<Product>();
            userCart.put(user.getUsername(), tmpCart);
        }

        tmpCart.add(product);
    }

    @Override
    public void removeProductFromCart(User user, Product product) {
        userCart.get(user.getUsername()).remove(product);
    }

    @Override
    public void doPay(Payment payment, double totalAmount) {
        payment.pay(totalAmount);
    }

    @Override
    public void placeOrder(User user, Payment payment) {

        List<Product> cart = userCart.get(user.getUsername());
        // Validate user and cart
        if (users.containsKey(user.getUsername()) && !cart.isEmpty()) {
            double totalAmount=0;

            System.out.println("Order placed: \n" + user.getUsername());
            for(Product product : cart) {
                System.out.println(product.getName() + "\tBDT " + product.getPrice());
                totalAmount+=product.getPrice();
            }
            doPay(payment, totalAmount);

            cart.clear();
        }



    }

    // Add user to the mediator
    public void addUser(User user) {
        users.put(user.getUsername(), user);
    }
}
