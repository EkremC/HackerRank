package DataStructures.LinkedList;

import java.util.HashSet;
import java.util.Set;

// https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem
public class FindMergePointOfTwoLists {

    int FindMergeNode(Node headA, Node headB){

        Set<Integer> set = new HashSet<>();
        int mergeData = Integer.MIN_VALUE;


        while (headA != null){
            set.add(headA.data);
            headA = headA.next;
        }

        while (headB != null){
            if(!set.add(headB.data)){
                mergeData = headB.data;
                break;
            }
            headB = headB.next;
        }

        return mergeData;
    }

}

/*
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/