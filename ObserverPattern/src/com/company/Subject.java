package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<User> registeredUsers = new ArrayList<>();
    public abstract void register(User user);
    public abstract void unregister(User user);
    public abstract void notifyUsers();
}
