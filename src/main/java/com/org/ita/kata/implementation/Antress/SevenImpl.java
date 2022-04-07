package com.org.ita.kata.implementation.Antress;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        // your code
        double sum = 0;
        long result = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        result = (long) (Math.ceil((navg * (arr.length + 1))-sum));
        if (result <= 0){
            throw new IllegalArgumentException();
        }
        return result;
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
