package com.leetcode;

public class sPrefixString_1961 {

	public static boolean isPrefixString(String s, String[] words) {

		for (int i = 0; i < words.length; i++) {
			if (!s.contains(words[i]))
				return false;

		}

		return true;

	}

	public static void main(String[] args) {
		String s = "iloveleetcode";
		String[] w = { "i", "love", "leetcode", "apples" };

		System.out.println(isPrefixString(s, w));

	}

}
