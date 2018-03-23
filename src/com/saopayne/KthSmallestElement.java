package com.saopayne;

/**
 * Created by ademola on 23/03/2018.
 */
public class KthSmallestElement {

    int count = 0;
    int result = Integer.MIN_VALUE;

    public int kthSmallest(TreeNode root, int k) {
        traverse(root, k);
        return result;
    }

    public void traverse(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        traverse(root.left, k);
        count++;
        if (count == k) {
            result = root.val;
        }
        traverse(root.right, k);
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
