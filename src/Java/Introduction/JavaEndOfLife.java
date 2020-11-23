package Java.Introduction;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-end-of-file/problem
public class JavaEndOfLife {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int holder = 1;
        while (scan.hasNext()) {

            System.out.println(holder + " " + scan.nextLine());
            holder++;
        }
    }
}
