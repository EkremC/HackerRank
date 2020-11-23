package DataStructures.LinkedList;

// https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem
public class InsertANodeAtASpecificPositionInALinkedList {

    Node InsertNth(Node head, int data, int position) {
        Node node = new Node();
        node.data = data;
        node.next = null;


        if (position == 0) {
            node.next = head;
            head = node;
            return head;
        }

        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;

        return head;

    }

}


/*
  Insert Node at a given position in a linked list
  head can be NULL
  First element in the linked list is at position 0
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/