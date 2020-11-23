package Java.Strings;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-substring/problem
public class JavaSubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        String finalStr = S.substring(start, end);
        System.out.println(finalStr);
    }
}
