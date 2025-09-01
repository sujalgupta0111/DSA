package com.leetcode;

public class reversePrefix_2000 {
	public static String reversePrefix(String word, char ch) {

		int i = word.indexOf(ch);
		if (i != -1) {
			StringBuilder ans = new StringBuilder(word.substring(0, i + 1));
			ans.reverse().append(word.substring(i + 1, word.length()));
            return ans.toString();
          }
		return word;

	}

	public static void main(String[] args) {
		String s = "xyxzxe";
		char c = 'a';

		System.out.println(reversePrefix(s, c));

	}

}
