package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FiveTest extends DataProviderUserImpl {

    @DataProvider(name = "artificialRainCombineDP")
    public Object[][] artificialRainCombineDP() {
                int[] a = {2};
                int [] b = {1,2,1,2,1};
                int [] c = {4,2,3,3,2};
        Object[][] data = new Object[][]{
                {a, 1,},
                {b, 3},
                {c, 4}
        };
        return combine(implementationsFiveKataDataProvider(), data);
    }
    @Test(dataProvider = "artificialRainCombineDP")
    public void testArtificialRain(Five impl, int[] array, int expected) {
        int actual = impl.artificialRain(array);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testGap() {
    }

    @Test
    public void testZeros() {
    }

    @Test
    public void testPerimeter() {
    }

    @Test
    public void testSolveSum() {
    }

    @Test
    public void testSmallest() {
    }
}