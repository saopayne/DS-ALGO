package com.saopayne;

import java.util.HashSet;

/**
 * Created by ademola on 23/03/2018.
 */
public class IntersectionOfLinkedList {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null || headB==null) {
            return null;
        }

        HashSet nodeStoreSet = new HashSet();
        ListNode current1 = headA;
        ListNode current2 = headB;

        while (current1!=null) {
            nodeStoreSet.add(current1);
            current1=current1.next;
        }

        while (current2!=null) {
            if (nodeStoreSet.contains(current2)) {
                return current2;
            }
            current2 = current2.next;
        }
        return null;
    }

    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
