package list.linkedList.addingTwoNumbers;

import java.util.ArrayList;

import common.ListNode;

public class Solution {
	private static int overflow = 0;
    public static void add(ArrayList<Integer> al1, ArrayList<Integer> al2, ArrayList<Integer> res){
        for(int i=0; i<al1.size(); i++){
            int tempVal = 0;
            if(i<al2.size()){
                tempVal = al1.get(i)+al2.get(i)+overflow;
                if(tempVal/10 >= 1) {
                    overflow = tempVal/10;
                    tempVal = tempVal-overflow*10;
                } else {
                    overflow=0;
                }
            } else {
                tempVal = al1.get(i) + overflow;
                if(tempVal/10 >= 1) {
                    overflow = tempVal/10;
                    tempVal = tempVal-overflow*10;
                } else {
                    overflow=0;
                }
            }
            res.add(tempVal);
        }
        if(overflow>0){
            res.add(overflow);
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        ListNode head1 = l1;
        ListNode head2 = l2;
        al1.add(head1.val);
        while(head1.next!=null){
            head1=head1.next;
            al1.add(head1.val);
        }
        al2.add(head2.val);
        while(head2.next!=null){
            head2=head2.next;
            al2.add(head2.val);
        }
        if(al1.size()>=al2.size()){
            add(al1,al2,res);
        } else {
            add(al2,al1,res);
        }
        ListNode result = new ListNode(res.get(0));
        ListNode resHead = result;
        for(int j=1; j<res.size(); j++){
            ListNode ln = new ListNode(res.get(j));
            resHead.next = ln;
            resHead = resHead.next;
        }
        
        return result;
    }
}
