package pattren_Star;

import java.util.Scanner;

public class Pattren_00002 {

	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.printf("Enter the number Row->");
			int a= input.nextInt();//row
			System.out.printf("Enter the number Column->");
			int b= input.nextInt();//column
			
			for(int c=1 ;c<=a;c++)
			{//Rows
				for(int d=1 ;d<=b;d++)
				{//Column
					System.out.printf(" * ");
				}
				System.out.println();
			}

		}

	}


