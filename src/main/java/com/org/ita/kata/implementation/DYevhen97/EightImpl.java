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
        float gallon = 4.54609188f;
        float mile = 1.609344f;

        float out = (mpg*mile)/gallon;

        return (float) Math.round(out*100)/100;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int length = array.length;
        int[] result = new int[length];
        for(int i = 0; i < length; i++){
            if(Math.sqrt(array[i])%1>0){
                result[i] = array[i] * array[i];
            }
            else{
                result[i] = (int)Math.sqrt(array[i]);
            }
        }
        return result;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[] {};
        int count = 0, sum = 0;
        for (int i : input) {
            if (i > 0) count ++;
            if (i < 0) sum += i;
        }
        return new int[] {count, sum};
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
