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
        if (sum <= 0) {
            throw new IllegalArgumentException();
        }
        return (long) (Math.ceil(sum));
    }

    @Override
    public String seriesSum(int n) {

        int count = 1;
        double sum = 1;
        if (n == 0) {
            return "0.00";
        }
        for (int i = 1; i < n; i++) {
            count += 3;
            sum += (double) 1 / count;
        }
        String result = String.format("%.2f", sum);
        return result;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {

        return p - Math.max(bef + 1, p - aft) + 1;
    }
}
