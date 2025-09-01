package com.leetcode;

public class Check_if_All_Characters_Have_Equal_Number_of_Occurrences_1941 {

	public static boolean areOccurrencesEqual(String s) {
		int count[] = new int[26];

		int a = 0;
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 97]++;
		}

		for (int i = 0; i < 26; i++) {
			if (count[i] != 0) {
				a = count[i];
				break;

			}
		}

		for (int i = 0; i < 26; i++) {
			if (count[i] != a) {
				if (count[i] == 0) {
				} else {
					return false;
				}
			}

		}

		return true;
	}

	public static void main(String[] args) {

		String s = "bbb";
		System.out.println(areOccurrencesEqual(s));

	}

}
