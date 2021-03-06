package com.org.ita.kata.implementation.AnastasiaLahuza;

import com.org.ita.kata.Six;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SixImpl implements Six {
    public static List<Double> dataToList(String town, String data) {
        List<Double> getRainfalls = new ArrayList<>();
        for (String line : data.split("\\n")) {
            String[] isTown = line.split(":");
            if (town.equals(isTown[0])) {
                for (String weather : isTown[1].split(",")) {
                    String[] temp = weather.split("\\s");
                    getRainfalls.add(Double.parseDouble(temp[1]));
                }
            }
        }
        return getRainfalls;
    }

    @Override
    public long findNb(long m) {
        long sque = 0;
        long n = 0;
        while (sque < m) {
            n = n + 1;
            sque = sque + n * n * n;
        }
        if (sque == m) {
            return n;
        }
        return -1;
    }

    @Override
    public String balance(String book) {
        book = book.replaceAll(
                "[^A-Za-z0-9.\\s]", " ");
        String[] recipe = book.split("\\n");
        String newBook = recipe[0].trim() + "\\r\\n";
        double round = Math.pow(10, 2);
        double sum = 0;
        for (int i = 1; i < recipe.length; i++) {
            String[] expenseList = recipe[i].replaceAll("[\\s]{2,}", " ").split(" ");
            sum += Double.parseDouble(expenseList[2]);
            double expense = (Double.parseDouble(recipe[0]) - sum);
            recipe[i] = recipe[i] + " Balance " + String.format("%.2f", expense);
            newBook += recipe[i].replaceAll("[\\s]{2,}", " ") + "\\r\\n";

        }
        double totalExpense = Math.round(sum * round) / round;
        double averageExpense = totalExpense / (recipe.length - 1);

        newBook = "Original Balance: " + newBook + "Total expense  " + String.format("%.2f", totalExpense) + "\\r\\n" + "Average expense  " + String.format("%.2f", averageExpense);

        return newBook;

    }

    @Override
    public double f(double x) {
        return x / (1.0 + Math.sqrt(1.0 + x));
    }

    @Override
    public double mean(String town, String strng) {
        double averageRainfall;
        List<Double> getRainfalls = dataToList(town, strng);
        if (getRainfalls.isEmpty()) {
            getRainfalls.add(-1.0);
        }
        System.out.println(getRainfalls);

        double sum = 0;
        for (double a : getRainfalls) {
            sum += a;
        }
        averageRainfall = sum / getRainfalls.size();
        return averageRainfall;
    }

    @Override
    public double variance(String town, String strng) {
        double mean = mean(town, strng);
        if (mean == -1.0) return -1.0;
        double averageRainfall = mean(town, strng);
        List<Double> getRainfalls = dataToList(town, strng);
        double squaresum = 0;

        for (double a : getRainfalls) {
            squaresum += (a - averageRainfall) * (a - averageRainfall);
        }
        double varianceRainfall = squaresum / getRainfalls.size();
        return varianceRainfall;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {

        if (resultSheet.isEmpty() || toFind.isEmpty()) {
            return "";
        }

        int winCount = 0;
        int loseCount = 0;
        int drawCount = 0;
        int scoredPointsSum = 0;
        int concededPointsSum = 0;
        int rating = 0;
        String group1 = null;
        String group2 = null;
        String[] rate = resultSheet.split(",");
        for (String s : rate) {
            Pattern p = Pattern.compile("(" + toFind + " [0-9.]{1,7})");
            Matcher m = p.matcher(s);

            if (m.find()) {
                group1 = m.group(1).trim();
                System.out.println(group1);
                group2 = s.replace(group1, "").trim();
                String[] findTeam = group1.split(" ");
                double sc1 = Double.parseDouble(findTeam[findTeam.length - 1]);
                if (sc1 % 1 != 0) {
                    return "Error(float number):" + s;
                }
                int score1 = (int) sc1;
                scoredPointsSum += score1;
                String[] anotherTeam = group2.split(" ");
                double sc2 = Double.parseDouble(anotherTeam[anotherTeam.length - 1]);
                if (sc2 % 1 != 0) {
                    return "Error(float number):" + s;
                }
                int score2 = (int) sc2;
                concededPointsSum += score2;

                if (score1 > score2) {
                    winCount++;
                    rating += 3;
                } else if (score1 < score2) {
                    loseCount++;
                } else {
                    drawCount++;
                    rating += 1;
                }
            }
        }
        String rez;
        if (scoredPointsSum % 1 != 0 || concededPointsSum % 1 != 0) {
            rez = "Error(float number):the concerned string";
        } else if (scoredPointsSum == 0 && concededPointsSum == 0) {
            rez = toFind + ":" + "This team didn't play!";
        } else {
            rez = toFind + ":W=" + winCount + ";D=" + drawCount + ";L=" + loseCount + ";Scored=" + scoredPointsSum + ";Conceded=" + concededPointsSum + ";Points=" + rating;
        }
        return rez;
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
