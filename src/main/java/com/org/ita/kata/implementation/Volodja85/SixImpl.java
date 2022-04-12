package com.org.ita.kata.implementation.Volodja85;

import com.org.ita.kata.Six;

import java.util.HashMap;
import java.util.Map;

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

        return x/(Math.sqrt(1+x) + 1);
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

        Map<String, Integer> map = new HashMap<String, Integer>();
        StringBuffer sb = new StringBuffer();
        String result = null;
        int sum1 = 0;
        int sum2 = 0;
        String A = null;
        String B = null;
        int iLenght = lstOf1stLetter.length;
        int[] array1 = new int[iLenght];
        if(lstOfArt.length==0||lstOf1stLetter.length==0)return "";
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
