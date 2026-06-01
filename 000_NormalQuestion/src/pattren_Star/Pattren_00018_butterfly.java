package pattren_Star;
public class Pattren_00018_butterfly {

	static public void main(String ... Sujal)
	{
		int row=9,star=1,space=7;
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
				 if(e!=(row/2)+1)
				 System.out.print("*");
			  }
			 System.out.println();
			 
			 if(d<=row/2)
			 {   star++;
				 space-=2; }
			 else 
			 {   star--;
				 space+=2; }
			}
	}

}
