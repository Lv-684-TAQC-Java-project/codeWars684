package com.org.ita.kata.implementation.okras2;

import com.org.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        return 0;
    }

    @Override
    public double getVolumeOfCuboid(final double length, final double width, final double height) {
        double volume =0;
        volume = length*width*height;
        return volume;
    }

    @Override
    public float mpgToKPM(float mpg) {
    float ImpGalltoLit = 4.54609188f;
    float MiletoKM = 1.609344f;
    float KMperLit = 0;
    KMperLit = (mpg*MiletoKM)/ImpGalltoLit;
    return KMperLit;
  }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
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
