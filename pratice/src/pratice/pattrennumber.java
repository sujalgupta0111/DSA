package pratice;

public class pattrennumber {

	public static void main(String ... sujal)
	{
		int row =6;
		int a =0;
		for(int i=0; i<row;i++)
		{
			for(int j=0; j<i;j++)
			{
				System.out.print(""+(++a)+" ");
			}
			System.out.println();
		}
	}
}
