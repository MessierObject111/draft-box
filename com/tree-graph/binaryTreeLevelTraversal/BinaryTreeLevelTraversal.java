
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import common.TreeNode;

public class BinaryTreeLevelTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root == null) return result;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while(q.size() > 0) {
        	int size = q.size();
        	//IMPORTANT: this is a fixed number in this loop, don't try
        	// delete this line because q.size() will change in the for loop
            List<Integer> list = new LinkedList<Integer>();
            for(int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                list.add(node.val);
                if(node.left != null) {
                    q.offer(node.left);
                }
                if(node.right != null) {
                    q.offer(node.right);
                }
            }
            result.add(list);
        }
        return result;
    }
}
