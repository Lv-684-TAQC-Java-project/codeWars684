package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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

    @Test
    public void testCountPositivesSumNegatives() {
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

    @Test
    public void testAmIWilson() {
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
