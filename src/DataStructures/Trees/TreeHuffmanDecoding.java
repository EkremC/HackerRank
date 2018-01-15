package DataStructures.Trees;

// https://www.hackerrank.com/challenges/tree-huffman-decoding/problem
public class TreeHuffmanDecoding {

    void decode(String s, Node root) {

        if (root == null) return;

        Node temp = root;
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                temp = temp.right;
            } else {
                temp = temp.left;
            }

            if (temp.data != '\0') {
                System.out.print(temp.data);
                temp = root;
            }
        }
    }

}

/*
class Node {
    public int frequency; // the frequency of this tree
    public char data;
    public Node left, right;
}*/


