package Leetcodes.Medium;

import java.util.*;

public class String_0003_LongestSubstringWithoutRepeatingCharacters {
	  public int lengthOfLongestSubstring(String s) {
	        int strlen = s.length();
	        HashSet fre = new HashSet();
	    
	        int max = 0;
	        int start = 0;
	        int end=0;
	        
	        while (end <strlen) {
	            char curChar = s.charAt(end);

	            if (!fre.contains(curChar)) {
	                //agar nahi kaar rakhi hai tho
	                fre.add(curChar);
	                max = Math.max(max, (end - start)+1);
	                end++;
	            } else {
	                //agar  kaar rakhi tho
	                fre.remove(s.charAt(start));
	                //  max = Math.max(max, (end - start)+1);
	                start++;

	            }
	        }
	        return max;

	    }
	  
	  public static void main(String[] args) {
		  
	  }

}
