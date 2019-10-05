package assignment;

import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        int sUpper = 0;
        int sLower = 0;
        Scanner input = new Scanner(System.in);
        char[] inputCharArray = input.nextLine().toCharArray();
        for (int i = 0; i < inputCharArray.length; i++) {
            int val = inputCharArray[i];
            if (val >= 65 && val <= 90) {
                sUpper += val;
            } else if (val >= 97 && val <= 122) {
                sLower += val;
            }

        }
        int absval = sLower - sUpper;
        System.out.println("Absolute Value: " + absval);
    }
}