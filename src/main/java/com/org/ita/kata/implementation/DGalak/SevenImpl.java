package com.org.ita.kata.implementation.DGalak;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double summArr;
        double counter = 0;
        for (double e : arr) {
            counter += e;
        }
        summArr = (navg * (arr.length + 1)) - counter;
        if (summArr <= 0) {
            throw new IllegalArgumentException();
        }
        return (long) (Math.ceil(summArr));
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
