package com.org.ita.kata.implementation.DGalak;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        double result = 1;
        double divider = 4;
        if (n == 0 || n == 1) {
            return String.format("%.2f", n);
        } else if (n != (int) n) {
            return "0.00";
        }
        for (int i = 2; i <= n; i++) {
            result = result + 1 / divider;
            divider += 3;
        }
        return String.format("%.2f", result);
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
