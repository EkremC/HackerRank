package Algorithms.Implementation;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/magic-square-forming/problem
public class FormingAMagicSquare {

    static int[][][] allMagicSquares = {
            {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},

            {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},

            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},

            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},

            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},

            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},

            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},

            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}
    };

    static int formingMagicSquare(int[][] s) {
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < 8; i++) {
            int cost = 0;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    cost += Math.abs(s[j][k] - allMagicSquares[i][j][k]);
                }
            }
            minCost = Math.min(cost, minCost);
        }
        return minCost;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        System.out.println(result);

        scanner.close();
    }
}
