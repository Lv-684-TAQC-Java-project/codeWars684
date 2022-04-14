package com.org.ita.utils;

public enum Users {
    ANASTASIIA(1, "Lahuza Anastasiia"),
    ANTON(2,"Shcherbei Anton"),
    MAKA(3, "Markiian Martunyuk");

    private final int id;
    private final String fullName;


    Users(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public static Users getById(int id) {
        for (Users user : values()) {
            if (user.id == id) {
                return user;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }


}
