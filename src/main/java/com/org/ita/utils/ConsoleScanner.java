package com.org.ita.utils;

import java.math.BigDecimal;
import java.math.BigInteger;

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

    public Double[] readDoubleArray() {
        return null;
    }

    public Integer[] readIntegerArray() {
        return null;
    }

    public String[] readStringArray() {
        return null;
    }

    public Long[] readLongArray() {
        return null;
    }

}
