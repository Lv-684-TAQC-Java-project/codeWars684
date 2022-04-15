package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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

    @Test
    public void testCountPositivesSumNegatives() {
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
