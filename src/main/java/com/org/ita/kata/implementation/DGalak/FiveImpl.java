package com.org.ita.kata.implementation.DGalak;

import com.org.ita.kata.Five;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class FiveImpl implements Five {
    private static final String leftDirection = "left";
    private static final String rightDirection = "right";
    @Override
      public int artificialRain(int[] v) {
        int[] dataForRight = combineDataDirection(rightDirection, v);
        int[] dataForLeft = combineDataDirection(leftDirection, v);
        int sectionsCounter = 0;
        for (int i = 0; i < dataForRight.length; i++) {
            sectionsCounter = Math.max(1 + dataForRight[i] + dataForLeft[i], sectionsCounter);
        }
        return sectionsCounter;
    }

    static boolean canWaterFlowDirections(String direction, int[] numbers, int i) {
        boolean canFlow = false;
        if (direction.equals(rightDirection)) {
            if (numbers.length - 1 == i)
                return false;
            canFlow = numbers[i + 1] <= numbers[i];
        }
        else if (direction.equals(leftDirection)) {
            if (i == 0)
                return false;
            canFlow = numbers[i - 1] <= numbers[i];
        }
        return canFlow;
    }
    static int[] combineDataDirection(String direction,int[] numbers) {
        int[] dataDirection = new int[numbers.length];
        if (direction.equals(leftDirection)) {
            for (int i = 0; i < numbers.length; i++) {
                if (canWaterFlowDirections(leftDirection, numbers, i)) {
                    dataDirection[i] = dataDirection[i - 1] + 1;
                } else {
                    dataDirection[i] = 0;
                }
            }
        }
        else if (direction.equals(rightDirection)) {
            for (int i = numbers.length - 1; i >= 0; i--) {
                if (canWaterFlowDirections(rightDirection, numbers, i)) {
                    dataDirection[i] = dataDirection[i + 1] + 1;
                } else {
                    dataDirection[i] = 0;
                }
            }
        }
        return dataDirection;
    }

    @Override
    public long[] gap(int g, long m, long n) {

        long[] firstPrimePair = new long[2];
        for (long i = m; i < n + 1; i++) {
            if (isNumberPrime(i) && isNumberPrime(i + g)) {
                firstPrimePair[0] = i;
                firstPrimePair[1] = i + g;
                List<Long> range = LongStream.rangeClosed(firstPrimePair[0] + 1, firstPrimePair[1] - 1)
                        .boxed().collect(Collectors.toList());
                if (range.stream().filter(el -> isNumberPrime(el)).findFirst().isPresent()) {
                    continue;
                }
                return firstPrimePair;
            }
        }
        return null;
    }
    public static boolean isNumberPrime(long number) {
        if (number < 2 || number % 2 == 0) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (int i = 3; i < number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int zeros(int n) {
        int trailingZeroNumber = 0;
        double divisionResult = Math.floor(n / 5);
        while (divisionResult > 0) {
            if (Double.toString(divisionResult).length() >= 2) {
                trailingZeroNumber += divisionResult;
                divisionResult = Math.floor(divisionResult / 5);
            } else {
                trailingZeroNumber += Math.floor(n / 5);
            }
        }
        return trailingZeroNumber;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {

        long longValueOfN = n.longValue();
        BigInteger counter = BigInteger.ONE;
        BigInteger x = BigInteger.ONE;
        BigInteger y = BigInteger.ZERO;
        BigInteger result;
        for (long i = 0; i < longValueOfN; i++) {
            result = x.add(y);
            counter = counter.add(result);
            y = x;
            x = result;
        }
        return counter.multiply(BigInteger.valueOf(4));
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
