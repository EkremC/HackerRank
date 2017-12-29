package DataStructures.Arrays;

// https://www.hackerrank.com/challenges/2d-array/problem

import java.util.Scanner;

public class TwoDArrayDS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(findMaxSum(arr));
    }

    private static int findMaxSum(int[][] arr){
        int maxSum= Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = arr[i + 0][j + 0] + arr[i + 0][j + 1] + arr[i + 0][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j + 0] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }
}
