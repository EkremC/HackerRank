package DataStructures.LinkedList;

// https://www.hackerrank.com/domains/data-structures/linked-lists
public class InsertANodeAtTheHeadOfALinkedList {

    Node Insert(Node head,int x) {
        Node node = new Node();
        node.data = x;
        node.next = head;
        return node;
    }

}


/*
  Insert Node at the beginning of a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/