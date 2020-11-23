package DataStructures.LinkedList;

// https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem
public class MergeTwoSortedLinkedLists {

    Node mergeLists(Node headA, Node headB) {

        if (headA == null) {
            return headB;
        } else if (headB == null) {
            return headA;
        }

        Node head = null;
        if (headA.data < headB.data) {
            head = headA;
            headA = headA.next;
        } else {
            head = headB;
            headB = headB.next;
        }

        Node temp = head;
        while (headA != null && headB != null) {
            if (headA.data < headB.data) {
                temp.next = headA;
                headA = headA.next;
            } else {
                temp.next = headB;
                headB = headB.next;
            }
            temp = temp.next;
        }

        if (headA == null) {
            temp.next = headB;
        } else {
            temp.next = headA;
        }

        return head;
    }

}


/*
  Merge two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as

class Node{
    int data;
    Node next;
}
 */
