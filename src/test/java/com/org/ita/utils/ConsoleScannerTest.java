package com.org.ita.utils;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.NoSuchElementException;

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
    }

    @Test
    public void testReadFloat() {
    }

    @Test
    public void testReadDouble() {
    }

    @DataProvider(name = "ReadString")
    public Object[][] ReadString() {
        Object [][] data = new Object[][]{

                {"Sea is worm!", "Sea is worm!"},
                {"The temperature is 25C", "The temperature is 25C"},
                {"Список: 1. Фіолетовий, 2. Синій","Список: 1. Фіолетовий, 2. Синій"},
                {"Ми - Українці!", "Ми - Українці!"},

        };
        return (data);
    }
    @Test(dataProvider = "ReadString", groups = {"A"})
    public void testReadString( String input, String rez) {

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
        Assert.assertEquals(actual1, "Value is not incorrect, please try again.");
        fail("This method was failed");
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