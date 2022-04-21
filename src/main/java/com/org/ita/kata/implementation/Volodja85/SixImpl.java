package com.org.ita.kata.implementation.Volodja85;

import com.org.ita.kata.Six;

import java.util.HashMap;
import java.util.Map;

public class SixImpl implements Six {
    private static String[] transToTeamsOne(String s) {
        String nameOneTeam = "";
        String pointOneTeam = null;
        String nameTwoTeam = "";
        String pointTwoTeam = null;
        int count = -1;
        String[] strs = s.split(" ");
        for (int i = 0; i < strs.length; i++) {

            if (strs[i].matches("[A-Za-z0-9.]+")) {
                nameOneTeam = nameOneTeam + " " + (strs[i]);

                count = i;
            }
            if (strs[i].matches("[0-9.]+")) {
                pointOneTeam = strs[i];

                count++;
                break;
            }

        }

        for (int i = count; i < strs.length; i++) {
            if (strs[i].matches("[A-Za-z0-9.]+")) {
                nameTwoTeam = nameTwoTeam + " " + (strs[i]);
                count++;

            }
            if (strs[i].matches("[0-9.]+")) {
                pointTwoTeam = strs[i];

                break;
            }
        }

        return new String[]{nameOneTeam.replace(pointOneTeam, "").trim(), pointOneTeam.trim(),
                nameTwoTeam.replace(pointTwoTeam, "").trim(), pointTwoTeam.trim()};

    }

    @Override
    public long findNb(long m) {

        long sum = 0;
        long count = 0;
        while (sum < m) {
            count++;
            sum = sum + (long) (Math.pow(count, 3));
        }
        if (sum == m) {
            return count;
        }
        return -1;
    }

    @Override
    public String balance(String book) {

        double totalExpense = 0.0;
        double averageExpense = 0.0;
        double sum = 0D;
        double round = Math.pow(10, 2);
        double expence = 0D;
        String[] expenseList = null;

        String[] recipe = book.replaceAll("[^.a-zA-Z0-9\n ]", "").split("\n");
        String newBook = recipe[0].trim() + "\\r\\n";

        for (int i = 1; i < recipe.length; i++) {
            expenseList = recipe[i].replaceAll("[\\s]{2,}", " ").split(" ");
            sum += Double.parseDouble(expenseList[2]);
            expence = (Double.parseDouble(recipe[0]) - sum);
            recipe[i] = recipe[i] + " Balance " + String.format("%.2f", expence).replace(",", ".");
            newBook += recipe[i].replaceAll("[\\s]{2,}", " ") + "\\r\\n";
            newBook.replaceAll(",", ".");
            totalExpense = (double) Math.round(sum * round) / round;
            averageExpense = totalExpense / (recipe.length - 1);
        }
        newBook = "Original Balance: " + newBook + "Total expense  " + String.format("%.2f", totalExpense).replace(",", ".") + "\\r\\n" + "Average expense  " + String.format("%.2f", averageExpense).replace(",", ".");
        return newBook;
    }

    @Override
    public double f(double x) {

        return x / (Math.sqrt(1 + x) + 1);
    }

    @Override
    public double mean(String town, String strng) {

        try {
            String[] search = strng.split("\n");
            String strTown = " ";
            double sum = 0;
            for (String searching : search) {
                if (searching.contains(town + ":")) {
                    strTown = searching;
                }
                if (town.equals("")) {
                    return -1;

                }
            }
            if (strTown.isEmpty() || strTown.equals("")) {
                return -1;
            }
            strTown = strTown.replaceAll("[^0-9.,]", "");


            String[] cityData = strTown.split(",");
            for (int i = 0; i < cityData.length; i++) {
                sum += Double.valueOf(String.valueOf(cityData[i]));
            }
            return sum / cityData.length;
        } catch (NumberFormatException e) {
            e.fillInStackTrace();
            e.getMessage();
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public double variance(String town, String strng) {

        try {
            double meanValue = mean(town, strng);
            String[] search = strng.split("\n");
            String strTown = " ";
            double sum = 0;
            for (String searching : search) {
                if (searching.contains(town + ":")) {
                    strTown = searching;
                }

            }
            if (strTown.isEmpty() || strTown.equals("")) {
                return -1;
            }
            strTown = strTown.replaceAll("[^0-9.,]", "");

            String[] cityData = strTown.split(",");
            for (int i = 0; i < cityData.length; i++) {
                double varianceDouble = Double.valueOf(String.valueOf(cityData[i]));
                double diff = varianceDouble - meanValue;
                sum = sum + diff * diff;
            }
            return sum / cityData.length;

        } catch (NumberFormatException e) {
            e.fillInStackTrace();
            e.getMessage();
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {

        if (toFind.equals(""))
            return "";
        if (toFind.trim().length() == 0) {
            return "";
        }
        int win = 0, draw = 0, loss = 0, score = 0, conceded = 0, points = 0, find = 0;
        double p1, p2;
        String[] games = resultSheet.split(",");

        for (int i = 0; i < games.length; i++) {
            String[] map = transToTeamsOne(games[i]);
            if (map.length == 0) {
                return "Error(float number):" + games[i];
            }

            p1 = Double.parseDouble(map[1]);
            p2 = Double.parseDouble(map[3]);

            if (p1 % 1 != 0 || p2 % 1 != 0) {
                return "Error(float number):" + games[i];
            }
            if (map[0].equals(toFind)) {

                find++;
                score += p1;
                conceded += p2;
                if (p1 > p2) {
                    win++;
                    points += 3;
                } else if (p1 == p2) {
                    draw++;
                    points += 1;
                } else {
                    loss++;
                }
            } else if (map[2].equals(toFind)) {
                find++;
                score += p2;
                conceded += p1;
                if (p1 > p2) {
                    loss++;
                } else if (p1 == p2) {
                    draw++;
                    points += 1;
                } else {
                    win++;
                    points += 3;
                }
            }
        }
        if (find == 0) {
            return toFind + ":This team didn't play!";
        }

        return String.format("%s:W=%d;D=%d;L=%d;Scored=%d;Conceded=%d;Points=%d",
                toFind, win, draw, loss, score, conceded, points);
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

        Map<String, Integer> map = new HashMap<String, Integer>();
        StringBuffer sb = new StringBuffer();
        String result = null;
        int sum1 = 0;
        int sum2 = 0;
        String A = null;
        String B = null;
        int iLenght = lstOf1stLetter.length;
        int[] array1 = new int[iLenght];
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) return "";
        for (int i = 0; i < lstOfArt.length; i++) {
            A = lstOfArt[i];
            String[] recipe = A.split(" ");
            B = recipe[0];
            String[] recipe2 = B.split("");
            int num = Integer.parseInt(String.valueOf(recipe[1]));
            if (map.containsKey(recipe2[0])) {
                num += map.get(recipe2[0]);
            }
            map.put(recipe2[0], num);
        }
        for (String s : lstOf1stLetter) {
            if (map.get(s) == null) {
                sb.append("(" + s + " : " + 0 + ") - ");
            } else sb.append("(" + s + " : " + map.get(s) + ") - ");
        }
        return sb.toString().substring(0, sb.length() - 3);
    }
}
