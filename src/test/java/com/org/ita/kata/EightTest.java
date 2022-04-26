package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.AssertJUnit.assertEquals;

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

    @DataProvider(name = "TestMpgToKPM")
    public Object[][] testMpgToKPMCombineDP() {
        Object[][] data = new Object[][]{
                {10f, 3.54f},
                {20f, 7.08f},
                {30f, 10.62f}
        };
        return combine(implementationsEightKataDataProvider(), data);
    }

    @Test(dataProvider = "TestMpgToKPM")

    public void testMpgToKPM(Eight impl, float mpg, float expected) {
        float actual = impl.mpgToKPM(mpg);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSquareOrSquareRoot() {
    }

    @DataProvider(name = "CountPositivesSumNegativesDP")
    public Object[][] CountPositivesSumNegativesDP() {
        Random random = new Random();
        int[] array = random.ints(15, -525, 463).toArray();
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            } else if (array[i] < 0) {
                sum += array[i];
            }
        }

        int[][][] data = new int[][][]{
                {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}, {10, -65}},
                {{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}, {8, -50}},
                {null, {}},
                {{}, {}},
                {array, {count, sum}}
        };
        return combine(implementationsEightKataDataProvider(), data);
    }

    @Test(dataProvider = "CountPositivesSumNegativesDP", groups = {"B"})
    public void testCountPositivesSumNegatives(Eight impl, int[] input, int[] expected) {
        int[] actual = impl.countPositivesSumNegatives(input);
        Assert.assertEquals(actual, expected);
    }


    @DataProvider(name = "dpStringToNumber")
    public Object[][] dpstringToNumber() {
        Object[][] data = new Object[][]{
                {"123", 123},
                {"-123", -123}
        };
        return combine(implementationsEightKataDataProvider(), data);
    }

    @Test(dataProvider = "dpStringToNumber")
    public void testStringToNumber(Eight impl, String str, int expected) {
        int actual = impl.stringToNumber(str);
        assertEquals(expected, actual);
    }

    @DataProvider(name = "dpAmIWilson")
    public Object[][] dpAmIWilson() {
        Object[][] data = new Object[][]{
                {0, false},
                {1, false},
                {5, true}
        };
        return combine(implementationsEightKataDataProvider(), data);
    }

    @Test(dataProvider = "dpAmIWilson")
    public void testAmIWilson(Eight impl, double n, boolean expected) {
        boolean actual = impl.amIWilson(n);
        assertEquals(expected, actual);
    }

    @Test
    public void testTwoDecimalPlaces() {
    }

    @DataProvider(name = "VolumeOfDivisibleByDP")
    public Object[][] VolumeOfDivisibleByCombineDP() {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {1, 2, 3, 4, 5, 6};
        int[] c = {0, 1, 2, 3, 4, 5, 6};
        int[] expected = {2, 4, 6};
        int[] expected2 = {3, 6};
        int[] expected3 = {0, 4};
        Object[][] data = new Object[][]{
                {a, 2, expected},
                {b, 3, expected2},
                {c, 4, expected3}
        };
        return combine(implementationsEightKataDataProvider(), data);
    }

    @Test(dataProvider = "VolumeOfDivisibleByDP")
    public void testDivisibleBy(Eight impl, int[] numbers, int divider, int[] expected) {
        Assert.assertEquals(impl.divisibleBy(numbers, divider), expected);

    }
}
