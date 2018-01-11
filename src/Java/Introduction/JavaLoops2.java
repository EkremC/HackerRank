package Java.Introduction;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-loops/problem
public class JavaLoops2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int numberOfLine = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < numberOfLine; i++) {
            int a = scan.nextInt(), b = scan.nextInt(), n = scan.nextInt();
            for (int k = 0; k < n; k++) {
                if (a != 0) {
                    if (k != 0) {
                        sum += Math.pow(2, k) * b;
                        System.out.print(sum + " ");
                    } else {
                        sum += a + (Math.pow(2, k) * b);
                        System.out.print(sum + " ");
                    }


                } else {
                    sum += a + (Math.pow(2, k) * b);
                    System.out.print(sum + " ");
                }
            }
            System.out.println();
            sum = 0;
        }
    }
}
