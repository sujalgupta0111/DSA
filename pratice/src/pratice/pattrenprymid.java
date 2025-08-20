package pratice;

public class pattrenprymid {

	public static void main(String ... sujal)
	{
	
		int star=9;
		int space =0;
		int row =star+space;
		for(int i=0; i<row;i++)
		{
			for(int j=0; j<space;j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<star;j++)
			{
				System.out.print("*");
			}
			
			
			
			System.out.println();
			star-=2;
			space++;
		}
	}
}
