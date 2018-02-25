package com.leetcode.twoSum;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){
            	System.out.println("i:"+i + " j:"+j);
                if(nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                    System.out.println("i:"+i + " j:"+j);
                    return res; 
                }
            }
        }
        return res; 
    }
}
