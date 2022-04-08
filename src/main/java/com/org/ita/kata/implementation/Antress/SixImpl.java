package com.org.ita.kata.implementation.Antress;

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
        return 0.1;
    }

    @Override
    public double variance(String town, String strng) {
        return 0.1;
    }
    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        String letterMemory ;
        String artMemory;
        String quantity;
        int sum = 0;
        int [] sumOfCategory = new int[lstOf1stLetter.length];

        for (int i = 0 ; i < lstOf1stLetter.length;i++){
            letterMemory =  lstOf1stLetter[i];
            for (int j = 0 ; j < lstOfArt.length;j++){
                artMemory = Character.toString(lstOfArt[j].charAt(0));
                if(letterMemory.equals(artMemory)){
                    quantity = lstOfArt[j].replaceAll("[^0-9]","");
                    sumOfCategory[i] += Integer.parseInt(quantity);
                }
            }
        }
        String result  = "";
        for (int i = 0 ; i < lstOf1stLetter.length; i++) {
            if (lstOfArt.length == 0 || lstOf1stLetter.length == 0 ){
            }else if (i<lstOf1stLetter.length-1){
                result = result + "(" + lstOf1stLetter[i] + " : " + sumOfCategory[i] + ")" + " - ";
            }else{
                result = result + "(" + lstOf1stLetter[i] + " : " + sumOfCategory[i] + ")";
            }
        }

        return result;
    }
}
