package com.org.ita.kata.implementation.Volodja85;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {

        int count = 1;
        double sum = 1;
        if (n == 0){
            return "0.00";
        }
        for(int i = 1; i < n; i++){
            count += 3;
            sum += (double)1/count;
        }
        String result = String.format("%.2f", sum);
        return result;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
