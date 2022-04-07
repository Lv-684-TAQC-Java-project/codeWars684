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
            if(input==null || input.length==0){
                int[] n = { };
                return  n;
            }
            try {
                int count_positives=0;
                int sum_negatives=0;

                for (int i = 0; i <input.length; i++)
                {
                    if(input[i]>0){
                        count_positives++;
                    }
                    if(input[i]<0){
                        sum_negatives+=input[i];
                    }

                }
                int[] countSum={count_positives, sum_negatives};
                return countSum;
            }catch (NullPointerException e){
                e.fillInStackTrace();
                e.getMessage();
            }
            return null;
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
