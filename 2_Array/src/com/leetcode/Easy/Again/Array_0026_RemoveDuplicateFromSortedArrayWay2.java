package com.leetcode.Easy.Again;

import java.util.Arrays;

class Array_0026_RemoveDuplicateFromSortedArrayWay2 {


	public static void main(String[] args) {
		int[] numbers = {1,1,2};
		  // Array को Stream में बदलें और distinct() से डुप्लिकेट हटाएं
        int[] uniqueNumbers = Arrays.stream(numbers)
                                    .distinct()
                                    .toArray();

        // परिणाम प्रदर्शित करें
        System.out.println("Unique Elements: " + Arrays.toString(uniqueNumbers));
        System.out.println(uniqueNumbers.length);


	}

}
