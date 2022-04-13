package com.org.ita.kata.implementation.AnastasiaLahuza;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;

public class FiveImpl implements Five {
    private static boolean isPrime(long i) {
        for (long j = 2; j < i / 2; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static long making(String s, int i, int j) {
        StringBuilder sb = new StringBuilder(s);
        char c = sb.charAt(i);
        sb.deleteCharAt(i);
        sb.insert(j, c);

        return Long.valueOf(sb.toString());
    }

    @Override
    public int artificialRain(int[] v) {
        int[] flowRight = FiveImpl.computeRightFlow(v);
        int[] flowLeft = FiveImpl.computeLeftFlow(v);

        int maxWateredPlains = 0;

        for (int i = 0; i < flowLeft.length; i++) {
            maxWateredPlains = Math.max(flowLeft[i] + flowRight[i] + 1, maxWateredPlains);
        }
        return maxWateredPlains;
    }

    static boolean canFlowLeft(int[] numbers, int i) {
        if (i == 0)
            return false;
        return numbers[i - 1] <= numbers[i];
    }

    static boolean canFlowRight(int[] numbers, int i) {
        if (numbers.length - 1 == i)
            return false;
        return numbers[i + 1] <= numbers[i];
    }


    static int[] computeLeftFlow(int[] numbers) {
        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (canFlowLeft(numbers, i)) {
                result[i] = result[i - 1] + 1;
            } else {
                result[i] = 0;
            }
        }
        return result;
    }

    static int[] computeRightFlow(int[] numbers) {
        int[] result = new int[numbers.length];

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (canFlowRight(numbers, i)) {
                result[i] = result[i + 1] + 1;
            } else {
                result[i] = 0;
            }
        }
        return result;
    }


    @Override
    public long[] gap(int g, long m, long n) {
        ArrayList<Long> prime = new ArrayList<>();

        for (long i = m; i < n; i++) {
            if (isPrime(i)) {
                prime.add(i);
            }

            for (int j = 0; j < prime.size() - 1; j++) {
                if (prime.get(j + 1) - prime.get(j) == g) {
                    return new long[]{prime.get(j), prime.get(j + 1)};
                }
            }
        }
        return null;
    }

    @Override
    public int zeros(int n) {
        int count=0;
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
        return (1 - Math.sqrt(4 * m + 1)) / (2.0 * m) + 1;
    }

    @Override
    public long[] smallest(long n) {
        long min = n;
        int index1 = 0;
        int index2 = 0;
        String number = String.valueOf(n);
        for (int i = 0; i < number.length(); i++) {
            for (int j = 0; j < number.length(); j++) {
                if (i != j && making(number, i, j) < min) {
                    min = making(number, i, j);
                    index1 = i;
                    index2 = j;
                }
            }
        }
        return new long[]{min, index1, index2};
    }
}
