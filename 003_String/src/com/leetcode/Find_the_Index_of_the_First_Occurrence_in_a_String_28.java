package com.leetcode;

public class Find_the_Index_of_the_First_Occurrence_in_a_String_28 {

	public static int strStr(String haystack, String needle) {
		int hl=haystack.length();
		int nl= needle.length();

		for(int i=0; i<=hl-nl;i++)
		{
			String sub = haystack.substring(i,i+nl);
			if(needle.equals(sub))
			{
				return i;
			}
		}
		return 1;

	}

	public static void main(String[] args) {

		System.out.println(strStr("abc", "c"));
	}

}
