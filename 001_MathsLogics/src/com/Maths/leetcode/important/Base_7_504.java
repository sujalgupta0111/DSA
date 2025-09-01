package com.Maths.leetcode.important;

public class Base_7_504 {

	/*public static String convertToBase7(int num) {
		int x=num;
		
		StringBuilder ans = new StringBuilder();
		if(num<0)
		{
			num*=-1;
		}

		do {
			int check = num % 7;
			ans.append(check);
			num /= 7;

		} while (num != 0);
		if(x<0)
		{
			ans.append("-");
		}

		ans.reverse();
		return new String(ans);

	}*/
	
	
	public static String convertToBase7(int num) {
        String h=Integer.toString(num,7);
        return h;
        
    }

	public static void main(String[] args) {

		System.out.println(convertToBase7(-7));
		
		
	    

	}

}
