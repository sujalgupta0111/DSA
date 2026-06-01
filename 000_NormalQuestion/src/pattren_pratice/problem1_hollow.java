package pattren_pratice;
import java.util.Scanner;
public class problem1_hollow {
  
	public static void main(String ...strings )
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the rows :-");
		int n = in.nextInt();
		System.out.println("Enter the column :-");
		int m = in.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= m; j++)
            {
                if (i == 1 || i == n ||  j == 1 || j == m)            
                    System.out.print("*");            
                else
                    System.out.print(" ");            
            }
            System.out.println();
        }
     
	}
}
