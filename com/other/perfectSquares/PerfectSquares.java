package com.leetcode.snapchat.perfectSquares;

import java.util.Arrays;

public class PerfectSquares {
	public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for(int i = 0; i * i <= n; ++i) {
            dp[i * i] = 1;
        }
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j * j <= i; ++j) {
            	System.out.println("dp["+i+" - "+ j + " * " + j +"] = "+ dp[i - j * j]);
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }
}
