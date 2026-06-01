package pattren_Star;
public class Pattren_00019_diamond_spaces_mid {

	public static void main(String [] sujal)
	{
		int row=9,space=1,star=5;
		 for(int d =1;d<=row;d++)
			{
			 for(int e=1; e<=star;e++)
			  {
				 System.out.print("*");
			  }
			 for(int e=1; e<=space;e++)
			  {
				 System.out.print(" ");
			  }
			 for(int e=1; e<=star;e++)
			  {
				 System.out.print("*");
			  }
			 System.out.println();
			 
			 if(d<=row/2)
			 {   space+=2;
				 star--; }
			 else 
			 {   space-=2;
				 star++; }
			}
	}

}
