package com.org.ita.kata.implementation.OlesNikon;

import com.org.ita.kata.Eight;

import java.math.BigDecimal;
import java.util.Arrays;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        return 0;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return BigDecimal.valueOf(mpg * 1.609344f / 4.54609188f).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                array[i] = (int) Math.sqrt(array[i]);
            } else {
                array[i] = array[i] * array[i];
            }
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        }
        int count = 0;
        int sum = 0;
        for (int i : input) {
            if (i > 0) {
                count++;
            }
            if (i < 0) {
                sum += i;
            }
        }
        return new int[]{count, sum};
    }

    @Override
    public int stringToNumber(String str) {
        int numer = Integer.parseInt(str);
        return numer;
    }

    @Override
    public boolean amIWilson(double n) {
        return n == 5 || n == 13 || n == 563;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return (double) Math.round(number * 100.0) / 100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers)
                .filter(i -> (i % divider) == 0)
                .toArray();
    }
}
