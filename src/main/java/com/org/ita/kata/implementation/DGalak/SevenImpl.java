package com.org.ita.kata.implementation.DGalak;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        int count = 0;
        int a = 0;//people infront of him
        int b = 0;//people behind him
        for (int i = 1; i <= p; i++) {
            a = i - 1;
            b = p - i;
            if (a >= bef && b <= aft) {
                count++;
                System.out.println(count);
            }
        }
        return count;
    }
}
