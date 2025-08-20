package com.String;
public class p4 {
    
    public static String compress(String str) { 
        StringBuilder newstr = new StringBuilder();
        int count = 1;  // Start from 1 since we're already considering the first character

        for (int i = 1; i < str.length(); i++) { 
            char current = str.charAt(i);
            char previous = str.charAt(i - 1);
            
            if (current == previous) {
                count++;
            } else {
                newstr.append(previous).append(count);
                count = 1;  // Reset count for the new character
            }
        }

        // Append the last character and count
        newstr.append(str.charAt(str.length() - 1)).append(count);

        return newstr.toString();
    }

    public static void main(String[] args) {
        String str = "aaabcccccaaa";
        String s = compress(str);
        System.out.println(s);
    }
}
