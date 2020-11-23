package DataStructures.Trees;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

// https://www.hackerrank.com/challenges/tree-level-order-traversal/problem
public class TreeLevelOrderTraversal {

    void levelOrder(Node root) {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        Iterator it = queue.iterator();
        while (it.hasNext()) {
            Node current = queue.peek();
            System.out.print(current.data + " ");
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
            queue.remove();
        }
    }

}

/*

class Node {
    int data;
    Node left;
    Node right;
}
   */