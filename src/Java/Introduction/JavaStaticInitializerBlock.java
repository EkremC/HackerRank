package Java.Introduction;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-static-initializer-block/problem
public class JavaStaticInitializerBlock {

    static boolean flag = false;
    static int B, H;

    static {
        Scanner sc = new Scanner(System.in);

        B = sc.nextInt();
        H = sc.nextInt();
        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else
            flag = true;
    }

}
