package com.org.ita.kata.implementation.DGalak;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.org.ita.kata.Six;

public class SixImpl implements Six {
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
        return null;
    }

    @Override
    public double f(double x) {
        return 0;
    }

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
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
