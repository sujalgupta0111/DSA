package com.leetcode;

public class lengthOfLastWord_58 {
	
public static int lengthOfLastWord(String s) {
	
	
	String wor[] = s.split(" ");
	
	return wor[wor.length-1].length();
        
    }
	
public static void main(String ...strings ) {
	String s="luffy is still joyboy";
	System.out.println(lengthOfLastWord(s));
}
}
