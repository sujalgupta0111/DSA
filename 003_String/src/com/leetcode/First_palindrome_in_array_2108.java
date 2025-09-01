package com.leetcode;

public class First_palindrome_in_array_2108 {

	
	public static boolean palindraomr(String s)
	{
		int start=0;
		int end=s.length()-1;
		
		while(start<end)
		{
			if(s.charAt(start) != s.charAt(end))
				return false;
			start++;
			end--;
		}
		
		return true;
		
	}
	
public String firstPalindrome(String[] words) {
	
for(int i=0;i<words.length;i++)	{
	if(palindraomr(words[i]))
	{
		return words[i];
	}
}
       return " ";
    }
	public static void main(String[] args) {
		String s ="aab";
		System.out.println(palindraomr(s));

	}

}
