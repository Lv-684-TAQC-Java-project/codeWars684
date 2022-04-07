package com.org.ita.kata.implementation.Antress;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

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
        // your code
        BigInteger previous = BigInteger.valueOf(1);
        BigInteger next = BigInteger.valueOf(0);
        BigInteger common = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);

        Set<BigInteger> setForSum = new HashSet<>();
        for (BigInteger bi = BigInteger.ZERO; bi.compareTo(n) == -1; bi = bi.add(BigInteger.ONE)) {
            if (bi == BigInteger.ZERO) {
                next = previous.add(common);
                setForSum.add(previous);
            } else {
                common = next;
                next = common.add(previous);
                setForSum.add(common);
                previous = common;

            }
        }
        for (BigInteger sumList : setForSum){
            sum = sum.add(sumList);
        }

        sum = (sum.add(BigInteger.ONE)).multiply(BigInteger.valueOf(4));
        return sum;
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
