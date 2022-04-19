package com.org.ita.kata;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.math.BigInteger;

public class FiveTest extends DataProviderUserImpl{

    @Test
    public void testArtificialRain() {
    }

    @Test
    public void testGap() {
    }

    @DataProvider(name = "Zeros")
    public Object[][] Zeros() {
        int n = 1+(int)( Math.random()*100);
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++)
        {
            result = result.multiply(new BigInteger(i + ""));
        }

        String str = String.valueOf(result);
        int count = 0;
        char[] chars = str.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--)
        {
            if (chars[i] != '0')
                break;
            count++;
        }
        System.out.println(result + ":"+count);

        Object [][] data = new Object[][]{
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

    @Test
    public void testSolveSum() {
    }

    @Test
    public void testSmallest() {
    }
}