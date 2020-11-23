package Java.DataStructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-stack/problem
public class JavaStack {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);


        while (sc.hasNext()) {
            String input = sc.next();
            Deque<String> stack = new ArrayDeque<>();
            boolean flag = false;
            for (int k = 0; k < input.length(); k++) {
                if (input.substring(k, k + 1).equals("(") || input.substring(k, k + 1).equals("[")
                        || input.substring(k, k + 1).equals("{")) {
                    stack.push(input.substring(k, k + 1));
                } else if (input.substring(k, k + 1).equals(")") || input.substring(k, k + 1).equals("]")
                        || input.substring(k, k + 1).equals("}")) {
                    if (stack.isEmpty()
                            || input.substring(k, k + 1).equals(")") && !stack.peek().equals("(")
                            || input.substring(k, k + 1).equals("]") && !stack.peek().equals("[")
                            || input.substring(k, k + 1).equals("}") && !stack.peek().equals("{")) {
                        flag = true;
                        //System.out.println("NO");
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (flag || !stack.isEmpty()) {
                System.out.println("false");
                flag = false;
            } else if (stack.isEmpty()) {
                System.out.println("true");
            }
        }

    }
}
