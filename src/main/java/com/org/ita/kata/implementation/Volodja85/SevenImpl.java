package com.org.ita.kata.implementation.Volodja85;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum;
        double count = 0D;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        sum = (navg * (arr.length + 1)) - count;
        if(sum <= 0 ){
            throw new IllegalArgumentException();
        }
        return (long)(Math.ceil(sum));
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
