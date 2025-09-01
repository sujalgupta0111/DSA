package com.leetcode;

public class Longest_Common_Prefix_14 {

	public static String longestCommonPrefix(String[] strs) {
		String ans = "";
		// substring ka index
		for (int i = 0; i <= strs[0].length(); i++) {
			ans = strs[0].substring(0, i);
            // yhea array ki length hai
			for (int j = 0; j < strs.length; j++) {
               //out of bount index bachane ko
				if (i > strs[j].length())
					return strs[j];
				if (!ans.equals(strs[j].substring(0, i))) {
					return strs[0].substring(0, i - 1);
				}
			}

			}
		return ans;
		}
	


	public static void main(String[] args) {
		//String s[]   ={"c","acc","ccc"};
		String s[] = { "flowhrt","flowht", "flow"};
		System.out.println(longestCommonPrefix(s));

		
	}

}
