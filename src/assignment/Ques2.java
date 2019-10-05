package assignment;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int m =sc.nextInt();
        int n =sc.nextInt();
        System.out.println(s);
        System.out.println(s.substring(m,n));
    }
}
