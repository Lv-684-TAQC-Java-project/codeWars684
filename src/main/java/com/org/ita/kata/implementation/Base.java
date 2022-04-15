package com.org.ita.kata.implementation;

public class Base {
    @Override
    public String toString() {
        String[] names = this.getClass().toString().split("\\.");
        return String.format("%s", names[names.length-2]);

    }
}
