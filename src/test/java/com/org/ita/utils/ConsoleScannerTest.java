package com.org.ita.utils;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.NoSuchElementException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

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
        assertEquals(actual, 15);
    }

    @Test
    public void testReadFloat() {
    }

    @Test
    public void testReadDouble() {
    }

    @DataProvider(name = "ReadString")
    public Object[][] ReadString() {
        Object[][] data = new Object[][]{

                {"Sea is worm!", "Sea is worm!"},
                {"The temperature is 25C", "The temperature is 25C"},
                {"Список: 1. Фіолетовий, 2. Синій", "Список: 1. Фіолетовий, 2. Синій"},
                {"Ми - Українці!", "Ми - Українці!"},

        };
        return (data);
    }

    @Test(dataProvider = "ReadString", groups = {"A"})
    public void testReadString(String input, String rez) {

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ConsoleScanner cs = new ConsoleScanner();

        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String actual1 = cs.readString();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actual1, rez, "Soft assert was failed");
        softAssert.assertAll();
    }

    @Test(expectedExceptions = NoSuchElementException.class, groups = {"A"})
    public void testReadStringException() {
        String input = "";

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ConsoleScanner cs = new ConsoleScanner();

        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String actual1 = cs.readString();
        assertEquals(actual1, "Value is not incorrect, please try again.");
        fail("This method was failed");
    }

    @DataProvider(name = "dpReadValidBigInteger")
    public Object[][] readValidBigInteger() {
        return new Object[][]{
                {"444", new BigInteger("444")},
                {"1234589585", new BigInteger("1234589585")},
                {"9223372036854775807", new BigInteger("9223372036854775807")},
                {"-9223372036854775807", new BigInteger("-9223372036854775807")}
        };
    }

    @Test(dataProvider = "dpReadValidBigInteger")
    public void testReadBigInteger(String input, BigInteger expected) {
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        var consoleScanner = new ConsoleScanner();
        BigInteger actual = consoleScanner.readBigInteger();
        assertEquals(actual, expected);
    }

    @DataProvider(name = "dpReadBigDecimal")
    public Object[][] readBigDecimal() {
        return new Object[][]{
                {"2,6E-08", new BigDecimal( "2.6e-08")},
                {"1,4E-09", new BigDecimal("1.4e-09")},
                {"2,4E-07", new BigDecimal("2.4e-07")},
        };
    }

    @Test(dataProvider = "dpReadBigDecimal")
    public void testReadBigDecimal(String input, BigDecimal expected) {
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ConsoleScanner cs = new ConsoleScanner();
        BigDecimal actual =  cs.readBigDecimal();
        assertEquals(actual, expected);
    }

    @Test
    public void testReadDoubleArray() {
        String input = "5 5,35 6,21 0,123 0,00001 6,234";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ConsoleScanner cs = new ConsoleScanner();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        double[] excepted = new double[]{5.35, 6.21, 0.123, 0.00001, 6.234};
        double[] actual = cs.readDoubleArray();
        assertEquals(actual, excepted);
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
        String input = "4 Ivan Anna Ira Roma";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ConsoleScanner cs = new ConsoleScanner();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String[] actual = cs.readStringArray();
        String[] expected = new String[4];
        expected[0] = " Ivan Anna Ira Roma";
        System.out.println(output);
        Assert.assertEquals(actual, expected, "Arrays are not equal");
    }

    @Test
    public void testReadLongArray() {
    }
}