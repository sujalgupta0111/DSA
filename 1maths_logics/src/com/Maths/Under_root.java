package com.Maths;
import java.util.Scanner;

public class Under_root {

    public static void main(String[] args) {
        long input = 2147483647;
        System.out.println(input);
        System.out.println(Under(input));
    }

    public static int Under(long x) {
        // Handle edge cases
        if (x == 0 || x == 1) {
            return (int) x;  // Square root of 0 is 0, and square root of 1 is 1
        }

        int ans = 0;
        long mid = x / 2;

        // Loop through possible values of i from 0 to x/2
        for (int i = 0; i <= mid; i++) {
            if (i * i > x) {
                ans = i - 1;  // Found the first i whose square exceeds x
                break;         // Stop once we find the answer
            }
        }

        return (int)ans;
    }
}
