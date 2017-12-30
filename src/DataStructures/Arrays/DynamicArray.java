package DataStructures.Arrays;

// https://www.hackerrank.com/challenges/dynamic-array/problem

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        int lastAnswer = 0;

        List<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < Q; i++) {
            int queryType = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            ArrayList<Integer> seq = list.get((x ^ lastAnswer) % N);
            if(queryType == 1){
                seq.add(y);
            }else{
                lastAnswer = seq.get(y % seq.size());
                System.out.println(lastAnswer);
            }
        }
    }
}
