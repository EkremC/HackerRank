package Algorithms.Strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem
public class SherlockAndTheValidString {
    static String isValid(String s) {
        int[] arr = new int[26];

        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }

        Arrays.sort(arr);
        int i = 0;
        while (arr[i] == 0) {
            i++;
        }

        int min = arr[i];
        int max = arr[25];
        if (min == max) {
            return "YES";
        }
        if(((max - min == 1) && (max > arr[24])) ||
                (min == 1) && (arr[i+1] == max))
            return "YES";

        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        String result = isValid(s);
        System.out.println(result);

        scanner.close();
    }
}
