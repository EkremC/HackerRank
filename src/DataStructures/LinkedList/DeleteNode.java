package DataStructures.LinkedList;

// https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem
public class DeleteNode {

    Node Delete(Node head, int position) {

        if(position == 0){
            head = head.next;
            return head;
        }

        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;

    }

}

/*
  Delete Node at a given position in a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/