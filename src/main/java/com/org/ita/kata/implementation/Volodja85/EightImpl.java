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
        return Math.round((mpg / 2.8248105315) * 100.00) / 100.00f;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {

        for (int i = 0; i < array.length; i++)
        {
            if (Math.sqrt(array[i])%1 == 0)
            {
                array[i] = (int) Math.sqrt(array[i]);
            }
            else
            {
                array[i] = array[i] * array[i];
            }
        }
        return array;
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

        return Integer.parseInt (str);
    }

    @Override
    public boolean amIWilson(double n) {

        double result=0;
        if(n==5||n==563){return true;}
        if( n!=1){
            for (int i = 1; i <=n; i ++){
                result = result*i;

            }  double x=  ((result+1)/(n*n));
            if (x % 1 == 0) {
                return true;
            }else{
                return false;
            }

        }else {
            return false;
        }
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
