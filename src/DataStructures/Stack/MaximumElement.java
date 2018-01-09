package DataStructures.Stack;

import java.util.Scanner;
import java.util.Stack;

// https://www.hackerrank.com/challenges/maximum-element/problem
public class MaximumElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> elements = new Stack<>();
        Stack<Integer> maxElement = new Stack<>();

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int query = sc.nextInt();
            if (query == 1) {
                int number = sc.nextInt();
                elements.push(number);
                if (maxElement.isEmpty() || number >= maxElement.peek()) {
                    maxElement.push(number);
                }
            } else if (query == 2) {
                int topElement = elements.pop();
                if (topElement == maxElement.peek()) {
                    maxElement.pop();
                }
            } else {
                System.out.println(maxElement.peek());
            }
        }
    }
}
