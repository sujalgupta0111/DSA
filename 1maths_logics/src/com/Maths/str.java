package com.Maths;
import java.util.*;
public class str {
	
	static public int [] give(String str)
	{
		int count[] = new int[11];
		 for(int i =0; i<=str.length()-1;i++)
		 {
			 char  check = str.charAt(i);
			 if(check =='(')
			 {
				 count[1]++;
				 count[4]++;
			 }
			 if(check ==')')
			 {
				 count[1]--;
				 count[5]++;
			 }
			 if(check =='{')
			 {
				 count[2]++;
				 count[6]++;
			 }
			 if(check =='}')
			 {
				 count[2]--;
				 count[7]++;
			 }
			 if(check =='[')
			 {
				 count[3]++;
				 count[8]++;
			 }
			 if(check ==']')
			 {
				 count[3]--;
				 count[9]++;
			 }
		 }
		 
		 
		 for(int i= 1; i<=3;i++)
		 {
		 if(count[i]!= 0)
		 {
			 count[0]= 1;
			 break;
		 }
		
		 }
		return count;
	}
	public static void main(String ... sujal)
	{
		Scanner in = new Scanner (System.in);
		 String str = in.next();
		 int checker [] = give(str);
		 boolean flag = true ;
		 if(checker[0] == 1)
		 {
			 flag=false;
		 }
		 if(flag == false)
		 {
			 System.out.println(false);
			 if(checker[4]!= checker[5])
			 {
				 if(checker[4]> checker[5])
				 {
					 int sum = checker[4]-checker[5];
					System.out.println("You miss "+sum+" ')'"); 
				 }
				 if(checker[4]< checker[5])
				 {
					 int sum = checker[5]-checker[4];
						System.out.println("You miss "+sum+" '('"); 
				 }
			 } 
			 
			 if(checker[6]!= checker[7])
			 {
				 if(checker[6]> checker[7])
				 {
					 int sum = checker[6]-checker[7];
					System.out.println("You miss "+sum+" ')'"); 
				 }
				 if(checker[6]< checker[7])
				 {
					 int sum = checker[7]-checker[6];
						System.out.println("You miss "+sum+" '('"); 
				 }
			 } 
			 if(checker[8]!= checker[9])
			 {
				 if(checker[8]> checker[9])
				 {
					 int sum = checker[8]-checker[9];
					System.out.println("You miss "+sum+" ')'"); 
				 }
				 if(checker[8]< checker[9])
				 {
					 int sum = checker[8]-checker[9];
						System.out.println("You miss "+sum+" '('"); 
				 }
			 } 
	}
		 else
		 {
			 System.out.println(flag);
		 }

	}
	public static int length() {
		// TODO Auto-generated method stub
		return 0;
	}
}
