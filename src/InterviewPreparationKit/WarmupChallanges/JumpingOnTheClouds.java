package InterviewPreparationKit.WarmupChallanges;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c) {
        int jumpCount = 1;

        for (int i = 0; i < c.length - 2;) {
            if (i + 1 == c.length - 1 || i + 2 == c.length - 1) {
                break;
            }
            if (i + 2 < c.length - 2 && c[i + 2] == 0) {
                i = i + 2;
            } else {
                i++;
            }
            jumpCount++;
        }

        return jumpCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        System.out.println(result);

        scanner.close();
    }
}
