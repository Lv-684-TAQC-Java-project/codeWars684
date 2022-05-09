package com.org.ita.kata.implementation.DYevhen97;

import com.org.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        int n = v.length;
        int maxWateredPlains = 0;
        int[] resultLeftFlow = new int[v.length];
        int[] resultRightFlow = new int[v.length];

        if (v.length == 1) {
            return 1;
        }

        if (v.length == 2) {
            return 2;
        }

        for (int i = 1; i < v.length; i++) {
            if (v[i - 1] <= v[i]) {
                resultLeftFlow[i] = resultLeftFlow[i - 1] + 1;
            } else {
                resultLeftFlow[i] = 0;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (v[i + 1] <= v[i]) {
                resultRightFlow[i] = resultRightFlow[i + 1] + 1;
            } else {
                resultRightFlow[i] = 0;
            }
        }

        for (int i = 0; i < v.length; i++) {
            maxWateredPlains = Math.max(resultLeftFlow[i] + resultRightFlow[i] + 1, maxWateredPlains);
        }

        return maxWateredPlains;
    }
    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;

        for(int i = 0; i <= n.intValue(); i++) {
            a = b;
            b = c;
            c = a.add(b);
            sum = sum.add(a);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {
        return (2 * m + 1 - java.lang.Math.sqrt(4 * m + 1)) / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
        assert n >= 0;
        String s = "" + n;
        final int numDigits = s.length();

        String smallest = s;
        long smallesti = 0;
        long smallestj = 0;

        for (int i = 0; i < numDigits; i++) {
            for (int j = 0; j < numDigits; j++) {
                if (i == j) continue;
                String s2 = s.substring(0,i) + s.substring(i+1);
                s2 = s2.substring(0,j) + s.charAt(i) + s2.substring(j);
                if (smallest.compareTo(s2) > 0) {
                    smallest = s2;
                    smallesti = i;
                    smallestj = j;
                }
            }
        }
        return new long[]{Long.parseLong(smallest), smallesti, smallestj};
    }
}
