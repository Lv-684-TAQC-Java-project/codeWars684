package com.org.ita.kata.implementation.DGalak;

import com.org.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        int trailingZeroNumber = 0;
        double divisionResult = Math.floor(n / 5);
        while (divisionResult > 0) {
            if (Double.toString(divisionResult).length() >= 2) {
                trailingZeroNumber += divisionResult;
                divisionResult = Math.floor(divisionResult / 5);
            } else {
                trailingZeroNumber += Math.floor(n / 5);
            }
        }
        return trailingZeroNumber;
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
