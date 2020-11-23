package DataStructures.LinkedList;

// https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem
public class InsertANodeAtTheTailOfALinkedList {

    Node Insert(Node head,int data) {

        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
            return head;
        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;

        return head;

    }

}

/*
  Insert Node at the end of a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/
