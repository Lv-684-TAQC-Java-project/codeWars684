package com.org.ita.kata.implementation.DGalak;

import com.org.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        return 0;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return 0;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return 0;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int[] arrayZero = new int[0];
        int[] arrayCount = new int[2];
        int counter = 0;
        if (input == null) {
            return arrayZero;
        } else if (input.length == 0) {
            return arrayZero;
        } else {
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    counter += 1;
                    arrayCount[0] = counter;
                } else {
                    arrayCount[1] += input[i];
                }
            }
        }
        return arrayCount;
    }
    @Override
    public int stringToNumber(String str) {
        return 0;
    }

    @Override
    public boolean amIWilson(double n) {
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
