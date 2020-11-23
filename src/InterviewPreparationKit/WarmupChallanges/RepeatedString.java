package InterviewPreparationKit.WarmupChallanges;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class RepeatedString {

    static long repeatedString(String s, long n) {
        long repeateNum = 0;
        if (s.length() == 1 && s.equals("a")) {
            repeateNum = n;
        }
 // 10 / 3 kere ekle, +1 de stringden kes
        return repeateNum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println(result);

        scanner.close();
    }
}
