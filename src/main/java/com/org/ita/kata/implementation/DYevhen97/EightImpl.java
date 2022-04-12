package com.org.ita.kata.implementation.DYevhen97;

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
        int i=Integer.parseInt(str);
        return i;
    }

    @Override
    public boolean amIWilson(double n) {
        double mod = n*n;
        double fact = 1;
        for(int i=2;i<n;i++){
            fact = (fact*i)%mod;
        }
        return fact+1 == mod;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return (double)Math.round(number*100)/100;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for (int number : numbers){
            if (number % divider == 0){
                count ++;
            }
        }
        int[] arr = new int[count];
        int i = 0;
        for (int number : numbers){
            if (number % divider == 0){
                arr[i] = number;
                i++;
            }
        }
        return arr;
    }
}
