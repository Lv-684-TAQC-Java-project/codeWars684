package com.org.ita.kata.implementation.AnastasiaLahuza;

import com.org.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        //Zамінюємо все крім цифр, літер, крапок та будь-чого позначаючого пробіли
        book = book.replaceAll(
                "[^A-Za-z0-9.\\s]", " ");
        String[] recipe = book.split("\\n");//розділяємо строку по пробілу та пишемо в массив
        String newBook = recipe[0].trim()+"\\r\\n";
        double round = Math.pow(10,2);
        double sum = 0;
        for (int i=1; i<recipe.length; i++){
            String[] expenseList = recipe[i].replaceAll("[\\s]{2,}", " ").split(" ");
            //System.out.println(expenseList[2]);
            sum+=Double.parseDouble(expenseList[2]);//знаходимо сумму витрат
            double expense =(Double.parseDouble(recipe[0])-sum);
            //double expense = Double.parseDouble(recipe[0])-sum;
            //System.out.println(expense);
            recipe[i] = recipe[i] + " Balance " + String.format("%.2f", expense);
            newBook+=recipe[i].replaceAll("[\\s]{2,}", " ")+"\\r\\n";
            // System.out.println(recipe[i]);
        }
        //Загальні витрати
        double totalExpense = Math.round(sum*round)/round;
        //Delta витрат
        double averageExpense = totalExpense/(recipe.length-1);

        newBook = "Original Balance: " + newBook + "Total expense  " +String.format("%.2f",  totalExpense) + "\\r\\n" +"Average expense  " + String.format("%.2f", averageExpense);

        return newBook;

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
        return null;
    }
}
