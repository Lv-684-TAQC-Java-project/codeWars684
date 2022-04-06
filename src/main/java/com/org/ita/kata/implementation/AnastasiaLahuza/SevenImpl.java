package com.org.ita.kata.implementation.AnastasiaLahuza;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        double dodanok;
        int znam = 1;
        double sum=0;
        for(int i=0; i<n-1; i++){
            znam = znam+3;
            System.out.println(znam);
            dodanok =(double)(1)/znam;
            System.out.println(dodanok);
            sum +=dodanok;
        }

        double res = sum+1;
        String result = String.format("%.2f", res);

        return result;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
