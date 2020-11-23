package Java.DataStructures;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-negative-subarray/problem
public class JavaSubarray {
    /* This is NOT a good solution!!! */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int negativeSumCounter = 0;
        int lastSum = 0;
        for (int i = 0; i < n; i++) {
            lastSum += arr[i];
            for (int j = i; j < n; j++) {
                if (i == j && arr[i] < 0) {
                    negativeSumCounter++;
                } else {
                    if (j > i) {
                        lastSum += arr[j];
                        if (lastSum < 0)
                            negativeSumCounter++;
                    }
                }

            }
            lastSum = 0;
        }

        System.out.println(negativeSumCounter);
    }
}
