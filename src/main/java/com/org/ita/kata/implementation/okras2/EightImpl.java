package com.org.ita.kata.implementation.okras2;

import com.org.ita.kata.Eight;

import java.util.Arrays;

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
    float ImpGalltoLit = 4.54609188f;
    float MiletoKM = 1.609344f;
    float KMperLit = 0;
    KMperLit = (mpg*MiletoKM)/ImpGalltoLit;
    return KMperLit;
  }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
    int length = array.length;
    int[] result = new int [length];
    for (int i = 0; i < length; i++){
     if ((Math.sqrt(array[i]))%1>0){
           result[i] = array[i]*array[i];
        } else {
   result[i] = (int)Math.sqrt(array[i]);
         }
   }
    return result;
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


    @Override
    public int stringToNumber(String str) {
        try{
            int number = Integer.parseInt(str);
            System.out.println(number);
      return number;
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
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
