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
        // Happy Coding ^_^
        double rise = 3;
        double sum = 0;
        double grow = 0;
        String result = "0.00";

        if (n > 0) {
            for (int i = 0 , j = 1; i < n; i++) {
                if (i == 0) {
                    sum = 1;
                } else if (i == 1) {
                    sum = sum + 0.25;
                    grow = 4;
                } else {
                    sum += (1 / (grow + rise * j));
                    j++;
                }
            }
            result = String.format("%.2f",sum);
        }
        return result;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return Math.min(p - bef, aft + 1);
    }
}
