package com.dynamicProgramming.coinsForChange;

public class MinCoinsForChangeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] amounts = {1, 2, 5, 10, 25};
		int target = 19;
		System.out.println(s.minNumberOfCoins(target));
		System.out.println(s.minCoins(amounts,5,target));

	}

}
