package com.org.ita.kata.implementation.maka155;

import com.org.ita.kata.Seven;

import static java.lang.String.format;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        long nAvg = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        nAvg = (long) Math.ceil((navg * (arr.length + 1)) - sum);

        if (nAvg <= 0) {
            throw new IllegalArgumentException();
        }
        return nAvg;
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0.00;
        if (n != 0) {
            for (int j = 0; j < n; j++) {
                sum += 1.00 / (double) (1 + j * 3);
            }
            sum = Math.round(sum * 100) / 100D;
        }
        return String.valueOf(format("%.2f", sum));
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        int count = 0;
        int a = 0;
        int b = 0;
        for (int i = 1; i <= p; i++) {
            a = i - 1;
            b = p - i;
            if (a >= bef && b <= aft) {
                count++;
            }
        }
        return count;
    }
}
