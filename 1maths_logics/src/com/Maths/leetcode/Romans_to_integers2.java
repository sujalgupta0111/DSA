package com.Maths.leetcode;
public class Romans_to_integers2 {
    public static void main(String[] args) {
    	String s ="Xm";
        System.out.println(romanToInt(s));   // Output: 9
        }

    public static int romanToInt(String s) {
        int total = 0;
        s= s.toLowerCase();
        
        for (int i = 0; i < s.length(); i++) {
            int currentValue = getRomanValue(s.charAt(i));

            // If we are not at the last character and the current value is smaller than the next character, subtract it
            if (i + 1 < s.length() && currentValue < getRomanValue(s.charAt(i + 1))) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
        }
        
        return total;
    }

    // Helper method to return Roman numeral value
    public static int getRomanValue(char roman) {
        switch (roman) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
