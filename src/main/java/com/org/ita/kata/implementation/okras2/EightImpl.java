package com.org.ita.kata.implementation.okras2;

import com.org.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        return 0;
    }

    @Override
    public double getVolumeOfCuboid(final double length, final double width, final double height) {
        double volume =0;
        volume = length*width*height;
        return volume;
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
        if (input==null || input.length==0){
        return new int[0];
      }
       int[] result = {0,0};
      for (int i = 0; i < input.length; i++){
              if (input[i]>0) {
                result[0]++;
              } 
        else if (input[i]<0){
          result[1]+=input[i];
        }
        }
      System.out.println(Arrays.toString(result));
        return result; //return an array with count of positives and sum of negatives
    }
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
