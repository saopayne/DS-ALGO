package com.saopayne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by ademola on 24/03/2018.
 */
public class SerializeAndDeserializeBTree {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        ArrayList<Integer> treeList = new ArrayList<Integer>();
        serializeHelper(root, treeList);
        return treeList.toString();
    }

    private void serializeHelper(TreeNode root, ArrayList<Integer> result){
        if (root == null) {
            result.add(null);
            return;
        }
        result.add(root.val);
        serializeHelper(root.left, result);
        serializeHelper(root.right, result);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] strArray = data.substring(1, data.length() - 1).split(", ");
        Deque<String> strList = new LinkedList<String>(Arrays.asList(strArray));
        return deserializeHelper(strList);
    }

    private TreeNode deserializeHelper(Deque<String> strList){
        if (strList.size() == 0){
            return null;
        }
        String str = strList.pop();
        if (str.equals("null")) return null;
        TreeNode currentRoot = new TreeNode(Integer.parseInt(str));
        currentRoot.left = deserializeHelper(strList);
        currentRoot.right = deserializeHelper(strList);
        return currentRoot;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
     }

}
