package Java.Strings;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-strings-introduction/problem
public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int lengthA = A.length();
        int lengthB = B.length();
        System.out.println(lengthA + lengthB);
        if (A.compareTo(B) <= 0)
            System.out.println("No");
        else
            System.out.println("Yes");
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);

    }
}
