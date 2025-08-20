package pratice;

public class pattrenDiamond {

	public static void main(String ... sujal)
	{
	
		int star=1;
		int space =4;
		int row =9;
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
			
			if(i<row/2) {
				star++;
				space--;
			}
			else {
				star--;
				space++;
			}
		}
	}
}
