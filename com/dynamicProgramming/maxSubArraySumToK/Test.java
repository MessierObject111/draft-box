package com.leetcode.maxSubArraySumToK;

public class Test {
	public static void main(String[] args){
		Solution s = new Solution();
		int[] nums = {1, 2, 3, 5, 7};
		int k = 3;
		System.out.println(s.maxSubArrayLen(nums, k));
	}

}
