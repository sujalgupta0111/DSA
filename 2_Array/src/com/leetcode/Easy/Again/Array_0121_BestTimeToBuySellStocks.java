package com.leetcode.Easy.Again;

import java.util.Arrays;

public class Array_0121_BestTimeToBuySellStocks {

	public static int maxProfit(int[] prices) {
		int max = 0;
		int buyprice = prices[0];
		for (int i = 0; i < prices.length; i++) {
			if (buyprice < prices[i]) {
				int profit = prices[i] - buyprice;
				if (profit > max)
					max = profit;
			} else {
				buyprice = prices[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 7, 9, 2, 580 };
		int target = 9;
		System.out.println((maxProfit(arr)));

	}

}
