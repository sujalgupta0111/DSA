package Math.leetcode.Again;

public class Maths_2520_CountTheDigitsThatDivideANumber {
	  public static int countDigits(int num) {
	        if(num<=9)
	        return 1;
	         int num2 = num;
	         int count=0;

	         while(num2!=0){
	            int take = num2%10;
	            if(num%take==0){
	                count++;
	            }
	            num2=num2/10;
	         }
	        return count;
	    }

	public static void main(String[] args) {
		System.out.println(countDigits(121));

	}

}
