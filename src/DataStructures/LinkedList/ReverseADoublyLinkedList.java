package DataStructures.LinkedList;

// https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem
public class ReverseADoublyLinkedList {

    NodeDouble Reverse(NodeDouble head){

        if(head == null){
            return head;
        }

        NodeDouble prev = null;
        NodeDouble curr = head;
        NodeDouble next = null;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }

        return prev;

    }

}
