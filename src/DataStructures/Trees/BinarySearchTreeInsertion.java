package DataStructures.Trees;

// https://www.hackerrank.com/challenges/binary-search-tree-insertion/problem
public class BinarySearchTreeInsertion {

    static Node Insert(Node root, int value) {

        if (root == null) {
            root = getNewNode(value);
        } else if (value <= root.data) {
            root.left = Insert(root.left, value);
        } else {
            root.right = Insert(root.right, value);
        }
        return root;
    }

    static Node getNewNode(int value) {
        Node node = new Node();
        node.left = null;
        node.right = null;
        node.data = value;
        return node;
    }

}

 /* Node is defined as :
 class Node
    int data;
    Node left;
    Node right;

    */