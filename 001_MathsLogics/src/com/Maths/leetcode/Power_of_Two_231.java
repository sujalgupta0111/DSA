package com.Maths.leetcode;

public class Power_of_Two_231 {

    // Function to calculate sum of digits (not reverse)
	public static  boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        } else if (n == 1) {
            return true;
        }

        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 38;  // Example number
        System.out.println(isPowerOfTwo(n));  // Output the count of numbers with even digit sum
    }
}
