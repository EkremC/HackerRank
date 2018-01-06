package DataStructures.LinkedList;

// https://www.hackerrank.com/challenges/reverse-a-linked-list

public class ReverseALinkedList {


    // Recursion
    Node Reverse(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        Node revNode = Reverse(head.next);
        head.next.next = head;
        head.next = null;
        return revNode;
    }


    // Iterative
   /*
    Node Reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
    */
}

/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/