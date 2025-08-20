package pratice;

public class pattrenDiamond2 {

	public static void main(String ... sujal)
	{
	
		int star=1;
		int space =10;
		int row =6;//(space+2)/2
		for(int i=0; i<row;i++)
		{
			for(int j=0; j<star;j++)
			{
				System.out.print("*");
			}
			for(int j=0; j<space;j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		
				star++;
				space-=2;
		
			}
		}
	
}
