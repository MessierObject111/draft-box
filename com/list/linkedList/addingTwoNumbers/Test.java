package list.linkedList.addingTwoNumbers;

import common.ListNode;

public class Test {
	public static void main(String[] args){
		ListNode l1 = new ListNode(9);
		ListNode l2 = new ListNode(9);
		Solution s = new Solution();
		ListNode result = s.addTwoNumbers(l1, l2);
		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}
		
	}
	
}
