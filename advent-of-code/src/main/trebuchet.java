package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class trebuchet {
    public static void main(String[] args) throws Exception {

//        String filename = "src/resources/day-1-test-input.txt";
        String filename = "src/resources/day-1-input.txt";
//        String filename = "src/resources/day-1-test-input-2.txt";

        BufferedReader br = new BufferedReader(new FileReader(filename));

        long res = 0L;

        String currLine;
        while ((currLine = br.readLine()) != null) {

            currLine = currLine.replaceAll("one", "o1e");
            currLine = currLine.replaceAll("two", "t2o");
            currLine = currLine.replaceAll("three", "t3e");
            currLine = currLine.replaceAll("four", "f4r");
            currLine = currLine.replaceAll("five", "f5e");
            currLine = currLine.replaceAll("six", "s6x");
            currLine = currLine.replaceAll("seven", "s7n");
            currLine = currLine.replaceAll("eight", "e8t");
            currLine = currLine.replaceAll("nine", "n9e");
            currLine = currLine.replaceAll("[^0-9]", "");

            StringBuilder num = new StringBuilder();
            for (int i = 0; i < currLine.length(); i++) {
                num.append(currLine.charAt(i));
            }

            int calibrationValue;

            if (num.isEmpty()) {
                throw new Exception("Line does not contain numbers");
            } else if (num.length() == 1) {
                num.append(num.charAt(0));
                calibrationValue = Integer.parseInt(num.toString());
            } else {
                char first = num.charAt(0);
                char second = num.charAt(num.length() - 1);
                String numStr = "" + first + second;
                calibrationValue = Integer.parseInt(numStr);
            }

            res += calibrationValue;
        }

        System.out.println(res);
    }

}
