package com.leetcode.maxSubArray;

public class MaxSubArray {
	public int maxSubArray(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		int max = nums[0];
        int[] dp = new int[nums.length];//This stores the max sub array sum till i th number of nums.
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            dp[i] = nums[i] + (dp[i - 1] > 0 ?  dp[i - 1] : 0);//Vital logic
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
