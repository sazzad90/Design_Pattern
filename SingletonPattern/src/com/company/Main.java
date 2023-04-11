package com.company;

public class Main {

    public static void main(String[] args) {
	 Singleton director = Singleton.getInstance();
        System.out.println(director.getName());
    }
}
