package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Arrays;

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

    @DataProvider(name = "Smallest")
    public Object[][] SmallestCombine() {
        Object[][] data = new Object[][]{
//                 {261235, 126235, 2, 0},
//                {209917, 29917, 1, 0},
//                {285365,238565, 3, 1},
//                {269045, 26945, 3, 0},
//                {296837,239687, 4, 1}
                {261235, new long[] {126235, 2, 0}},
                {209917, new long[] {29917, 1, 0}},
                {285365,new long[] {238565, 3, 1}},
                {269045, new long[] {26945, 3, 0}},
                {296837,new long[]{239687, 4, 1}}

        };
        return combine(implementationsFiveKataDataProvider(), data);
    }

    @Test (dataProvider = "Smallest")
    public void testSmallest(Five impl,long n ,long[] expected ) {
        //long[]expected = new long[]{fElement,sElement,tElement};
        // SoftAssert softAssert = new SoftAssert();
        long[]actual = impl.smallest(n);
        // softAssert.assertEquals(actual,expected);
        System.out.println(Arrays.toString(actual));
        Assert.assertEquals(actual,expected);
    }
}