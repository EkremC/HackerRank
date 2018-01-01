package DataStructures.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/sparse-arrays/problem
public class SparseArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Map<String, Integer> strings = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String line = scanner.next();
            if (!strings.containsKey(line)) {
                strings.put(line, 1);
            } else {
                strings.put(line, strings.get(line) + 1);
            }
        }

        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            String query = scanner.next();
            System.out.println(strings.containsKey(query) ? strings.get(query) : "0");
        }
    }

}
