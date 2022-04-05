package com.org.ita.kata.implementation.AnastasiaLahuza;

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
        if(input==null || input.length==0){
            int[] n = { };
            return  n;
        }
        int count =0;
        int sum = 0;
        for (int a: input)
        {
            if(a==Math.abs(a) && a!=0){
                count++;
            }
            else if (a!=Math.abs(a) && a!=0){
                sum += a;
            }

        }
        int[] a = {count, sum};
        return a;
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
