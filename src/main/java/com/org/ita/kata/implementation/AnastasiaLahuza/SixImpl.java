package com.org.ita.kata.implementation.AnastasiaLahuza;

import com.org.ita.kata.Six;

import java.util.ArrayList;
import java.util.List;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        return null;}

    @Override
    public double f(double x) {return 0;}

    public static List<Double> dataToList(String town, String data){
        List <Double> getRainfalls = new ArrayList<>();
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
    public double mean(String town, String strng) {
        double averageRainfall;
        List<Double> getRainfalls = dataToList(town, strng);
        if (getRainfalls.isEmpty()) {
            getRainfalls.add(-1.0);}
        System.out.println(getRainfalls);

        double sum =0;
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
        double squaresum=0;

        for (double a:getRainfalls){
            squaresum+= (a-averageRainfall)*(a-averageRainfall);
        }
        double varianceRainfall=squaresum/getRainfalls.size();
        return varianceRainfall;
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
