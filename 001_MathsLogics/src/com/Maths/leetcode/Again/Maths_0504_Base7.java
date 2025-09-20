package com.Maths.leetcode.Again;

public class Maths_0504_Base7 {
	
	    public static String convertToBase7(int num) {
	        int n=0;
	        StringBuilder ans = new StringBuilder();
	        if(num==0)
	        return ans.append(0).toString();
	        if(num>=0){
	            n=num;

	        }else{
	            n=-1*num;
	        }


	         while(n!=0){
	         int take = n%7;
	          ans.append(take);
	          n=n/7;
	         }
	          if(num>=0){
	          
	         return ans.reverse().toString();

	        }else{
	    
	         return ans.append("-").reverse().toString();
	        }

	        
	    }
	

	

	public static void main(String[] args) {
		System.out.println(convertToBase7(38));

	}

}
