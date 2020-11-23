package DataStructures.Trees;

// https://www.hackerrank.com/challenges/tree-preorder-traversal/problem
public class TreePreorderTraversal {

    void preOrder(Node root){
        if(root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

}


class Node {
    int data;
    Node left;
    Node right;
}
