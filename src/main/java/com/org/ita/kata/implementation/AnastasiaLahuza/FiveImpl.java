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
        return (1 - Math.sqrt(4 * m + 1)) / (2.0 * m) + 1;
    }

    @Override
    public long[] smallest(long n) {
        long min = n;
        int index1 = 0;
        int index2 = 0;
        String number = String.valueOf(n);
        for (int i=0; i<number.length(); i++) {
            for (int j=0; j<number.length(); j++) {
                if (i!=j && making(number, i, j) < min) {
                    min = making(number, i, j);
                    index1 = i;
                    index2 = j;
                }
            }
        }
        return new long[]{min, index1, index2};
    }

    public static long making(String s, int i, int j) {
        StringBuilder sb = new StringBuilder(s);
        char c = sb.charAt(i);
        sb.deleteCharAt(i);
        sb.insert(j, c);

        return Long.valueOf(sb.toString());
    }
}
