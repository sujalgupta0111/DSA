package pattren_Star;
public class Pattren_00014_slide_right {

	public static void main(String ... suajl )
	{
	    int a=5,b=1;
		for(int c=1;c<=a;c++)
		{
			for(int d=2;d<=b;d++)
			{
			  System.out.print(" ");
			}
			for(int d=1;d<=a;d++)
			{
			  System.out.print("*");
			}
			System.out.println();
			b++;
		}
	}

}
