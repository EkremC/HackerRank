package Java.Introduction;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-output-formatting/problem
public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            int stringSize = s1.length();
            System.out.print(s1);
            for (int j = 0; j < (15 - stringSize); j++) {
                System.out.print(" ");
            }
            if (x == 0)
                System.out.println("00" + x);
            else if (x < 100)
                System.out.println("0" + x);
            else
                System.out.println(x);


        }
        System.out.println("================================");
    }

}
