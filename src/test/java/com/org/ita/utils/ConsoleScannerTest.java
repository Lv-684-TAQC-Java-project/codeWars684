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

//
//        Assert.assertEquals(actual1, 15);
//        Assert.assertEquals(actual1, 3);
        System.out.println(output);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actual1, 15, "bfjdhbgdj");
        softAssert.assertEquals(actual1, 115, "bjkhbdskjgvbsdkjbvsfk");
        softAssert.assertEquals(actual2, 3, "3True");
        softAssert.assertEquals(actual2, 13, "3False");
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
    }

    @Test
    public void testReadIntArray() {
    }

    @Test
    public void testReadStringArray() {
    }

    @Test
    public void testReadLongArray() {
    }
}