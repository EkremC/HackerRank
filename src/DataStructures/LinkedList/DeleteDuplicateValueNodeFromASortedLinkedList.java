package DataStructures.LinkedList;

// https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list/problem
public class DeleteDuplicateValueNodeFromASortedLinkedList {

    Node RemoveDuplicates(Node head){

        if(head == null){
            return null;
        }

        Node temp = head;
        while (temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }

        return head;

    }

}


/*
Node is defined as
  class Node {
     int data;
     Node next;
  }
*/