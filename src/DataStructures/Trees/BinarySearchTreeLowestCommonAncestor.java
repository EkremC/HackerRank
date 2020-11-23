package DataStructures.Trees;

// https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor/problem
public class BinarySearchTreeLowestCommonAncestor {

    static Node lca(Node root,int v1,int v2) {

        Node ancestor = null;

        if((v1 < root.data && v2 > root.data)
                || (v2 > root.data && v1 < root.data)
                || (v1 == root.data || v2 == root.data)){
            return root;
        }

        if(v1 < root.data && v2 < root.data)  ancestor = lca(root.left, v1, v2);
        if(v1 > root.data && v2 > root.data)  ancestor = lca(root.right, v1, v2);

        return ancestor;
    }

}


 /* Node is defined as :
 class Node
    int data;
    Node left;
    Node right;

    */