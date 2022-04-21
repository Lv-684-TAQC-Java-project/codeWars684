package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SevenTest extends DataProviderUserImpl {

    @Test
    public void testNewAvg() {
    }
    @DataProvider(name = "SeriesSumDP")
    public Object[][] seriesSumCombineDP() {
        Object[][] data = new Object[][]{
                {5, "1,57"},
                {9, "1,77"},
                {15, "1,94"}
        };
        return combine(implementationsSevenKataDataProvider(), data);
    }

    @Test(dataProvider = "SeriesSumDP")
    public void testSeriesSum(Seven impl, int n, String expected) {
        String actual = impl.seriesSum(n);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testWhereIsHe() {
    }
}