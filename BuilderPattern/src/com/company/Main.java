package com.company;

public class Main {

    public static void main(String[] args) {
	 StudentBuilder rakibulBuilder = new StudentBuilder().setGF(true);
     rakibulBuilder.setCGPA("high");
     rakibulBuilder.setClass("High");

     Student rakibul = rakibulBuilder.getStudent();
     System.out.println(rakibul);
    }
}
