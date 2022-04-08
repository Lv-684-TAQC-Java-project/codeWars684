package com.org.ita.kata.implementation.AnastasiaLahuza;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        ArrayList<Long> prime=new ArrayList<>();

        for (long i = m; i < n; i++) {
            if (isPrime(i)) {
                prime.add(i);
            }

            for (int j=0; j<prime.size()-1; j++){
                if (prime.get(j+1)-prime.get(j)==g){
                    return new long[]{prime.get(j), prime.get(j+1)};
                }
            }
        }
        return null;
    }

    private static boolean isPrime(long i) {
        for (long j = 2; j < i / 2; j++) {
            if (i % j == 0){
                return false;
            }
        }
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
