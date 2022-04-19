package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

public class EightTest extends DataProviderUserImpl {


    @DataProvider(name = "VolumeOfCuboidDP")
    public Object[][] VolumeOfCuboidCombineDP() {
        Object[][] data = new Object[][]{
                {1, 2, 2, 4},
                {6.3, 2, 5, 63}
        };
        return combine(implementationsEightKataDataProvider(), data);
    }

    @Test
    public void testLiters() {

    }

    @Test(dataProvider = "VolumeOfCuboidDP")
    public void getVolumeOfCuboidCombine(Eight impl, double length, double width, double height, double expected) {
        double actual = impl.getVolumeOfCuboid(length, width, height);
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void testMpgToKPM() {
    }

    @Test
    public void testSquareOrSquareRoot() {
    }

    @DataProvider(name = "CountPositivesSumNegativesDP")
    public Object[][] CountPositivesSumNegativesDP() {
        Random random = new Random();
        int[] array = random.ints(15, -525,463).toArray();
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            } else if (array[i] < 0) {
                sum += array[i];
            }
        }

        int [][][] data = new int [][][]{
                {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}, {10, -65}},
                {{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}, {8, -50}},
                {null, { }},
                {{ }, { }},
                {array,{count, sum}}
        };
        return combine(implementationsEightKataDataProvider(), data);
    }
    @Test(dataProvider = "CountPositivesSumNegativesDP", groups = {"B"})
    public void testCountPositivesSumNegatives(Eight impl, int[] input, int[] expected){
        int[] actual =impl.countPositivesSumNegatives(input);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testStringToNumber() {
    }

    @Test
    public void testAmIWilson() {
    }

    @Test
    public void testTwoDecimalPlaces() {
    }

    @Test
    public void testDivisibleBy() {
    }
}
