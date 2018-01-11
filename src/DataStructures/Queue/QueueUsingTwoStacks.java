package DataStructures.Queue;

import java.util.Scanner;
import java.util.Stack;

// https://www.hackerrank.com/challenges/queue-using-two-stacks/problem
public class QueueUsingTwoStacks {

    public static void main(String[] args) {
        QueueofStacks queue = new QueueofStacks();
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            switch (type){
                case 1:
                    queue.enqueue(sc.nextInt());
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    System.out.println(queue.front());
                    break;
            }
        }
    }


    private static class QueueofStacks{
        private Stack<Integer> push = new Stack<>();
        private Stack<Integer> pop = new Stack<>();

        public void enqueue(int x){
            push.push(x);
        }

        public void dequeue(){
            if(push.isEmpty() && pop.isEmpty()){
                return;
            }

            if(pop.isEmpty()){
                while (!push.isEmpty()){
                    pop.push(push.pop());
                }
            }

            pop.pop();

        }

        public Integer front(){
            if(push.isEmpty() && pop.isEmpty()){
                return null;
            }

            if(pop.isEmpty()){
                while (!push.isEmpty()){
                    pop.push(push.pop());
                }
            }

            return pop.peek();
        }
    }

}
