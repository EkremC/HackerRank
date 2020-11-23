package Algorithms.Strings;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SuperReducedString {

    static String superReducedString(String s) {
        StringBuilder builder = new StringBuilder(s);
        for (int i = 1; i < builder.length(); i++) {
            if (builder.charAt(i) == builder.charAt(i - 1)) {
                builder.delete(i - 1, i + 1);
                i = 0;
            }
        }
        if (builder.length() == 0) {
            return "Empty String";
        }
        return builder.toString();
    }

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        String result = superReducedString(s);

      scanner.close();
    }
}
