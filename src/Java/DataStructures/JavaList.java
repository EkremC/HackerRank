package Java.DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-list/problem
public class JavaList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < loop; i++) {
            list.add(sc.nextInt());
        }

        int queries = sc.nextInt();
        for (int i = 0; i < queries; i++) {
            String queryType = sc.next();
            if (queryType.equals("Insert")) {
                int index = sc.nextInt();
                int number = sc.nextInt();
                list.add(index, number);
            } else {
                int index = sc.nextInt();
                list.remove(index);
            }
        }
        for (int a : list
                ) {
            System.out.print(a + " ");
        }
    }
}
