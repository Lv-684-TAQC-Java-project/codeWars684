package com.org.ita.kata.implementation.Antress;

import com.org.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        return 0;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return width * height * length;
    }

    @Override
    public float mpgToKPM(float mpg) {
        float kilInMiles = 1.609344f;
        float litersInGallon = 4.54609188f;
        float result = (mpg / litersInGallon) * kilInMiles;
        float roundedFloat = Math.round(result * 100);
        return roundedFloat / 100;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int[] resultArray = new int[array.length];
        String str;
        int com = 0;

        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 2 == 0 || Math.sqrt(array[i]) % 2 == 1) {
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
        int countPos = 0;
        int sumNeg = 0;
        int[] arr = new int[0];
        if (input != null) {
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
        } else if (input.length == 0) {
            arr = new int[0];
        }
        return arr;
    }

    @Override
    public int stringToNumber(String str) {
        //TODO: Convert str into a number
        int number = Integer.parseInt(str);
        return number;
    }

    @Override
    public boolean amIWilson(double n) {
        //your code here
        double P = n;
        return n == 5 || n == 13 || n == 563;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        //Write your code here
        double result = Math.round(number * 100);
        return result / 100;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int countNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            countNumber = (numbers[i] % divider == 0) ? countNumber += 1 : countNumber;
        }
        int[] resultArray = new int[countNumber];
        for (int i = 0, j = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                resultArray[j] = numbers[i];
                j++;
            }
        }
        return resultArray;
    }
}
