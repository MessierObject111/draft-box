import common.TreeNode;

public class LongestUnivaluePath {
	int ans;
    public int longestUnivaluePath(TreeNode root) {
        ans = 0;
        arrowLength(root);
        return ans;
    }
    public int arrowLength(TreeNode node) {
        if (node == null) return 0;
        int left = arrowLength(node.left);
        int right = arrowLength(node.right);
        int arrowLeft = 0, arrowRight = 0;
        if (node.left != null && node.left.val == node.val) {
            arrowLeft += left + 1;
        }
        if (node.right != null && node.right.val == node.val) {
            arrowRight += right + 1;
        }
        ans = Math.max(ans, arrowLeft + arrowRight);
        return Math.max(arrowLeft, arrowRight);
    }
	/*
    public int longestUnivaluePath(TreeNode root) {
    	int MAX_LENGTH = 0;
    	if(root == null) return 0;
        int max = 0, leftSum = 0, rightSum = 0;
        if(root.left != null && root.val == root.left.val) {
            leftSum = traceDepth(root.left, 1);
        }
        if(root.right != null && root.val == root.right.val) {
            rightSum = traceDepth(root.right, 1);
        }
        MAX_LENGTH = MAX_LENGTH > (leftSum + rightSum) ? MAX_LENGTH : (leftSum + rightSum);
        if(root.left != null) {
            MAX_LENGTH = MAX_LENGTH > longestUnivaluePath(root.left) ? MAX_LENGTH : longestUnivaluePath(root.left);
        }
        if(root.right != null) {
            MAX_LENGTH = MAX_LENGTH > longestUnivaluePath(root.right) ? MAX_LENGTH : longestUnivaluePath(root.right);
        }
        
        return MAX_LENGTH;
    }
    
    private int traceBothSides(TreeNode root, int max) {
    	if(root == null) return 0;
        int leftSum = 0, rightSum = 0;
        if(root.left != null && root.val == root.left.val) {
            leftSum = traceDepth(root.left, 1);
        }
        if(root.right != null && root.val == root.right.val) {
            rightSum = traceDepth(root.right, 1);
        }
        max = max > (leftSum + rightSum) ? max : (leftSum + rightSum);
        if(root.left != null) {
        	max = max > longestUnivaluePath(root.left) ? max : longestUnivaluePath(root.left);
        }
        if(root.right != null) {
        	max = max > longestUnivaluePath(root.right) ? max : longestUnivaluePath(root.right);
        }
        
        return max;
    }
    
    private int traceDepth(TreeNode node, int depth) {
        if(node.left != null && node.val == node.left.val) {
            return traceDepth(node.left, depth + 1);
        }
        if(node.right != null && node.val == node.right.val) {
            return traceDepth(node.right, depth + 1);
        }
        return depth;
    }
    */
}
