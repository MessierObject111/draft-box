package com.leetcode.printBinaryTree;
import common.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class PrintBinaryTree {
	private ArrayList<String> result = new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null){
            return null;
        }
        List<Integer> list = new ArrayList<Integer>();
        printTreeHelper(root, list);
        return this.result;
    }
    private void printTreeHelper(TreeNode node, List<Integer> list){
        if(node == null){
        	String s = list.toString();
            this.result.add(s);
        }
        list.add(1);
        printTreeHelper(node.left, list);
        printTreeHelper(node.right, list);
    }

}
