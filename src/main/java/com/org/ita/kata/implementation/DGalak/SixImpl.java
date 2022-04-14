package com.org.ita.kata.implementation.DGalak;

import com.org.ita.kata.Six;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SixImpl implements Six {
    public static List<Double> getValues(String city, String data) {
        System.out.println("counn data  " + data);
        System.out.println("City   " + city);
        List<Double> arrayData = new ArrayList<Double>();
        String[] dataByCity = data.split("\\n");
        for (int i = 0; i < dataByCity.length; i++) {
            if (dataByCity[i].split(":")[0].equals(city)) {
                String regex = "([0-9]+[.][0-9]+)";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(dataByCity[i]);
                while (matcher.find()) {
                    arrayData.add(Double.valueOf(matcher.group()));
                }
            }
        }
        if (arrayData.isEmpty()) {
            arrayData.add(-1.0);
        }
        return arrayData;
    }

    @Override
    public long findNb(long m) {
        long counter = 0L;
        long side = 1L;
        while (m != 0) {
            m = m - (side * side * side);
            side++;
            counter++;
            if (m < 0) {
                return -1;
            }
        }
        return counter;
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
        balanceArray.add(String.format("%.2f", firstBalanceValue));
        for (int i = 2; i < productExpensesArray.size(); i++) {
            balanceCount = balanceCount - Double.parseDouble(productExpensesArray.get(i));
            balanceArray.add(String.format("%.2f", balanceCount));
        }
        ArrayList<String> arraySolution = new ArrayList<String>();
        arraySolution.add("Original Balance: " + productExpensesArray.get(0));
        for (int i = 0; i < balanceArray.size(); i++) {
            arraySolution.add(receipt[i + 1] + " Balance " + balanceArray.get(i));
        }
        arraySolution.add("Total expense  " + String.format("%.2f", totalExpense));
        arraySolution.add("Average expense  " + String.format("%.2f", averageExpense));
        return String.join("\\r\\n", arraySolution);
    }

    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        List<Double> arrayRainFall = new ArrayList<Double>();
        arrayRainFall = getValues(town, strng);
        double counter = 0;
        for (int i = 0; i < arrayRainFall.size(); i++) {
            counter = counter + arrayRainFall.get(i);
        }
        if (arrayRainFall.get(0) == -1.0) {
            return -1.0;
        }
        return (counter / arrayRainFall.size());
    }

    @Override
    public double variance(String town, String strng) {
        List<Double> arrayRainFallVariance = new ArrayList<Double>();
        List<Double> arrayResultVariance = new ArrayList<Double>();
        arrayRainFallVariance = getValues(town, strng);
        double meanValue = mean(town, strng);
        for (int i = 0; i < arrayRainFallVariance.size(); i++) {
            arrayResultVariance.add(Math.pow((arrayRainFallVariance.get(i) - meanValue), 2));
        }
        double counter = 0;
        for (int i = 0; i < arrayResultVariance.size(); i++) {
            counter = counter + arrayResultVariance.get(i);
        }
        if (meanValue == -1.0) {
            return -1.0;
        }
        return (counter / arrayResultVariance.size());
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {

        List<String> playedMatches = Arrays.stream(resultSheet.split(",")).filter(x -> x.contains(toFind + " ")).collect(Collectors.toList());
        if (toFind.isEmpty()) {
            return "";
        }
        if (playedMatches.isEmpty()) {
            return toFind + ":This team didn't play!";
        }
        List<String[]> competitorTeams = new ArrayList<String[]>();

        for (int i = 0; i < playedMatches.size(); i++) {
            competitorTeams.add(Arrays.stream(playedMatches.get(i).replaceAll("\\b\\d+\\b", "").split("  ")).map(el -> el.trim()).toArray(String[]::new));
        }

        List<Integer[]> teamScoresValues = new ArrayList<Integer[]>();
        for (int i = 0; i < playedMatches.size(); i++) {
            teamScoresValues.add(Arrays.stream(playedMatches.get(i).split(" ")).filter(el -> el.matches("\\d+")).map(el -> Integer.valueOf(el)).toArray(Integer[]::new));
        }
        int wins = 0;
        int draws = 0;
        int lose = 0;
        int scored = 0;
        int conceded = 0;
        int points = 0;
        for (int i = 0; i < competitorTeams.size(); i++) {
            try {
                boolean draw = teamScoresValues.get(i)[0] == teamScoresValues.get(i)[1];
            } catch (ArrayIndexOutOfBoundsException e) {
                return "Error(float number):" + playedMatches.get(i);
            }
            boolean teamFirst = competitorTeams.get(i)[0].equals(toFind);
            if (teamFirst) {
                scored += teamScoresValues.get(i)[0];
                conceded += teamScoresValues.get(i)[1];
            } else {
                scored += teamScoresValues.get(i)[1];
                conceded += teamScoresValues.get(i)[0];
            }
            if (teamScoresValues.get(i)[0] == teamScoresValues.get(i)[1]) {
                draws++;
                points++;
            } else if (teamScoresValues.get(i)[0] < teamScoresValues.get(i)[1]) {
                if (teamFirst) {
                    lose++;
                } else {
                    wins++;
                    points += 3;
                }
            } else {
                if (teamFirst) {
                    wins++;
                    points += 3;
                } else {
                    lose++;
                }
            }
        }
        return String.format(toFind + ":W=%s;D=%s;L=%s;Scored=%s;Conceded=%s;Points=%s",
                wins, draws, lose, scored, conceded, points);
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
