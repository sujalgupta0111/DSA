package pattren_Star;
import java.util.*;
public class Pattren_00010_dimond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Only odd number");
			return;
		}
		int Star=1,space=a/2;
		
		for(int c=1;c<=a;c++)
		{
			for(int d=1;d<=space;d++)
			{
			System.out.print(" ");
			}
			for(int d =1;d<=Star;d++)
			{
			System.out.print("*");
			}
			System.out.println();
			if(c<=a/2)
				{
				Star+=2;
				space--;
				
			    }
			else { 
				Star-=2;
				space++;
			}
			
		}
		

	}

}
