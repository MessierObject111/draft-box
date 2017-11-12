package com.leetcode.searchForRange;

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if(nums == null || nums.length == 0){
            return result;
        }
        int start = 0;
        int end = nums.length -1;
        int mid;
        
        while(start + 1< end){
            mid = start + (end - start)/2;
            if(nums[mid] == target){
                end = mid;
            }else if(nums[mid] < target){
                start = mid;
            }
            else {
                end = mid;
            }
        }
        if(nums[start] == target) {
            result[0] = start;
        }else if(nums[end] == target) {
            result[0] = end;
        }else{
        	result[0] = result[1] = -1;
        	return result;
        }
        
        start = 0;
        end = nums.length -1;
        
        while(start + 1< end){
            mid = start + (end - start)/2;
            if(nums[mid] == target){
                start = mid;
            }else if(nums[mid] < target){
                start = mid;
            }
            else {
                end = mid;
            }
        }
        if(nums[end] == target) {
            result[1] = end;
        
        }else if(nums[start] == target) {
            result[1] = start;
        } else {
        	result[0] = result[1] = -1;
        	return result;
        }
        return result;
    }
}