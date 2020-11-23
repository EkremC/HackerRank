package DataStructures.Trees;

// https://www.hackerrank.com/challenges/tree-top-view/problem
public class TreeTopView {

    void topView(Node root) {
        if (root == null)
            return;
        leftTree(root);
        rightTree(root);
    }

    void leftTree(Node root) {
        if (root == null) {
            return;
        }
        leftTree(root.left);
        System.out.print(root.data + " ");
    }

    void rightTree(Node root) {
        if (root == null) {
            return;
        }
        root = root.right;
        while (root != null) {
            System.out.print(root.data + " ");
            root = root.right;
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