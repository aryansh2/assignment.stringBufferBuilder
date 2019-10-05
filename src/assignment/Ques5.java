package assignment;
import java.util.Scanner;

public class  Ques5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String enterString = in.nextLine().trim();
        System.out.println("enter the substring");
        String subString = in.nextLine().trim();
        enterString = enterString.replaceAll(subString, "*");
        System.out.println(enterString);
    }
}
