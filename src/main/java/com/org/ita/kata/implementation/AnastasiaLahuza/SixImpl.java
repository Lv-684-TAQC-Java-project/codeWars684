package com.org.ita.kata.implementation.AnastasiaLahuza;

import com.org.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        return null;
    }

    @Override
    public double f(double x) {
        return x / (1.0 + Math.sqrt(1.0 + x));
    }

    @Override
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        String book = "";

        if (lstOf1stLetter == null || lstOfArt == null || lstOf1stLetter.length == 0 || lstOfArt.length == 0) {
            book = "";
        }
        int sum = 0;
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            String currentBook = lstOf1stLetter[i];
            int count = 0;

            for (String currentArt : lstOfArt) {
                if (currentArt.substring(0, 1).equals(currentBook)) {
                    String[] artValues = currentArt.split(" ");
                    count += Integer.parseInt(artValues[1]);
                    sum += count;
                }
            }

            String line = "(" + currentBook + " : " + count + ")";
            if (i != lstOf1stLetter.length - 1) {
                book += line + " - ";
            } else {
                book += line;
            }
        }
        if (sum == 0) {
            book = "";
        }
        return book;

    }
}
