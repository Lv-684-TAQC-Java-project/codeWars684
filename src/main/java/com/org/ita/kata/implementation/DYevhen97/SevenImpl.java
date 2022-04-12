package com.org.ita.kata.implementation.DYevhen97;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (double number : arr) {
            sum += number;
        }

        long res = (long) Math.ceil(navg * (arr.length + 1) - sum);
        if (res <= 0)
            throw new IllegalArgumentException();
        else
            return res;
    }

    @Override
    public String seriesSum(int n) {
        float result = 1.0f;
        float baseNum = 1.0f;
        if (n <= 0) result = 0;
        else {
            for (int i = 1; i < n; i++) {
                baseNum = baseNum + 3;
                result += 1.0 / baseNum;
            }
        }
        return String.format("%.2f", result);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        int lastValidBef = p - bef;
        int lastValidAft = aft + 1;
        return Math.min(lastValidBef, lastValidAft);
    }
}
