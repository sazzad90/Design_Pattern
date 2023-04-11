package com.company;

public class User extends Observer{
    String userName;
    File file;
    public User(String name, File file){
        this.userName = name;
        this.file = file;
    }

    @Override
    public void update() {
        System.out.println("Notification:\n"+
                        "User name: "+userName+"\n"+
                "File name: "+file.getFileName()+
                "\nHeading name: "+file.getHeadingName()+
                "\nType of change: "+file.changeType+
                "\nModification time: "+file.modificationTime+"\n");
    }

}
