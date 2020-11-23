package Java.Strings;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-string-tokens/problem
public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        int length = 0;

        String[] strings = s.split("[_\\@ !,?.'/]+");
        for (String string : strings) {
            if (!string.equals("")) {
                length++;
            }
        }

        System.out.println(length);

        for (String string : strings) {
            if (!string.equals("")) {
                System.out.println(string);
            }

        }
    }
}
