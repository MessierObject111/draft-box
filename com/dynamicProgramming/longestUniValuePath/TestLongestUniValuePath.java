import common.TreeNode;

public class TestLongestUniValuePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestUnivaluePath l = new LongestUnivaluePath();
		LongestUnivaluePath o = new LongestUnivaluePath();
		
		TreeNode root = new TreeNode(0);
		TreeNode rootL = new TreeNode(0);
		TreeNode rootR = new TreeNode(0);
		TreeNode rootLL = new TreeNode(3);
		TreeNode rootLR = new TreeNode(0);
		TreeNode rootLLR = new TreeNode(5);
		root.left = rootL;
		root.right = rootR;
		rootL.left = rootLL;
		rootL.right = rootLR;
		rootLL.right = rootLLR;
		System.out.println(l.longestUnivaluePath(root));
		
		TreeNode node0 = new TreeNode(1);
		System.out.println(l.longestUnivaluePath(node0));
		/*
		int a = 0;
		int b = a;
		a = 1;
		System.out.println(b);
		l.MAX_LENGTH = 0;
		o = l;
		l.MAX_LENGTH = 1;
		System.out.println(o.MAX_LENGTH);
		*/
	}

}
