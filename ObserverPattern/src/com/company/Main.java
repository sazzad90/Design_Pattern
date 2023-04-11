package com.company;

public class Main {

    public static void main(String[] args) {
	File file = new File("Observer Pattern");

    User user1 = new User("Shaed",file);
    User user2 = new User("Shaad-ullah",file);
    User user3 = new User("Galib",file);

    file.register(user1);
    file.register(user2);
    file.register(user3);

    file.modifyFile("Inception","Added");

    file.unregister(user2);
    file.modifyFile("Genesis","Replaced");


    }
}
