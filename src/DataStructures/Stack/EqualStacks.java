package DataStructures.Stack;

import java.util.Scanner;
import java.util.Stack;

// https://www.hackerrank.com/challenges/equal-stacks/problem
public class EqualStacks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        int h1Sum = 0;
        int h2Sum = 0;
        int h3Sum = 0;
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
            h1Sum += h1[h1_i];
        }

        for (int i = h1.length - 1 ; i >= 0; i--) {
            stack1.push(h1[i]);
        }

        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
            h2Sum += h2[h2_i];
        }

        for (int i = h2.length - 1 ; i >= 0; i--) {
            stack2.push(h2[i]);
        }

        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
            h3Sum += h3[h3_i];
        }

        for (int i = h3.length - 1 ; i >= 0; i--) {
            stack3.push(h3[i]);
        }

        while (h1Sum != h2Sum || h1Sum != h3Sum){
            if(stack1.isEmpty() || stack2.isEmpty() || stack3.isEmpty()){
                System.out.println("0");
                System.exit(0);
            }
            if(h1Sum > h2Sum){
                h1Sum -= stack1.pop();
                continue;
            }else if(h2Sum > h1Sum){
                h2Sum -= stack2.pop();
                continue;
            }

            if(h2Sum > h3Sum){
                h2Sum -= stack2.pop();
                continue;
            }else if(h3Sum > h2Sum){
                h3Sum -= stack3.pop();
                continue;
            }

            if(h1Sum > h3Sum){
                h1Sum -= stack1.pop();
                continue;
            }else if(h3Sum > h1Sum){
                h3Sum -= stack3.pop();
                continue;
            }

        }

        System.out.println(h1Sum);
    }

}
