package DataStructures.Stack;

import java.util.Scanner;
import java.util.Stack;

// https://www.hackerrank.com/challenges/balanced-brackets/problem
public class BalancedBrackets {

    static String isBalanced(String s) {
        if (s.length() % 2 != 0) {
            return "NO";
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (currChar == '(' || currChar == '{' || currChar == '[') {
                stack.push(currChar);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                } else {
                    if ((currChar == ')' && stack.peek() != '(')
                            || (currChar == '}' && stack.peek() != '{')
                            || (currChar == ']' && stack.peek() != '[')) {
                        return "NO";
                    }
                    stack.pop();
                }
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }

}
