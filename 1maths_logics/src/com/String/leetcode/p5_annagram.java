package com.String.leetcode;
public class p5_annagram {
    
    public static boolean compare(String str ,String str2) {  
    	
    	int count [] = new int [28];
    	int x=0;
    	if(str.length()!=str2.length())
    	{
    	
    		return false;
    	}
    	
    	for(int i=0;i<=str.length()-1;i++)
    	{
    		count[str.charAt(i)-97]++;
    		count[str2.charAt(i)-97]--;
    	}
    	for(int i=0;i<=count.length-1;i++ )
    	{
    		if(count[i]!=0)
    		{
    			return false;
    		}
    		
    	}
    	
		return true;
		
    		
    	
    }

    public static void main(String[] args) {
        String str = "tttuuuyyy";
        String str2= "tuytuytuy";
        if(compare(str,str2))
        {
        	System.out.println("Anagram");	
        }
        else
        {
        	System.out.println("not anagram");
        }
        
    }
}
