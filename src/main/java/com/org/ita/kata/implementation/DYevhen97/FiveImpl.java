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
