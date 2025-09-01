package BinarySearch;

public class BinarySearch {

	public static int binarySearch(int nums[], int Target) {
		int start = 0;
		int end = nums.length - 1;
		int count = 0;
		int mid =0;

		while (start <= end) {

			mid = (start + end) / 2;

			if (nums[mid] == Target)
				return mid;
			else if (nums[mid] > Target) {
				end = mid - 1;

			} else {
				start = mid + 1;
			}

		}

		return mid+1;

	}

	public static void main(String... Sujal) {

		int nums[] = { 1,3,5,6};

		int target = 2;

		System.out.println(binarySearch(nums, target));

	}
}
