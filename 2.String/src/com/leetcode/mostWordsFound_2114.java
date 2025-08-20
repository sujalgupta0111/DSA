package com.leetcode;

public class mostWordsFound_2114 {
	
	public static  int count (String s)
	{
		int count =0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==' ')
				count ++;
		}
		return count+1;
	}
	
public static int mostWordsFound(String[] sentences) {
	int max =0;
	
	for(int i=0; i<sentences.length;i++)
	{
	  int t = count(sentences[i]);
	  
	  
	  max = Math.max(max,t);
	 
	}
        
	return max;
    }

	public static void main(String[] args) {
		
		String sentences[] = {"please wait", "continue to fight", "continue to win"};
		
		System.out.println(mostWordsFound(sentences));

	}

}
