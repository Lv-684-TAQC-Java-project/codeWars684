package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.math.BigInteger;


public class FiveTest extends DataProviderUserImpl {


    @DataProvider(name = "artificialRainCombineDP")
    public Object[][] artificialRainCombineDP() {
        int[] a = {2};
        int[] b = {1, 2, 1, 2, 1};
        int[] c = {4, 2, 3, 3, 2};
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
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGap() {
    }

    @DataProvider(name = "Zeros")
    public Object[][] Zeros() {
        int n = 1 + (int) (Math.random() * 100);
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }

        String str = String.valueOf(result);
        int count = 0;
        char[] chars = str.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != '0')
                break;
            count++;
        }
        System.out.println(result + ":" + count);

        Object[][] data = new Object[][]{
                {0, 0},
                {6, 1},
                {14, 2},
                {n, count}
        };
        return combine(implementationsFiveKataDataProvider(), data);
    }

    @Test(dataProvider = "Zeros")
    public void testZeros(Five impl, int n, int expected) {
        double actual = impl.zeros(n);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testPerimeter() {
    }

    @DataProvider(name = "dpSolveSum")
    public Object[][] dpSolveSumCombine() {
        Object[][] data = new Object[][]{
                {2.00, 5.000000000000e-01},
                {4.00, 6.096117967978e-01},
                {5.00, 6.417424305044e-01},

        };
        return combine(implementationsFiveKataDataProvider(), data);
    }

    @Test(dataProvider = "dpSolveSum")
    public void testSolveSum(Five impl,double m ,double expected) {
        double actual = impl.solveSum(m);
        actual = Double.parseDouble(String.format("%.13f", actual).replaceAll(",","."));
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "Smallest")
    public Object[][] SmallestCombine() {
        Object[][] data = new Object[][]{
                {261235, new long[]{126235, 2, 0}},
                {209917, new long[]{29917, 0, 1}},
                {285365, new long[]{238565, 3, 1}},
                {269045, new long[]{26945, 3, 0}},
                {296837, new long[]{239687, 4, 1}}

        };
        return combine(implementationsFiveKataDataProvider(), data);
    }

    @Test(dataProvider = "Smallest")
    public void testSmallest(Five impl, long n, long[] expected) {
        long[] actual = impl.smallest(n);
        Assert.assertEquals(actual, expected);
    }
}