package com.leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

public class summaryRanges_229 {

    public static List<String> summaryRanges(int[] nums) {
        final String arrow = "->";
        List<String> ans = new ArrayList<>();

        if (nums.length == 0)
            return ans;

        int p = 0;
        int i = 0;

        for (i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] != 1) {
                StringBuilder s = new StringBuilder(); // new StringBuilder here

                if (p == (i - 1)) {
                    s.append(nums[p]);
                } else {
                    s.append(nums[p]).append(arrow).append(nums[i - 1]);
                }
                ans.add(s.toString());
                p = i;
            }
        }

        // Handle the last range after the loop
        StringBuilder s = new StringBuilder();
        if ((i - 1) == p) {
            s.append(nums[p]);
        } else {
            s.append(nums[p]).append(arrow).append(nums[i - 1]);
        }
        ans.add(s.toString());

        return ans;
    }

    public static void main(String... sujal) {
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> result = summaryRanges(nums);
        System.out.println(result);  // Output: [0->2, 4->5, 7]
    }
}
