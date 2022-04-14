package com.org.ita.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

public class ConsoleScanner {
    private final java.util.Scanner scanner;

    public ConsoleScanner() {
        this.scanner = new java.util.Scanner(System.in);
    }

    public int readInt() {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Value is not 'Integer', please try again.");
                scanner.next();
            }
        }
    }

    public Long readLong() {
        while(true){
            if(scanner.hasNextLong()){
                return scanner.nextLong();
            }
            else {
                System.out.println("Value is not 'Long', please try again.");
                scanner.next();
            }
        }
    }

    public Float readFloat() {
        while (true) {
            if (scanner.hasNextFloat()) {
                return scanner.nextFloat();
            } else {
                System.out.println("Value is not 'Float', please try again.");
                scanner.next();
            }
        }
    }

    public Double readDouble() {
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Value is not 'Double', please try again.");
                scanner.next();
            }
        }
    }

    public String readString() {
        while (true) {
            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            } else {
                System.out.println("Value is not 'String', please try again.");
                scanner.next();
            }
        }
    }

    public BigInteger readBigInteger() {
        while (true) {
            if (scanner.hasNextBigInteger()) {
                return scanner.nextBigInteger();
            } else {
                System.out.println("Value is not 'BigInteger', please try again.");
                scanner.next();
            }
        }
    }

    public BigDecimal readBigDecimal() {
        while (true) {
            if (scanner.hasNextBigDecimal()) {
                return scanner.nextBigDecimal();
            } else {
                System.out.println("Value is not 'BigDecimal', please try again.");
                scanner.next();
            }
        }
    }

    public double[] readDoubleArray() {
        System.out.print("Length of the array:");
        double[] array = new double[readInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = readDouble();
        }

        return array;
    }

    public int[] readIntArray() {
        System.out.print("Length of the array:");
        int[] array = new int[readInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = readInt();
        }

        return array;
    }

    public String[] readStringArray() {
        System.out.print("Length of the array:");
        int length = readInt();
        System.out.println("To finish enter 'end'!");
        List<String> strings = new LinkedList<String>();

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            if (line.equals("end")) break;
            strings.add(line);
        }

        return strings.toArray(new String[length]);
    }

    public long[] readLongArray() {
        System.out.print("Length of the array:");
        long[] array = new long[readInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = readLong();
        }

        return array;
    }
}
