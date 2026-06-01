package Leetcode.Medium;


public class Array_0189_Rotate_Array {
	 public static void reverseAnArray(int[] nums, int start, int end) {
	        while (start < end) {
	            if(end==0)
	            return;
	            nums[start] = nums[start] + nums[end];
	            nums[end] = nums[start] - nums[end];
	            nums[start] = nums[start] - nums[end];
	            start++;
	            end--;

	        }

	    }

	    public static void rotate(int[] nums, int k) {
	        int len = nums.length;
	        if (k > len)
	            k = k % len;

	        reverseAnArray(nums, 0, len - 1);//puri array reverse
	        reverseAnArray(nums, k, len-1);// k ke baad ke reverse
	        reverseAnArray(nums, 0, k-1);// k se phela taak reverse
	        

	    }

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		int k = 3;
		rotate(nums, k);
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}

}
