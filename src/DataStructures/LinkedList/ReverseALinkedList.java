package DataStructures.LinkedList;

// https://www.hackerrank.com/challenges/reverse-a-linked-list

public class ReverseALinkedList {


    Node Reverse(Node head) {

        if(head == null || head.next == null){
            return head;
        }

        Node revNode = Reverse(head.next);
        head.next.next = head;
        head.next = null;
        return revNode;
    }

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