package com.Maths.leetcode;

public class Add_digits_258 {

	public static int addDigits(int num) {
		if (num <= 9)
			return num;

		return 1 + (num - 1) % 9;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int  a =999;
		System.out.println(10 % 9);
	}

}



/*public class Power_of_Two_231 {

    // Function to calculate sum of digits (not reverse)
    public static int digsum(int n) {
        int sum = 0;
        while (n != 0) {
            int take = n % 10;  // Get last digit
            sum += take;        // Add the digit to the sum
            n = n / 10;         // Remove the last digit
        }
        return sum;  // Return the sum of digits
    }

    // Function to check if a number is even
    public static boolean even(int x) {
        return x % 2 == 0;
    }

    // Function to count how many numbers have an even sum of digits
    public static int countEven(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (even(digsum(i))) {  // Check if the digit sum is even
                count++;  // Increment count if sum is even
            }
        }
        return count;  // Return the count of numbers with even digit sum
    }

    public static void main(String[] args) {
        int n = 38;  // Example number
        System.out.println(countEven(n));  // Output the count of numbers with even digit sum
    }
}*/