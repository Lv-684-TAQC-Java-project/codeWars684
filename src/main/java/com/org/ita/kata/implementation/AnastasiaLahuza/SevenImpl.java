package com.org.ita.kata.implementation.AnastasiaLahuza;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum=0;
        for (double a:
                arr) {
            sum += a;
        }

        double amount = (-sum + navg*(arr.length+1));
        if (amount<=0){
            throw new IllegalArgumentException();
        }

        long a= (long) Math.ceil(amount);
        return a;
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
