package DataStructures.LinkedList;

// https://www.hackerrank.com/challenges/compare-two-linked-lists/problem
public class CompareTwoLinkedList {

    int CompareLists(Node headA, Node headB){

        if(headA == null && headB == null){
            return 1;
        }

        while (headA != null && headB != null){
            if(headA.data != headB.data){
                return 0;
            }
            headA = headA.next;
            headB = headB.next;
        }

        if(headA != null || headB != null){
            return 0;
        }

        return 1;
    }
}

/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not.
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/