package DataStructures.LinkedList;

// https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem
public class CycleDetection {

    boolean hasCycle(Node head){

        if(head == null){
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (slow != null && fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }

        return false;
    }

}

/*

A Node is defined as:
    class Node {
        int data;
        Node next;
    }
*/