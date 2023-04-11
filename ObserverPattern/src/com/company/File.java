package com.company;

import java.time.LocalDateTime;

public class File extends Subject{
    String fileName;
    String headingName;
    String changeType;
    String modificationTime;

    public File(String name){
        this.fileName = name;
    }

    @Override
    public void register(User user) {
        registeredUsers.add(user);
    }

    @Override
    public void unregister(User user) {
        registeredUsers.remove(user);
    }

    @Override
    public void notifyUsers() {
        for(User user : registeredUsers){
            user.update();
        }
    }

    public void modifyFile(String headingName, String changeType){
        this.headingName = headingName;
        this.changeType = changeType;
        this.modificationTime  = String.valueOf(LocalDateTime.now());
        notifyUsers();
        System.out.println("\n\n");
    }

    public String getFileName() {
        return fileName;
    }

    public String getHeadingName() {
        return headingName;
    }

    public String getChangeType() {
        return changeType;
    }

    public String getModificationTime() {
        return modificationTime;
    }
}
