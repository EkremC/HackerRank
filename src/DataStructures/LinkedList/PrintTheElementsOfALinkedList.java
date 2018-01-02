package DataStructures.LinkedList;

// https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem


public class PrintTheElementsOfALinkedList {

    void Print(Node head){
        if(head == null){
            return;
        }
        while (head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }

}

class Node{
    int data;
    Node next;
}
