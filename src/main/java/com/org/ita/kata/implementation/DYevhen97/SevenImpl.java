package com.org.ita.kata.implementation.DYevhen97;

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
        int lastValidBef = p - bef;
        int lastValidAft = aft + 1;
        return Math.min(lastValidBef, lastValidAft);
    }
}
