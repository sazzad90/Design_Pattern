package com.company;

public class Singleton {
    String name;
    private static Singleton director;
    private Singleton(String name) {
        this.name = name;
    }

    public static Singleton getInstance(){
        if(director == null){
            director = new Singleton("Shafi bro");
        }
        return director;
    }
    public String getName(){
        return name;
    }


}
