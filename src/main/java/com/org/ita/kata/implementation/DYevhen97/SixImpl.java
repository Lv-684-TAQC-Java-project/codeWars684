package com.org.ita.kata.implementation.DYevhen97;

import com.org.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long mm = 0;
        long n = 0;
        while (mm < m) {
            n = n + 1;
            mm = mm + n * n * n;
        }
        if (mm == m) {
            return n;
        }
        return -1;
    }

    @Override
    public String balance(String book) {
        var lines = book.replaceAll("[^\\w\n. ]", "").split("\n");
        var report = new StringBuilder("Original Balance: " + lines[0] + (book = "\\r\\n"));
        double balance = Double.parseDouble(lines[0]), sum = 0;
        for (var i = 1; i < lines.length; i++) {
            sum += Double.parseDouble(lines[i].split("\\s+")[2]);
            report.append(lines[i].trim().replaceAll("\\s+", " ")).append(String.format(" Balance %.2f", balance - sum)).append(book);
        }
        return report + String.format("Total expense  %.2f%sAverage expense  %.2f", sum, book, sum / (lines.length - 1));
    }

    @Override
    public double f(double x) {
        return 0;
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
        return null;
    }
}
