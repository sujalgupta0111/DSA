package pattren_pratice;
import java.util.Scanner;
public class problem2_webkul {
  
	
	public static void main(String ...strings )
	{
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = in.nextInt();
		if(n<0 || n%2==0)
		{
			System.out.println("Odd whole number only");
			return;
		}
		int at = n;
		int space =0;
		int col =2*n-2;
		int rows = col;
		
		
		for(int i = 0; i <= rows; i++)//for rows
		{
			
			for(int j = 0; j <= col; j++)
			{
				if((i==0 && j<=n-1) || (i>0 && i%2==0 && j==n-1) ||(i==rows && j>=n  && j<=2*n-2)||(i>=0 && i%2==0 && j==2*n-2))
				{
					System.out.print("*");
				}
				
				else
				{
				System.out.print(" ");
				}
				
			}
			//@
			for(int j = 1; j <=space; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= at; j++)
			{
				System.out.print("@");
			}
			at-=2;
			space++;
			
			System.out.println();
		}
	
        }
     
	}




