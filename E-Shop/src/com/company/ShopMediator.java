package com.company;

// Mediator interface
public interface ShopMediator {
    void addProductToCart(User user,Product product);
    void removeProductFromCart(User user, Product product);
    void placeOrder(User user, Payment payment);
    void doPay(Payment payment, double totalAmount);
    void addUser(User user);
}
