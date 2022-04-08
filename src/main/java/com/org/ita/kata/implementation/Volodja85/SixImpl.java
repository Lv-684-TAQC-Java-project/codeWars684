package com.org.ita.kata.implementation.Volodja85;

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
        return 0;
    }

    @Override
    public double mean(String town, String strng) {

        try{
            String[] search = strng.split("\n");
            String strTown = " ";
            double sum=0;
            for(String searching : search){
                if (searching.contains(town + ":")){
                    strTown = searching;
                }
                if(town.equals("")) {
                    return -1;

                }
            }
            if (strTown.isEmpty()||strTown.equals("")){
                return -1;}
            strTown = strTown.replaceAll("[^0-9.,]", "");


            String[] cityData = strTown.split(",");
            for (int i=0; i<cityData.length; i++) {
                sum += Double.valueOf(String.valueOf(cityData[i]));
            }
            return sum / cityData.length;
        }
        catch (NumberFormatException e){
            e.fillInStackTrace();
            e.getMessage();
            e.printStackTrace();
        }return -1;
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
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
