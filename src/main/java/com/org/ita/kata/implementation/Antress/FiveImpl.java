package com.org.ita.kata.implementation.Antress;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        // your code
        long firstGap = 0;
        long secondGap = 0;
        long count = 0;
        long[] result = new long[0];
        List<Long> list = new ArrayList<>();

        for (long i = m; i < n; i++) {
            BigInteger firstInteger = BigInteger.valueOf(i);
            count = i;
            if (firstInteger.isProbablePrime((int) Math.log(i))) {
                list.add(i);
            }
        }
        Long[] arr = new Long[list.size()];
        arr = list.toArray(arr);

        for (int i = 0; i < list.size() - 1; i++) {
            if (arr[i+1]-arr[i]==g){
                result = new long[2];
                result[0] = arr[i];
                result[1] = arr[i+1];
                break;
            }else{
                result = null;
            }
        }
        return result;
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
