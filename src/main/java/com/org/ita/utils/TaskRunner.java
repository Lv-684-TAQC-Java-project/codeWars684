package com.org.ita.utils;

import com.org.ita.kata.Eight;
import com.org.ita.kata.Five;
import com.org.ita.kata.Seven;
import com.org.ita.kata.Six;

public class TaskRunner {
    private final ConsoleScanner scanner;
    private Users user;

    private Eight eight;
    private Seven seven;
    private Six six;
    private Five five;

    public TaskRunner() {
        this.scanner = new ConsoleScanner();
        setUser(Users.ANASTASIIA);
    }

    public void setUser(Users user) {
        this.user = user;
        switch (user) {
            case ANASTASIIA:
                eight = new com.org.ita.kata.implementation.AnastasiaLahuza.EightImpl();
                seven = new com.org.ita.kata.implementation.AnastasiaLahuza.SevenImpl();
                six = new com.org.ita.kata.implementation.AnastasiaLahuza.SixImpl();
                five = new com.org.ita.kata.implementation.AnastasiaLahuza.FiveImpl();
                break;
        }
    }

    public void task_8_2() {
        System.out.println(Tasks.TASK_8_2.getTaskName());
        System.out.println("Enter length:");
        Double length = scanner.readDouble();
        System.out.println("Enter width:");
        Double width = scanner.readDouble();
        System.out.println("Enter height:");
        Double height = scanner.readDouble();
        System.out.println("Result: " + eight.getVolumeOfCuboid(length, width, height));
    }

    public void task_8_7() {
        System.out.println(Tasks.TASK_8_7.getTaskName());
        System.out.println("Enter number:");
        Double n = scanner.readDouble();
        System.out.println("Result: " + eight.amIWilson(n));
    }

    public void task_8_6() {
        System.out.println(Tasks.TASK_8_6.getTaskName());
        System.out.println("Enter number:");
        String str = scanner.readString();
        System.out.println("Result: " + eight.stringToNumber(str));
    }
}
