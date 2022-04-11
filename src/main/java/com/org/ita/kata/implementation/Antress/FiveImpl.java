package com.org.ita.kata.implementation.Antress;

import com.org.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        // your code here
        int result = 0;
        int maxValue = 0;
        int count = 0;
        for(int i = 0; i < v.length ; i++){
            if(v[i]>maxValue){
                maxValue=v[i];
            }
        }

        for(int i = 0 ; i < v.length ; i++){
            if(v[i]<maxValue){
                result++;
            }
        }
        if (v.length == 1){
            result = 1;
        }
        return result;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return null;
    }

    @Override
    public double solveSum(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
