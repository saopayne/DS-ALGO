package com.saopayne;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ademola on 23/03/2018.
 */
public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        ListNode newHead = new ListNode(0);
        newHead = head;
        List<Integer> values = new LinkedList<Integer>();
        if (head == null){
            return head;
        }
        while (head.next != null) {
            values.add(head.next.val);
            head = head.next;
        }
        Integer[] valuesArr = new Integer[values.size()];
        valuesArr = values.toArray(valuesArr);

        List<Integer> oddList = new LinkedList<Integer>();
        List<Integer> evenList = new LinkedList<Integer>();
        for (int i = 0; i < valuesArr.length; i++) {
            if (i%2 == 0) {
                // add to even list
                evenList.add(valuesArr[i]);
            } else {
                // add to odd list
                oddList.add(valuesArr[i]);
            }
        }
        ListNode finalNode = newHead;
        // convert odd list to linkedList
        for (int val: oddList) {
            finalNode.next.val = val;
            finalNode = finalNode.next;
        }
        // convert odd list to linkedList
        for (int val: evenList) {
            finalNode.next.val = val;
            finalNode = finalNode.next;
        }
        finalNode.next = null;

        return newHead;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
     }
}
