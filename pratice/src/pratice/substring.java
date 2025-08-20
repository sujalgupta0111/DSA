package pratice;

public class substring {
	
	public static void main(String ...strins)
	{
	  String a ="abbczzzceeef";
	  int count =0;
	  int f=0;
	  int slow=0;
	  String ans ="";
	  for( f =0; f<a.length();f++)
	  {
		  if(a.charAt(slow)!=a.charAt(f))
		  {
			  
			  
			  ans+=a.charAt(slow)+""+count;
			
			  slow=f;
			  count=1;
		  }else
		  {
			  count++;
		  }
	  }
	  if(count !=0)
	  {
		  ans+=a.charAt(slow)+""+count;
		  
	  }
	  System.out.println(ans);

		
	}

}
