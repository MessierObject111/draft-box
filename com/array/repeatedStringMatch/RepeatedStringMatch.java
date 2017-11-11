package com.leetcode.repeatedStringMatch;

public class RepeatedStringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "ABC";
		String B = "ABABCABCABC";
		System.out.println(repeatedStringMatch(A, B));

	}
	
	public static int repeatedStringMatch(String A, String B) {
		int count = 0;
	    StringBuilder sb = new StringBuilder();
	    while (sb.length() < B.length()) {
	        sb.append(A);
	        count++;
	    }
	    if(sb.toString().contains(B)) return count;
	    if(sb.append(A).toString().contains(B)) return ++count;
	    return -1;
	}

}
