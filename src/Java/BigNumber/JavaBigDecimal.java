package Java.BigNumber;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-bigdecimal/problem
public class JavaBigDecimal {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                java.math.BigDecimal a = new java.math.BigDecimal(s1);
                java.math.BigDecimal b = new java.math.BigDecimal(s2);
                return b.compareTo(a); // descending order
            }
        };

        Arrays.sort(s, 0, n, customComparator);

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }


}
