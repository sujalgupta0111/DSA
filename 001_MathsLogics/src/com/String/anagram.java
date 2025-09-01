package com.String;
import java.util.Scanner;
public class anagram {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		String str = in.next();
		String t = in.next();
		
		boolean flag =true;
	
		int count[] =new int[27];
		for(int i =0; i<=str.length()-1;i++)
		{
			char c = str.charAt(i);
			count[ c-97]++;
		}
		for(int i =0; i<=t.length()-1;i++)
		{
			char c = t.charAt(i);
			count[ c-97]--;
		}
		
		for(int i =0; i<=count.length-1;i++)
		{
			if(count[i]!=0)
			{
				flag =false;
				break;
			}
		}
		
		System.out.println(flag);
		
		
		

	}

}
