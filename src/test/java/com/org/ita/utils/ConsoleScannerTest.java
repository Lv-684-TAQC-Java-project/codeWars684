package com.org.ita.utils;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.*;

import static org.testng.Assert.*;

public class ConsoleScannerTest {

    @Test
    public void testReadInt() {
        String input = "a 15 ooo  ds vjhs 3 jh";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ConsoleScanner cs = new ConsoleScanner();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        int actual1 = cs.readInt();
        int actual2 = cs.readInt();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actual1, 15, "bfjdhbgdj");
        softAssert.assertEquals(actual1, 15, "bjkhbdskjgvbsdkjbvsfk");
        softAssert.assertEquals(actual2, 3, "3True");
        softAssert.assertEquals(actual2, 3, "3False");
        softAssert.assertAll();


    }

    @Test
    public void testReadLong() {
        String input = "15 aa cad";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ConsoleScanner cs = new ConsoleScanner();
        long actual = cs.readLong();
        Assert.assertEquals(actual, 15);
    }

    @Test
    public void testReadFloat() {
    }

    @Test
    public void testReadDouble() {
    }

    @Test
    public void testReadString() {
    }

    @Test
    public void testReadBigInteger() {
    }

    @Test
    public void testReadBigDecimal() {
    }

    @Test
    public void testReadDoubleArray() {
        String input = "5 5,35 6,21 0,123 0,00001 6,234";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ConsoleScanner cs = new ConsoleScanner();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        double[] excepted = new double[]{5.35 ,6.21 ,0.123 ,0.00001, 6.234};
        double[] actual = cs.readDoubleArray();
        Assert.assertEquals(actual, excepted);
    }

    @Test
    public void testReadIntArray() {
        String input = "3 15 14 13";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ConsoleScanner cs = new ConsoleScanner();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        int[] actual = cs.readIntArray();
        int[] expected = {15, 14, 13};
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actual, expected, "data isn't corect");
        softAssert.assertAll();

    }

    @Test
    public void testReadStringArray() {
    }

    @Test
    public void testReadLongArray() {
    }
}