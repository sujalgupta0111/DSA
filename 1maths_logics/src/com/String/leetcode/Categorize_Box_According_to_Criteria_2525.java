package com.String.leetcode;

public class Categorize_Box_According_to_Criteria_2525 {

	public static String categorizeBox(int length, int width, int height, int mass) {
		String Ans[] = { "Bulky", "Heavy", "Both", "Neither" };
		String b = null;
		String h = null;
		long volume = (long) length * width * height;
		if (length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1000000000)
			b = Ans[0];
		if (mass >= 100)
			h = Ans[1];

		if (b == Ans[0] && h == Ans[1])
			return Ans[2];
		else if (b != Ans[0] && h != Ans[1])
			return Ans[3];
		else if (b == Ans[0] && h != Ans[1])
			return Ans[0];
		else {
			return Ans[1];
		}

	}

	public static void main(String... strings) {
		int l = 1;
		int w = 1;
		int h = 1;
		int m = 1;
		System.out.println(categorizeBox(l, w, h, m));

	}
}
