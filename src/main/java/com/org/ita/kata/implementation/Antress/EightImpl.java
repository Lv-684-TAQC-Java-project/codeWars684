package com.org.ita.kata.implementation.Antress;

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
        int[] resultArray = new int[array.length];
        String str;
        int com = 0;

        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 2 == 0 || Math.sqrt(array[i]) % 2 == 1 ) {
                com = (int) Math.sqrt(array[i]);
                resultArray[i] = com;

            } else {
                resultArray[i] = array[i] * array[i];
            }
        }
        return resultArray;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        return new int[0];
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
