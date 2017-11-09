package com.leetcode.printBinaryTree;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		
		
		TreeNode nodeL = new TreeNode(2);
		TreeNode nodeR = new TreeNode(3);
		
		TreeNode nodeLL = new TreeNode(4);

		root.left = nodeL;
		root.right = nodeR;
		nodeL.left = nodeLL;
		PrintBinaryTree pbt = new PrintBinaryTree();
		List<String> result = pbt.binaryTreePaths(root);
		int index = 0;
		while(index < result.size()){
			System.out.println(result.get(index));
			index++;
		}
	}

}
