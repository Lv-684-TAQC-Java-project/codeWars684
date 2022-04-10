package com.org.ita.kata.implementation.DGalak;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.stream.Stream;

import com.org.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        String[] bookArray = book.split("\\n");
        String[] receipt = Stream.of(bookArray).map(e -> e.replaceAll("[^A-Za-z0-9.\\s]", "")).map(e -> e.replaceAll("[\\s]{2,}", " ")).map(e -> e.trim()).toArray(String[]::new);
        String receiptToString = Arrays.toString(receipt);

        String regex = "([0-9]+[.][0-9]+)";
        String input = receiptToString;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> productExpensesArray = new ArrayList<String>();
        while (matcher.find()) {
            matcher.group();
            productExpensesArray.add(matcher.group());
        }

        double totalExpense = 0;
        for (int i = 1; i < productExpensesArray.size(); i++) {
            totalExpense += Double.parseDouble(productExpensesArray.get(i));
        }

        double averageExpense = totalExpense / (productExpensesArray.size() - 1);

        double firstBalanceValue = Double.parseDouble(productExpensesArray.get(0)) - Double.parseDouble(productExpensesArray.get(1));
        double balanceCount = firstBalanceValue;
        List<String> balanceArray = new ArrayList<String>();
        balanceArray.add(String.format("%.2f" , firstBalanceValue));
        for (int i = 2; i < productExpensesArray.size(); i++) {
            balanceCount = balanceCount - Double.parseDouble(productExpensesArray.get(i));
            balanceArray.add(String.format("%.2f", balanceCount));
        }
        ArrayList<String> arraySolution = new ArrayList<String>();
        arraySolution.add("Original Balance: " + productExpensesArray.get(0));
        for(int i = 0; i < balanceArray.size(); i++ ){
            arraySolution.add(receipt[i+1] + " Balance " + balanceArray.get(i));
        }
        arraySolution.add("Total expense  " + String.format("%.2f", totalExpense));
        arraySolution.add("Average expense  " + String.format("%.2f", averageExpense));
        return String.join("\\r\\n" ,arraySolution);
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
