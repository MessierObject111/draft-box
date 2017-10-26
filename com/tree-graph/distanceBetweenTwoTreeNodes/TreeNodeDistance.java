package com.amazon.distanceBetweenTwoTreeNodes;

import common.TreeNode;

public class TreeNodeDistance {
	private TreeNode commonAncestor;
	public void buildBST(int[] list, TreeNode root) {
		if(list == null || list.length == 0) return;
		for(int i = 1; i < list.length; i++) {
			insert(list[i], root);
		}	
	}
	
	private void insert(int element, TreeNode node) {
		if(element < node.val) {
			if(node.left == null) {
				node.left = new TreeNode(element);
			}else{
				insert(element, node.left);
			}
		}else{
			if(node.right == null) {
				node.right = new TreeNode(element);
			}else{
				insert(element, node.right);
			}
		}
	}
	
	public int distanceBetweenNodes(int[] list, int x, int y, TreeNode root) {
		buildBST(list, root);
		findLCA(x, y, root);
		int xDist = searchDistance(commonAncestor, findNode(x, root), 0);
		int yDist = searchDistance(commonAncestor, findNode(y, root), 0);
		return xDist + yDist;
	}
	
	
	private void findLCA(int x, int y, TreeNode node) {
		if(x == node.val || y == node.val || (x < node.val && y > node.val)) {
			commonAncestor = node;
		}
		if(x < node.val){
			findLCA(x, y, node.left);
		}
		if(x > node.val){
			findLCA(x, y, node.right);
		}
		return;
	}
	
	private int searchDistance(TreeNode base, TreeNode target, int distance){
		if(base == null) return -1;
		if(base.val == target.val) return distance;
		if(base.val < target.val){
			return searchDistance(base.right, target, distance + 1);
		}
		if(base.val > target.val) {
			return searchDistance(base.left, target, distance + 1);
		}
		return -1;
	}
	
	private TreeNode findNode(int target, TreeNode root){
		if(target == root.val) return root;
		if(target < root.val){
			return findNode(target, root.left);
		}
		return findNode(target, root.right);
	}

}
