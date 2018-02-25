package com.dynamicProgramming.coinsForChange;

public class Solution {
	
	public int minNumberOfCoins(int sum){
		if (sum == 0) return 0;
		int[] amounts = {1, 2, 5, 10, 25};
		//int[] dp = new int[sum + 1];
		int res = Integer.MAX_VALUE;
		for(int i = 0; i < amounts.length && sum - amounts[i] >= 0; i++) {
			int sub_res = minNumberOfCoins(sum - amounts[i]);
			if(sub_res + 1 < res){
				res = sub_res + 1;
			}
		}
		return res;
	}
	
	static int minCoins(int coins[], int m, int V)
    {
       // base case
       if (V == 0) return 0;
      
       // Initialize result
       int res = Integer.MAX_VALUE;
      
       // Try every coin that has smaller value than V
       for (int i=0; i<m; i++)
       {
         if (coins[i] <= V)
         {
             int sub_res = minCoins(coins, m, V-coins[i]);
      
             // Check for INT_MAX to avoid overflow and see if
             // result can minimized
             if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
                res = sub_res + 1;
         }
       }
       return res;
    }
}
