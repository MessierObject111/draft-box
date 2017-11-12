package com.leetcode.searchForRange;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchRange sr = new SearchRange();
		int[] nums = {2, 2};
		int target = 2;
		int[] r = sr.searchRange(nums, target);
		for(int v : r){
			System.out.println(v);
		}

	}

}
