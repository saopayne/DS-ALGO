package com.saopayne;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ademola on 23/03/2018.
 */
public class BinaryTreeInOrderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        TreeNode curr = root;
        while (curr != null) {
            TreeNode prev = curr.left;
            if (prev != null) {
                while (prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }
                if (prev.right == null) {
                    prev.right = curr;
                    curr = curr.left;
                } else {
                    prev.right = null;
                    result.add(curr.val);
                    curr = curr.right;
                }
            } else {
                result.add(curr.val);
                curr = curr.right;
            }
        }
        return result;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
