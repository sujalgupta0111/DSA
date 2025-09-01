package com.leetcode;

import java.util.Arrays;

public class Longest_Common_Prefix_14_sol2 {

	public static String longestCommonPrefix(String[] strs) {

		String ans = "";
		Arrays.sort(strs);
		String f = strs[0];
		String l = strs[strs.length - 1];

		for (int i = 0; i <f.length(); i++) {
			if (f.charAt(i) != l.charAt(i)) {
				return ans.toString();
			}
			ans += f.charAt(i);
		}
		return ans.toString();

	}

	public static void main(String[] args) {
		//String s[] = { "c", "acc", "ccc" };
		String s[] = { "flowhrt", "flowht", "flowty" }; 
		System.out.println(longestCommonPrefix(s));

	}

}
