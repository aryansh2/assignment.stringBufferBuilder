package assignment;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputYourName = input.nextLine().trim();
        String x = inputYourName.replace('a', '*');
        x = x.replace('e', '*');
        x = x.replace('i', '*');
        x = x.replace('o', '*');
        x = x.replace('u', '*');
        x = x.replace('A', '*');
        x = x.replace('E', '*');
        x = x.replace('I', '*');
        x = x.replace('O', '*');
        x = x.replace('U', '*');
        System.out.println(x);
    }
}
