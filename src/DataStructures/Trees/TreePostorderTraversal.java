package DataStructures.Trees;

// https://www.hackerrank.com/challenges/tree-postorder-traversal/problem
public class TreePostorderTraversal {

    void postOrder(Node root) {
        if (root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

}


/* you only have to complete the function given below.
Node is defined as

class Node {
    int data;
    Node left;
    Node right;
}

*/