package com.org.ita.kata.implementation.DYevhen97;

import com.org.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        float result = 1.0f;
        float baseNum = 1.0f;
        if (n <= 0) result = 0;
        else {
            for (int i = 1; i < n; i++) {
                baseNum = baseNum + 3;
                result += 1.0 / baseNum;
            }
        }
        return String.format("%.2f", result);
    }

    public static String bestSolution(int n) {
        double sum = 0.0;
        for (int i = 0; i < n; i++)
            sum += 1.0 / (1 + 3 * i);

        return String.format("%.2f", sum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
