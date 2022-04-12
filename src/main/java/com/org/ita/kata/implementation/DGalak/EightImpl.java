package com.org.ita.kata.implementation.DGalak;
import java.util.ArrayList;

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
        if (n == 5 || n == 13 || n == 563){
            return true;
        }
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {

        return  Math.round(number * 100.0)/100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {

        ArrayList<Integer> resultArrayList = new ArrayList<Integer>();
        for(int i =0 ; i < numbers.length; i++){
            if(numbers[i] % divider == 0){
                resultArrayList.add(numbers[i]);
            }
        }
        int[] arrayNumbers = new int[resultArrayList.size()];
        for(int i =0 ; i < arrayNumbers.length; i++){
            arrayNumbers[i] = resultArrayList.get(i).intValue();
        }
        return arrayNumbers;
    }
}
