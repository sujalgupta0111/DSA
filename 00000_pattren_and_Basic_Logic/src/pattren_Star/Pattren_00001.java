package pattren_Star;

import java.util.Scanner;

public class Pattren_00001 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the number-->");
		int a= input.nextInt();
		for (int b =1;b<=a;b++)
		{
			System.out.println(" * ");//colummn print
			System.out.print(" * ");//row print
		}
	}

}
