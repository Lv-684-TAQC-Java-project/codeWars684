package com.org.ita.utils;

import com.org.ita.kata.Eight;
import com.org.ita.kata.Five;
import com.org.ita.kata.Seven;
import com.org.ita.kata.Six;


import java.util.Arrays;
import java.math.BigInteger;


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
        setUser(Users.VOLODYMYR);
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
            case VOLODYMYR:
                eight = new com.org.ita.kata.implementation.Volodja85.EightImpl();
                seven = new com.org.ita.kata.implementation.Volodja85.SevenImpl();
                six = new com.org.ita.kata.implementation.Volodja85.SixImpl();
                five = new com.org.ita.kata.implementation.Volodja85.FiveImpl();
                break;
            case ANTON:
                eight = new com.org.ita.kata.implementation.Antress.EightImpl();
                seven = new com.org.ita.kata.implementation.Antress.SevenImpl();
                six = new com.org.ita.kata.implementation.Antress.SixImpl();
                five = new com.org.ita.kata.implementation.Antress.FiveImpl();
                break;
            case DMYTRO:
                eight = new com.org.ita.kata.implementation.DGalak.EightImpl();
                seven = new com.org.ita.kata.implementation.DGalak.SevenImpl();
                six = new com.org.ita.kata.implementation.DGalak.SixImpl();
                five = new com.org.ita.kata.implementation.DGalak.FiveImpl();
                break;
            case OLES:
                eight = new com.org.ita.kata.implementation.OlesNikon.EightImpl();
                seven = new com.org.ita.kata.implementation.OlesNikon.SevenImpl();
                six = new com.org.ita.kata.implementation.OlesNikon.SixImpl();
                five = new com.org.ita.kata.implementation.OlesNikon.FiveImpl();
                break;
            case MAKA:
                eight = new com.org.ita.kata.implementation.maka155.EightImpl();
                seven = new com.org.ita.kata.implementation.maka155.SevenImpl();
                six = new com.org.ita.kata.implementation.maka155.SixImpl();
                five = new com.org.ita.kata.implementation.maka155.FiveImpl();
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
    public void task_8_3() {
        System.out.println(Tasks.TASK_8_3.getTaskName());
        System.out.println("Miles per gallon:");
        Float mpg = scanner.readFloat();
        System.out.println("Result: " + eight.mpgToKPM(mpg));
    }

    public void task_8_4() {
        System.out.println(Tasks.TASK_8_4.getTaskName());
        System.out.println("Enter list of integer numbers, after entering length:");
        int [] arr = scanner.readIntArray();
        System.out.println("Result: " + Arrays.toString(eight.squareOrSquareRoot(arr)));
    }

    public void task_8_5() {
        System.out.println(Tasks.TASK_8_5.getTaskName());
        System.out.println("Enter list of integer numbers, after entering length:");
        int [] arr = scanner.readIntArray();
        System.out.println("Result: " + Arrays.toString(eight.countPositivesSumNegatives(arr)));
    }


    public void task_8_6() {
        System.out.println(Tasks.TASK_8_6.getTaskName());
        System.out.println("Enter number:");
        String str = scanner.readString();
        System.out.println("Result: " + eight.stringToNumber(str));
    }

    public void task_8_7() {
        System.out.println(Tasks.TASK_8_7.getTaskName());
        System.out.println("Enter number:");
        Double n = scanner.readDouble();
        System.out.println("Result: " + eight.amIWilson(n));
    }

    public void task_8_8() {
        System.out.println(Tasks.TASK_8_8.getTaskName());
        System.out.println("Enter number:");
        Double n = scanner.readDouble();
        System.out.println("Result: " + eight.twoDecimalPlaces(n));
    }

    public void task_8_9() {
        System.out.println(Tasks.TASK_8_9.getTaskName());
        System.out.println("Enter numbers");
        int[] numbers = scanner.readIntArray();
        System.out.println("Enter divider");
        int divider = scanner.readInt();
        System.out.println("Result: " + eight.divisibleBy(numbers, divider));
    }

    public void task_7_1() {
        System.out.println(Tasks.TASK_7_1.getTaskName());
        System.out.println("Enter list of donations:");
        double[] arr = scanner.readDoubleArray();
        System.out.println("Enter average:");
        Double navg = scanner.readDouble();
        System.out.println("Result: " + seven.newAvg(arr, navg));
    }

    public void task_7_2() {
        System.out.println(Tasks.TASK_7_2.getTaskName());
        System.out.println("Enter number:");
        int n = scanner.readInt();
        System.out.println("Result: " + seven.seriesSum(n));
    }

    public void task_7_3() {
        System.out.println(Tasks.TASK_7_3.getTaskName());
        System.out.println("Enter number of total amount of people in the line:");
        int n = scanner.readInt();
        System.out.println("Enter number of people before:");
        int m = scanner.readInt();
        System.out.println("Enter number of people after:");
        int k = scanner.readInt();
        System.out.println("Result: " + seven.whereIsHe(n, m, k));
    }

    public void task_6_1() {
        System.out.println(Tasks.TASK_6_1.getTaskName());
        System.out.println("Enter integer value");
        Long value = scanner.readLong();
        System.out.println("Result: " + six.findNb(value));
    }

    public void task_6_2() {
        System.out.println(Tasks.TASK_6_2.getTaskName());
        System.out.println("Enter text");
        String text = scanner.readString();
        System.out.println("Result: " + six.balance(text));
    }

    public void task_6_3() {
        System.out.println(Tasks.TASK_6_3.getTaskName());
        System.out.println("Enter number");
        Double number = scanner.readDouble();
        System.out.println("Result: " + six.f(number));
    }

    public void task_6_4() {
        System.out.println(Tasks.TASK_6_4.getTaskName());
        System.out.println("Enter City");
        String city = scanner.readString();
        System.out.println("Enter Data");
        String data = scanner.readString();
        System.out.println("\nResult mean: " + six.mean(city, data));
        System.out.println("Result variance: " + six.variance(city, data));
    }

    public void task_6_5() {
        System.out.println(Tasks.TASK_6_5.getTaskName());
        System.out.println("Enter Team:");
        String toFind = scanner.readString();
        System.out.println("Enter Sheet:");
        String resultSheet = scanner.readString();
        System.out.println("Result: " + six.nbaCup(resultSheet, toFind));
    }

    public void task_6_6() {
        System.out.println(Tasks.TASK_6_6.getTaskName());
        System.out.println("Enter List of Articles:");
        String[] lstOfArt = scanner.readString().split(",");
        System.out.println("Enter List of Letters:");
        String[] lstOf1stLetter = scanner.readString().split(",");
        System.out.println("Result: " + six.stockSummary(lstOfArt, lstOf1stLetter));

    }
    public void task_5_1() {
        System.out.println(Tasks.TASK_5_1.getTaskName());
        System.out.println("Enter numbers:");
        int[] numbers = scanner.readIntArray();
        System.out.println("Result: " + five.artificialRain(numbers));

    }
    public void task_5_2() {
        System.out.println(Tasks.TASK_5_2.getTaskName());
        System.out.println("Enter gap:");
        int g = scanner.readInt();
        System.out.println("Enter gap:");
        long m = scanner.readLong();
        System.out.println("Enter gap:");
        long n = scanner.readLong();
        System.out.println("Result: " + eight.getVolumeOfCuboid(g, m, n));

    }
    public void task_5_3() {
        System.out.println(Tasks.TASK_5_3.getTaskName());
        System.out.println("Enter number:");
        int number = scanner.readInt();
        System.out.println("Result: " + five.zeros(number));

    }

    public void task_5_4() {
        System.out.println(Tasks.TASK_5_4.getTaskName());
        System.out.println("Enter the sum of the perimeters of all the squares in a rectangle:");
        BigInteger parameter = scanner.readBigInteger();
        System.out.println("Result: " + five.perimeter(parameter));
    }

    public void task_5_5() {
        System.out.println(Tasks.TASK_5_5.getTaskName());
        System.out.println("Enter number");
        double parameter = scanner.readDouble();
        System.out.println("Result: " + five.solveSum(parameter));
    }

    public void task_5_6() {
        System.out.println(Tasks.TASK_5_6.getTaskName());
        System.out.println("Enter  positive number :");
        long parameter = scanner.readLong();
        System.out.println("Result: " + five.smallest(parameter));
    }


    public void runTask(int scanner) {
        switch (scanner) {
            case 2:
                task_8_2();
                    break;
            case 3:
                task_8_3();
                break;
            case 4:
                task_8_4();
                break;
            case 5:
                task_8_5();
                break;
            case 6:
                task_8_6();
                break;
            case 7:
                task_8_7();
                break;
            case 8:
                task_8_8();
                break;
            case 9:
                task_8_9();
                break;
            case 10:
                task_7_1();
                break;
            case 11:
                task_7_2();
                break;
            case 12:
                task_7_3();
                break;
            case 13:
                task_6_1();
                break;
            case 14:
                task_6_2();
                break;
            case 15:
                task_6_3();
                break;
            case 16:
                task_6_4();
                break;
            case 17:
                task_6_5();
                break;
            case 18:
                task_6_6();
                break;
            case 19:
                task_5_1();
                break;
            case 20:
                task_5_2();
                break;
            case 21:
                task_5_3();
                break;
            case 22:
                task_5_4();
                break;
            case 23:
                task_5_5();
                break;
            case 24:
                task_5_6();
                break;
            default:
                System.exit(3);
        }
    }
}
