package Math.leetcode.Again;

public class Maths_3079_FindtheSumofEncryptedIntegers {
	public static int encrypt(int x) {
		if(x==1000)
			return 1111;
		if (x <= 9) {
			return x;
			}
		final int mul[] = { 1, 11, 111 };
		int max = 0;
		int count = 0;
		while (x != 0) {
			int take = x % 10;
			if (take > max){
				max = take;
				}
			count++;
			x/=10;
			}
		return max*mul[count-1];
		}
	public static  int sumOfEncryptedInt(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += encrypt(nums[i]);
			}
		return sum;
		}
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		System.out.println(sumOfEncryptedInt(a));

	}

}
