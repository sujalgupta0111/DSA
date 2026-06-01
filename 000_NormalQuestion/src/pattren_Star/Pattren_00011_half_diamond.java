package pattren_Star;
public class Pattren_00011_half_diamond {

	public static void main(String[] args) {
		
		int a=9,b=1;
		
		for(int c=1; c<=a;c++)
		{
			for(int d=1; d<=b;d++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(c<=a/2)
	         b++;
			else
			b--;	
		}
		
		
		

	}
}
