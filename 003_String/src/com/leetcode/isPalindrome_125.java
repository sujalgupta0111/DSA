package com.leetcode;

public class isPalindrome_125 {

	public static boolean isPalindrome(String s) {

		if (s.equals(" ")) {
			return true;
		}
		String s1 = s.toLowerCase();
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (('a' <= s1.charAt(i) && 'z' >= s1.charAt(i) ) ||('0' <= s1.charAt(i) && '9' >= s1.charAt(i)) ) {
				sb.append(s1.charAt(i));
			}

		}

		int p1 = 0;
		int p2 = sb.length()-1;

		while (p1 < p2) {
			if (sb.charAt(p1) != sb.charAt(p2)) {
				return false;
			}
			
			p1++;
			p2--;

		}

		return true;

	}

	public static void main(String[] args) {

		String s = "race a car";

		System.out.println(isPalindrome(s));

	}

}
