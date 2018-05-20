package com.saopayne;

/**
 * Created by ademola on 23/03/2018.
 */
public class NextRightPointer {

    public void connect(TreeLinkNode root) {
        if(root==null) return;
        TreeLinkNode cur = root;
        TreeLinkNode nextLeftmost = null;

        while(cur.left!=null){
            nextLeftmost = cur.left; // save the start of next level
            while(cur!=null){
                cur.left.next=cur.right;
                cur.right.next = cur.next==null? null : cur.next.left;
                cur=cur.next;
            }
            cur=nextLeftmost;  // point to next level
        }
    }

    private class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;
        TreeLinkNode(int x) { val = x; }
    }

}
