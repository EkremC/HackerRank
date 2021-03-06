package Algorithms.Strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/strong-password/problem
public class StrongPassword {

    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int count = 0;

        if (!password.matches(".*[a-z].*")) {
            count++;
        }
        if (!password.matches(".*[A-Z].*")) {
            count++;
        }
        if(!password.matches(".*[0-9].*")) {
            count++;
        }
        if(password.matches("[a-zA-Z0-9]*")) {
            count++;
        }

        int lenDiff = 6 - password.length();

        if(lenDiff > 0 && count <= lenDiff) {
            return lenDiff;
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
