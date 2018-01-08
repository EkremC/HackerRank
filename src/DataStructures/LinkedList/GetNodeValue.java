package DataStructures.LinkedList;

// https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail/problem
public class GetNodeValue {

    int GetNode(Node head, int n) {

        Node temp = head;
        for (int i = 0; i < n; i++) {
            temp = temp.next;
        }

        while (temp.next != null) {
            temp = temp.next;
            head = head.next;
        }

        return head.data;

    }

}


/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/