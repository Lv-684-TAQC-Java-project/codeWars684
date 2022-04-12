package com.org.ita.kata.implementation.AnastasiaLahuza;

import com.org.ita.kata.Eight;

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
        float x = 0.354006f;
        float KMP = mpg * x;
        return (float) Math.round(KMP * 100) / 100;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int a = 0; a < array.length; a++) {
            if (Math.sqrt(array[a]) == Math.round(Math.sqrt(array[a]))) {
                array[a] = (int) Math.sqrt(array[a]);
            } else {
                array[a] = array[a] * array[a];
            }
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            int[] n = {};
            return n;
        }
        int count = 0;
        int sum = 0;
        for (int a : input) {
            if (a == Math.abs(a) && a != 0) {
                count++;
            } else if (a != Math.abs(a) && a != 0) {
                sum += a;
            }

        }
        int[] a = {count, sum};
        return a;
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        if (n > 2) {
            double f = 1;
            for (int i = 1; i <= (n - 1); i++) {
                f = f * i;
            }

            boolean a = (f + 1) % (n * n) == 0;

            return a;
        } else
            return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        double numAfter = Math.pow(10, 2);
        double result = Math.round(number * numAfter) / numAfter;
        return result;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for (int i : numbers) {
            if (i % divider == 0) {
                count++;
            }
        }
        int[] array = new int[count];
        int i = 0;
        for (int a : numbers) {
            if (a % divider == 0) {
                array[i] = a;
                i++;
            }
        }
        return array;
    }
}
