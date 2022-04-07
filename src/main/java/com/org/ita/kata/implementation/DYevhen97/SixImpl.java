package com.org.ita.kata.implementation.DYevhen97;

import com.org.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        long mm = 0;
        long n = 0;
        while(mm < m){
            n = n + 1;
            mm = mm + n * n * n;
        }
        if(mm == m){
            return n;
        }
        return -1;
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
