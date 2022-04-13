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
        while (true) {
            if (scanner.hasNextLong()) {
                return scanner.nextLong();
            } else {
                System.out.println("Value is not 'Long', please try again.");
                scanner.next();
            }
        }
    }

    public Float readFloat() {
        return null;
    }

    public Double readDouble() {
        return null;
    }

    public String readString() {
        while (true) {
            if (scanner.hasNextLine()) {
                return scanner.next();
            } else {
                System.out.println("Value is not 'String', please try again.");
                scanner.next();
            }
        }
    }

    public BigInteger readBigInteger() {
        return null;
    }

    public BigDecimal readBigDecimal() {
        return null;
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
