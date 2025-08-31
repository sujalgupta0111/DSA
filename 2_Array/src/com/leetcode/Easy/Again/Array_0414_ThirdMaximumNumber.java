package com.leetcode.Easy.Again;

import java.util.HashSet;

public class Array_0414_ThirdMaximumNumber {

    public static int thirdMax(int[] nums) {
        int first = null, second = null, third = null;

        for (int num : nums) {
            long n = (long) num;

            if ((first != null && n == first) ||
                (second != null && n == second) ||
                (third != null && n == third)) {
                continue;
            }

            if (first == null || n > first) {
                third = second;
                second = first;
                first = n;
            } else if (second == null || n > second) {
                third = second;
                second = n;
            } else if (third == null || n > third) {
                third = n;
            }
        }

        return third == null ? first : third;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 4, 2, 99, 5, 6, 4, 7, 8 };
        System.out.println(thirdMax(arr)); // Should print 7
    }
}
