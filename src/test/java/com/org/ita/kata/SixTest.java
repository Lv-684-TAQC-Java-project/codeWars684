package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SixTest extends DataProviderUserImpl{

    @DataProvider(name = "findNb")
    public Object[][] findNb() {
        Object[][] data = new Object[][]{
                {4183059834009L, 2022},
                {24723578342962L, -1},
                {135440716410000L, 4824},
                {40539911473216L, 3568},
                {108806345136785L, -1},
                {41364076483082L,-1},
                {9541025211025L, 2485},
                {16,-1}
        };
        return combine(implementationsSixKataDataProvider(), data);
    }

    @Test(dataProvider ="findNb")
    public void testFindNb(Six impl, long input, long expected) {
        long actual = impl.findNb(input);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testBalance() {
    }

    @Test
    public void testF() {
    }

    @Test
    public void testMean() {
    }

    @Test
    public void testVariance() {
    }

    @Test
    public void testNbaCup() {
    }

    @Test
    public void testStockSummary() {
    }
}