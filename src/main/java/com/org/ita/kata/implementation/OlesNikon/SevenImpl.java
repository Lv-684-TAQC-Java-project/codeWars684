package com.org.ita.kata.implementation.OlesNikon;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (double number : arr) {
            sum += number;
        }
        long result = (long) Math.ceil(navg * (arr.length + 1) - sum);
        if (result <= 0) {
            throw new IllegalArgumentException();
        }
        else {
            return result;
        }
    }

    @Override
    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
