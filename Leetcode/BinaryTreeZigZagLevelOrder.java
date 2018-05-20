package com.saopayne;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by ademola on 23/03/2018.
 */
public class BinaryTreeZigZagLevelOrder {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> orderList = new ArrayList<List<Integer>>();
        if (root == null) {
            return orderList;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        boolean flag = false;
        while (!stack.isEmpty()) {
            Stack<TreeNode> tpStack = new Stack<TreeNode>();
            List<Integer> list = new ArrayList<Integer>();
            while (!stack.isEmpty()) {
                TreeNode pop = stack.pop();
                list.add(pop.val);
                if (!flag) {
                    if (pop.left != null) {
                        tpStack.push(pop.left);
                    }
                    if (pop.right != null) {
                        tpStack.push(pop.right);
                    }
                } else {
                    if (pop.right != null) {
                        tpStack.push(pop.right);
                    }
                    if (pop.left != null) {
                        tpStack.push(pop.left);
                    }
                }
            }
            flag = !flag;
            orderList.add(list);
            stack = tpStack;
        }
        return orderList;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
