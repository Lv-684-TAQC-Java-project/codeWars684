package com.org.ita.kata.implementation.AnastasiaLahuza;

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
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger nextNum = BigInteger.ONE;
        BigInteger previousNum = BigInteger.ZERO;
        BigInteger square = BigInteger.ZERO;

        for (BigInteger i = BigInteger.ZERO; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            nextNum = nextNum.add(previousNum);
            previousNum = nextNum.subtract(previousNum);
            square = square.add(BigInteger.valueOf(4).multiply(previousNum));
        }

        return square;
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
