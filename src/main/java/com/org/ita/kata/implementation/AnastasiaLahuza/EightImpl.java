package com.org.ita.kata.implementation.AnastasiaLahuza;

import com.org.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        return 0;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length*width*height;
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
        return new int[0];
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        if(n>2){
            double f = 1;
            for (int i = 1; i <= (n - 1); i++) {
                f = f * i;
            }

            boolean a = (f + 1) % (n * n)==0;

            return a;}
        else
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
        int count=0;
        for(int i: numbers){
            if(i%divider==0){
                count++;
            }
        }
        int[] array = new int[count];
        int i = 0;
        for (int a: numbers)
        {
            if(a%divider==0){
                array[i] = a;
                i++;
            }
        }
        return array;
    }
}
