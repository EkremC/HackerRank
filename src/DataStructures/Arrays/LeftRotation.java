package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/array-left-rotation/problem
public class LeftRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        list = leftRotation(list, d);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        scanner.close();

    }

    static List<Integer> leftRotation(List<Integer> list, int d){
        for (int i = 0; i < d; i++) {
            list.add(list.get(0));
            list.remove(0);
        }
        return list;
    }
}
