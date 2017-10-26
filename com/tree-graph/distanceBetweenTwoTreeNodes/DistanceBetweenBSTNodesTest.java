package com.amazon.distanceBetweenTwoTreeNodes;

import common.TreeNode;

public class DistanceBetweenBSTNodesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {5,6,3,1,2,4};
		TreeNodeDistance tnd = new TreeNodeDistance();
		int x = 6, y = 2;
		TreeNode root = new TreeNode(list[0]);
		tnd.buildBST(list, root);
		
		//System.out.println(root.left.val+" "+root.right.val);
		printNodes(root);
		System.out.println(tnd.distanceBetweenNodes(list, x, y, root));

	}
	
	public static void printNodes(TreeNode node) {
		
		if(node.left != null){
			printNodes(node.left);
		}
		
		if(node.right != null){
			printNodes(node.right);
		}
		
		if(node != null){
			System.out.println(node.val);
		}
	}

}
