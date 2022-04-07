package com.org.ita.kata.implementation.Volodja85;

import com.org.ita.kata.Five;
import java.util.*;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {

        List<Long> gapList=new ArrayList<>();
        long last = 0L;
        for (long i = m; i < n; i++) {
            if (isPrime(i)) {
                gapList.add((long) i);
            }
            for (int j=0; j<gapList.size(); j++){
                if (gapList.get(j) - last == g) {
                    return new long[]{last, gapList.get(j)};
                }
                last = gapList.get(j);
            }
        }
        return null;
    }
    private static boolean isPrime(long i) {
        for (long j = 2; j < i / 2; j++) {
            if (i % j == 0){
                return false;
            }}
        return true;
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
