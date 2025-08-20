package com.leetcode;

public class numOfStrings_1967 {

	public static int numOfStrings(String[] patterns, String word) {
		int s = 0;
		int end = patterns.length - 1;
		int count = 0;

		while (s <= end) {

			if (s == end) {

				if (word.contains(patterns[s])) {
					count++;
				}
				break;
			}
			if (word.contains(patterns[s])) {

				count++;
			}
			if (word.contains(patterns[end])) {

				count++;
			}

			s++;
			end--;
		}

		return count;

	}

	public static void main(String... sujal) {
		String patterns[] = { "a", "a", "a" };
		String word = "ab";
		System.out.println(numOfStrings(patterns, word));
	}
}
