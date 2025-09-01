package com.leetcode;

import java.util.Arrays;

public class capitalizeTitle_2129 {

	public static String capitalizeTitle(String title) {
		if (title.length() == 1)
			return null;
		
		int slow=0;
		
		StringBuilder ans = new StringBuilder();
		
		for(int fast=0; fast<title.length();fast++)
		{
		
			if(title.charAt(fast)==' ' || fast==title.length()-1)
			{
				if((fast-slow)>2)
				{
					ans.append(title.substring(slow,slow+1).toUpperCase()).append(title.substring(slow+1,fast+1).toLowerCase());
				}
				else
				{
					ans.append(title.substring(slow,fast+1).toLowerCase());
				}
				
				slow=fast+1;
			}
		
		}
		
		
		
		

		return ans.toString();

	}

	public static void main(String[] args) {
		String ans = "L hV";
		String ans1 = "Sujal gupta IS GREATEST";
		System.out.println(capitalizeTitle(ans));

		/*char x[] = ans.toCharArray();
		System.out.println(Arrays.toString(x));
		System.out.println(String.valueOf(x));*/

	}

}
