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
        for (int i = 0; i < array.length; i++) {
            if (String.valueOf(Math.sqrt(array[i])).split("\\.")[1].equals("0")) {
                array[i] = (int) Math.sqrt(array[i]);
            } else {
                array[i] = array[i] * array[i];
            }
        }
        return array;
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
        return Integer.parseInt(str.replaceAll("[^\\d-]", ""));
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
