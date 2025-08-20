package com.Maths.leetcode;
public class Romans_to_integers_13 {
    public static void main(String[] args) {
        String s = "ix";
        System.out.println(romanToInt(s));   // Output: 30
    }

    public static int romanToInt(String s) {
        s = s.toUpperCase();  // Convert to uppercase for consistency
        int result = 0, v1 = 0, v2 = 0;

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Switch to get Roman numeral value for the current character
            v2 = v1;
            v1 = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };

            // If the previous value (v2) is less than the current value (v1), subtract v2 from v1
            if (v2 < v1) {
                result += v1 - 2 * v2; // Subtract 2 * v2 because we already added v2 before
                System.out.println(result);
            } else {
                result += v1;
            }
        }
        return result;
    }
}
