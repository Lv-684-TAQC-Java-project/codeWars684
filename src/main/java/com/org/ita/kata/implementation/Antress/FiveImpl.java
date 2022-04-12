package com.org.ita.kata.implementation.Antress;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        // your code here
        int left = 0;
        int area = 0;
        int record = 1;

        for(int i = 1; i < v.length; i++){
            if(v[i] < v[i - 1]) left = i;
            else if(v[i] > v[i-1]){
                area = area > record? area : record;
                record = i - left;
            }
            record++;
        }
        return area > record? area : record;
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
            if (arr[i + 1] - arr[i] == g) {
                result = new long[2];
                result[0] = arr[i];
                result[1] = arr[i + 1];
                break;
            } else {
                result = null;
            }
        }
        return result;
    }

    @Override
    public int zeros(int n) {
        // your beatiful code here
        if (n < 0)
            return -1;
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;

        return count;
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
        for (BigInteger sumList : setForSum) {
            sum = sum.add(sumList);
        }

        sum = (sum.add(BigInteger.ONE)).multiply(BigInteger.valueOf(4));
        return sum;
    }

    @Override
    public double solveSum(double m) {
        double x = Math.sqrt(4 * m + 1);
        return (2 * m + 1 - x) / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
