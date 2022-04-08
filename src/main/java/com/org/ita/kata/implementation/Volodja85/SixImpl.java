package com.org.ita.kata.implementation.Volodja85;

import com.org.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {

        double totalExpense = 0.0;
        double averageExpense=0.0;
        double sum=0D;
        double round=Math.pow(10,2);
        double expence=0D;
        String[] expenseList=null;

        String[] recipe = book.replaceAll("[^.a-zA-Z0-9\n ]", "").split("\n");
        String newBook= recipe[0].trim()+"\\r\\n";

        for (int i=1; i<recipe.length; i++) {
            expenseList = recipe[i].replaceAll("[\\s]{2,}", " ").split(" ");
            sum += Double.parseDouble(expenseList[2]);
            expence = (Double.parseDouble(recipe[0]) - sum);
            recipe[i] = recipe[i] + " Balance " + String.format("%.2f", expence).replace(",",".");
            newBook += recipe[i].replaceAll("[\\s]{2,}", " ") + "\\r\\n";
            newBook.replaceAll(",",".");
            totalExpense =(double) Math.round(sum * round) / round;
            averageExpense = totalExpense / (recipe.length - 1);
        }
        newBook = "Original Balance: " + newBook + "Total expense  " + String.format("%.2f", totalExpense).replace(",",".") + "\\r\\n" + "Average expense  " + String.format("%.2f", averageExpense).replace(",",".");
        return newBook;
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
