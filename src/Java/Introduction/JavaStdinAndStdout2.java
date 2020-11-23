package Java.Introduction;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-stdin-stdout/problem
public class JavaStdinAndStdout2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = null;
        double y = 0.0;
        int x = sc.nextInt();
        y = sc.nextDouble();
        s = sc.nextLine();
        s = sc.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + y);
        System.out.println("Int: " + x);
    }
}
