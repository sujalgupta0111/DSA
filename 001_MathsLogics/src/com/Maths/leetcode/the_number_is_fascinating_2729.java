package com.Maths.leetcode;

public class the_number_is_fascinating_2729 {
	public static boolean isFascinating(int n) {
		String check = "123456789";
		String tell = "" + n + (n * 2) + (n * 3);

		if (check.length() != tell.length())
			return false;
		else {
			for (int i = 0; i < tell.length(); i++) {
				String l = ""+tell.charAt(i);
				if(check.contains(l))
				{
					 check = check.replaceFirst("" + tell.charAt(i), "");
				}
				else
				{
					return false;
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {

	
		System.out.println(isFascinating(192));

	}

}
