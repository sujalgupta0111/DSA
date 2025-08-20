package Array;

import java.util.Arrays;

public class Arrays1 {

	public static void  main(String ...strings )
	{
		int [] arr = {9,8,7,5,72,3};//intialization 1		
		int arr1[] = {};//initialization 2
		int arr2[];
		
		//arr2= {};//not allowed
		//arr2 = new int[] {};allowed
		arr2=new int [2];//allowed
		System.out.println();
		System.out.println();

		System.out.println(arr);// as array is obect this print objects reference location
		System.out.println(Arrays.toString(arr));//this print volues of
	}

}
