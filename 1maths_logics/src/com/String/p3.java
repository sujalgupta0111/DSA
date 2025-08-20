package com.String;
import java.util.*;
public class p3 {
	
	
public static String compress(String str)
{ 
	String newstr= new String();
    int count=1;
    
    for(int i= 1; i<=str.length()-1;i++)
    { 
    	if(str.charAt(i-1)==str.charAt(i))
    	{
    		count++;
    	}
    	else 
    	{
    		newstr= newstr+""+str.charAt(i-1)/*+count*/;
    		count = 1;
    	}
    }
newstr = newstr+""+str.charAt(str.length()-1)/*+count*/;
   

 return new String(newstr);
}
	public static void main(String[] args) {

		Scanner ab = new Scanner(System.in);
		String str = ab.next();
		String s =compress( str);
		System.out.println(s);
        }

	}


