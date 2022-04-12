package com.org.ita.kata.implementation.Volodja85;

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
        return Double.parseDouble(String.format("%.2f", number));
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        int count2=0;
        for (int i = 0; i <numbers.length; i++){
            if(numbers[i]%divider==0){
                count2++;
            }
        }
        int[] divisor = new int[ count2];
        for (int i = 0; i <numbers.length; i++){
            if(numbers[i]%divider==0){
                divisor[count]=numbers[i];
                count++;
            }

        }
        return divisor;
    }
}
