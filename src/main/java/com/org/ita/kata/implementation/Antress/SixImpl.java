package com.org.ita.kata.implementation.Antress;

import com.org.ita.kata.Six;

public class SixImpl implements Six {
    @Override
    public long findNb(long m) {
        // your code
        long result = 0L;
        long total = 0L;
        long n = 0;
        while (total < m){
            n = n +1;
            total += Math.pow(n,3);
        }
        result = (total == m )?n:-1L;
        return result;
    }

    @Override
    public String balance(String book) {
        String t = book.replaceAll("([^\\n. \\da-zA-Z])", "");
        String[] arr = t.split("[\\n]+");
        Double amount = Double.parseDouble(arr[0]);
        double total = 0;
        int count =0;
        StringBuilder result = new StringBuilder();
        result.append("Original Balance: " + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            count ++;
            String[] line = arr[i].split("[ ]+");
            amount -= Double.parseDouble(line[2]);
            total += Double.parseDouble(line[2]);
            String u = String.format("\\r\\n%s %s %s Balance %.2f", line[0], line[1], line[2], amount);
            result.append(u);
        }
        result.append(String.format("\\r\\nTotal expense  %.2f\\r\\nAverage expense  %.2f", total, total / count));
        String resultStr = result.toString();

        return resultStr;
    }

    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        return 0.1;
    }

    @Override
    public double variance(String town, String strng) {
        return 0.1;
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
        String letterMemory ;
        String artMemory;
        String quantity;
        int sum = 0;
        int [] sumOfCategory = new int[lstOf1stLetter.length];

        for (int i = 0 ; i < lstOf1stLetter.length;i++){
            letterMemory =  lstOf1stLetter[i];
            for (int j = 0 ; j < lstOfArt.length;j++){
                artMemory = Character.toString(lstOfArt[j].charAt(0));
                if(letterMemory.equals(artMemory)){
                    quantity = lstOfArt[j].replaceAll("[^0-9]","");
                    sumOfCategory[i] += Integer.parseInt(quantity);
                }
            }
        }
        String result  = "";
        for (int i = 0 ; i < lstOf1stLetter.length; i++) {
            if (lstOfArt.length == 0 || lstOf1stLetter.length == 0 ){
            }else if (i<lstOf1stLetter.length-1){
                result = result + "(" + lstOf1stLetter[i] + " : " + sumOfCategory[i] + ")" + " - ";
            }else{
                result = result + "(" + lstOf1stLetter[i] + " : " + sumOfCategory[i] + ")";
            }
        }

        return result;
    }
}
