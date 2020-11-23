package DataStructures.LinkedList;

// https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem
public class InsertingANodeIntoASortedDoublyLinkedList {


    NodeDouble SortedInsert(NodeDouble head, int data) {

        NodeDouble newNode = new NodeDouble();
        newNode.prev = null;
        newNode.data = data;
        newNode.next = null;

        if (head == null) {
            head = newNode;
            return head;
        }

        NodeDouble temp = head;
        while (temp != null) {

            if (temp.next == null) {
                if (temp.data <= newNode.data) {
                    newNode.prev = temp;
                    temp.next = newNode;
                    break;
                } else {
                    newNode.prev = temp.prev;
                    temp.prev = newNode;
                    newNode.next = temp;
                    break;
                }
            } else {
                if (newNode.data >= temp.data && newNode.data <= temp.next.data) {
                    newNode.prev = temp;
                    newNode.next = temp.next;
                    temp.next.prev = newNode;
                    temp.next = newNode;
                    break;
                }
            }


            temp = temp.next;
        }

        return head;
    }

}


class NodeDouble {
    int data;
    NodeDouble next;
    NodeDouble prev;
}
