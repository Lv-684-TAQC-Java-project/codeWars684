package com.org.ita.kata;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class DataProviderUserImpl {

    public static Object[][] combine(Object[][] impls, Object[][] data) {
        List<Object[]> listObjects = new ArrayList<>();
        for (Object[] impl : impls) {
            for (Object[] _data : data) {
                int totalLength = impl.length + _data.length;
                Object[] objArr = new Object[totalLength];
                int count = 0;
                for (Object obj : impl) {
                    objArr[count++] = obj;

                }
                for (Object obj : _data) {
                    objArr[count++] = obj;
                }
                listObjects.add(objArr);
            }
        }
        return listObjects.toArray(new Object[0][0]);
    }


    @DataProvider
    public Object[][] implementationsEightKataDataProvider() {
        return new Object[][]{
                {new com.org.ita.kata.implementation.AnastasiaLahuza.EightImpl()},
                {new com.org.ita.kata.implementation.Antress.EightImpl()},
                {new com.org.ita.kata.implementation.DGalak.EightImpl()},
                {new com.org.ita.kata.implementation.DYevhen97.EightImpl()},
                {new com.org.ita.kata.implementation.maka155.EightImpl()},
                {new com.org.ita.kata.implementation.okras2.EightImpl()},
                {new com.org.ita.kata.implementation.OlesNikon.EightImpl()},
                {new com.org.ita.kata.implementation.Volodja85.EightImpl()}
        };
    }
    @DataProvider
    public Object[][] implementationsSevenKataDataProvider() {
        return new Object[][]{
                {new com.org.ita.kata.implementation.AnastasiaLahuza.SevenImpl()},
                {new com.org.ita.kata.implementation.Antress.SevenImpl()},
                {new com.org.ita.kata.implementation.DGalak.SevenImpl()},
                {new com.org.ita.kata.implementation.DYevhen97.SevenImpl()},
                {new com.org.ita.kata.implementation.maka155.SevenImpl()},
                {new com.org.ita.kata.implementation.okras2.SevenImpl()},
                {new com.org.ita.kata.implementation.OlesNikon.SevenImpl()},
                {new com.org.ita.kata.implementation.Volodja85.SevenImpl()}
        };
    }
}
