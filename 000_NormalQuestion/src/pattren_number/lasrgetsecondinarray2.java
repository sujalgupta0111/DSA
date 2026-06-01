package pattren_number;

import java.util.Scanner;

public class lasrgetsecondinarray2 {

	public static String num(int arr[]) {
		String ans = "";
		int s = 0;
		int f = 0;
		int count = 0;

		for (f = 1; f < arr.length; f++) {
			if (arr[f - 1] + 1 != arr[f]) {
				if (count != 0) {

					ans += arr[s] + "-" + arr[f - 1] + ",";
					s = f;
					count = 0;

				} else {
					ans += arr[s] + ",";
					s = f;
					count = 0;

				}
			} else
				count++;
		}
		if (count != 0) {
			ans += arr[s] + "-" + arr[f - 1];
			s = f;
			count = 0;

		} else {
			ans += arr[s];
			s = f;
			count = 0;

		}
		return ans;
	}

	public static void main(String... strings) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 9, 11, 15, 16, 17, 18, 26 };
		System.out.println(num(arr));
	}

}
