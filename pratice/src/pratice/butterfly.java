package pratice;

public class butterfly {

	public static void main(String ... sujal)
	{
	
		int star=1;
		int space =8;
		int row =9;
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
			
		
			if(i<row/2)
			{ space-=2;
			star++;}else {space+=2;
			star--;}
		
			}
		}
	
}
