package DataStructures.LinkedList;

// https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem
public class PrintReverse {
    void ReversePrint(Node head) {
        if (head == null)
            return;
        ReversePrint(head.next);
        System.out.println(head.data);
    }
}


/*
  Print elements of a linked list in reverse order
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/