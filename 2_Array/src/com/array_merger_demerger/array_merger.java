package com.array_merger_demerger;

import java.util.Arrays;

public class array_merger {
  
	public static void main(String ...strings )
	{ int [] a = new int []{1,2,8,9,9};
	  int [] b = new int []{9,6,3,0,8};
	  int [] merge = new int[a.length +b.length];
		
	  for(int i=0; i<a.length;i++)
	  {
		  merge[i]=a[i];
	  }
	  for(int i=0; i<b.length;i++)
	  {
		  merge[a.length +i]=b[i];
	  }
	  System.out.println(Arrays.toString(merge));
	  
	  
	}
}
