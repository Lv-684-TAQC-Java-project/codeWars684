package com.org.ita.kata.implementation.Antress;

import com.org.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        return 0;
    }

    @Override
    public String balance(String book) {
        return null;
    }

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
        boolean flag = true;
        String exception = "";
        String[] permission = resultSheet.split(" |,");
        String[] permissionByName = toFind.split(" ");
        String compareTo = permissionByName[permissionByName.length - 1];
        for (int i = 0; i < permission.length; i++) {
            if (permission[i].equals(compareTo)) {
                flag = false;
                break;
            }
        }
        if (toFind.equals("")) {
            return "";
        } else if (flag) {
            return toFind + ":This team didn't play!";
        } else {
            try {
                // your code
                String[] countCommandName = toFind.split(" ");
                //wins,draws,loses,scored,conceded,point
                int[] resultArray = new int[]{0, 0, 0, 0, 0, 0};
                String[] startArr = resultSheet.split(",");
                for (int i = 0; i < startArr.length; i++) {
                    exception = startArr[i];
                    if (startArr[i].contains(countCommandName[countCommandName.length - 1])) {
                        String[] splitBySentence = startArr[i].split(" ");
                        // if toFind command located on first position else toFind command located on second position
                        if (countCommandName[countCommandName.length - 1].equals(splitBySentence[countCommandName.length - 1])) {
                            //win ,draws or lose
                            if (Integer.parseInt(splitBySentence[countCommandName.length]) > Integer.parseInt(splitBySentence[splitBySentence.length - 1])) {
                                resultArray[0] += 1;
                                resultArray[5] += 3;
                            } else if (Integer.parseInt(splitBySentence[countCommandName.length]) == Integer.parseInt(splitBySentence[splitBySentence.length - 1])) {
                                resultArray[1] += 1;
                                resultArray[5] += 1;
                            } else {
                                resultArray[2] += 1;
                            }
                            resultArray[3] += Integer.parseInt(splitBySentence[countCommandName.length]);
                            resultArray[4] += Integer.parseInt(splitBySentence[splitBySentence.length - 1]);
                        } else {
                            if (Integer.parseInt(splitBySentence[(splitBySentence.length - countCommandName.length) - 2]) < Integer.parseInt(splitBySentence[splitBySentence.length - 1])) {
                                resultArray[0] += 1;
                                resultArray[5] += 3;
                            } else if (Integer.parseInt(splitBySentence[(splitBySentence.length - countCommandName.length) - 2]) == Integer.parseInt(splitBySentence[splitBySentence.length - 1])) {
                                resultArray[1] += 1;
                                resultArray[5] += 1;
                            } else {
                                resultArray[2] += 1;
                            }
                            resultArray[3] += Integer.parseInt(splitBySentence[splitBySentence.length - 1]);
                            resultArray[4] += Integer.parseInt(splitBySentence[(splitBySentence.length - countCommandName.length) - 2]);
                        }
                    }
                }
                String result = toFind + ":W=" + resultArray[0] + ";D=" + resultArray[1] + ";L=" + resultArray[2] +
                        ";Scored=" + resultArray[3] + ";Conceded=" + resultArray[4] + ";Points=" + resultArray[5];
                return result;
            } catch (NumberFormatException e) {
                return "Error(float number):" + exception;
            }
        }
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
