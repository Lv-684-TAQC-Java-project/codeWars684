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
        return new int[0];
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int countPos = 0;
        int sumNeg = 0;
        int[] arr = new int[0];
        if(input != null){
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    countPos++;
                } else {
                    sumNeg += input[i];
                }
            }
        }
        if (countPos != 0 && sumNeg != 0) {
            arr = new int[2];
            arr[0] = countPos;
            arr[1] = sumNeg;
        } else if (countPos == 0 && sumNeg == 0) {
            arr = new int[0];
        }else if (input.length == 0){
            arr = new int[0];
        }
        return arr;
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
        int countNumber = 0;
        for (int i = 0 ; i < numbers.length;i++){
            countNumber = (numbers[i] % divider == 0)?countNumber +=1 :countNumber;
        }
        int[] resultArray = new int[countNumber];
        for (int i = 0 , j = 0; i < numbers.length; i++){
            if (numbers[i] % divider == 0){
                resultArray[j] = numbers[i];
                j++;
            }
        }
        return resultArray;
    }
}
