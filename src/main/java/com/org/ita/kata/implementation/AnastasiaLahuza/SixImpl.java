package com.org.ita.kata.implementation.AnastasiaLahuza;

import com.org.ita.kata.Six;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {return null;}

    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {

        if(resultSheet.isEmpty() || toFind.isEmpty()) {
            return "";
        }

        int winCount=0;
        int loseCount=0;
        int drawCount=0;
        int scoredPointsSum=0;
        int concededPointsSum=0;
        int rating =0;
        String group1=null;
        String group2=null;
        String[] rate = resultSheet.split(",");
        for (String s : rate) {
            Pattern p = Pattern.compile("(" + toFind + " [0-9.]{1,7})");
            Matcher m = p.matcher(s);

            if (m.find()) {
                group1 = m.group(1).trim();
                System.out.println(group1);
                group2 = s.replace(group1, "").trim();

                String[] findTeam = group1.split(" ");
                double sc1=Double.parseDouble(findTeam[findTeam.length - 1]);
                if(sc1%1!=0){
                    return "Error(float number):"+s;
                }
                int score1 = (int) sc1;
                scoredPointsSum += score1;
                String[] anotherTeam = group2.split(" ");
                double sc2=Double.parseDouble(anotherTeam[anotherTeam.length - 1]);
                if(sc2%1!=0){
                    return "Error(float number):"+s;
                }
                int score2 = (int) sc2;
                concededPointsSum += score2;

                if (score1 > score2) {
                    winCount++;
                    rating+=3;
                } else if (score1 < score2) {
                    loseCount++;
                } else{ drawCount++;
                    rating+=1;}
            }
        }
        String rez;
        if(scoredPointsSum%1!=0 || concededPointsSum%1!=0) {
            rez="Error(float number):the concerned string";
        }
        else if(scoredPointsSum==0 && concededPointsSum==0){
            rez= toFind + ":" + "This team didn't play!";}
        else{
            rez=toFind+":W="+ winCount+";D="+drawCount+";L="+loseCount+";Scored="+scoredPointsSum+";Conceded="+concededPointsSum +";Points=" + rating;
        }
        return rez;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
