package problem;

import java.util.*;

public class xyz {

	public static boolean prime(int a) {
		if (a == 0)
			return false;
		for (int i = 2; i < a / 2; i++) {
			if (a % i == 0)
				return false;
		}
		return true;
}

	public static void main(String... strings) {

		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		
		for(int i =0;i<=b;i++)
		{
			if(prime(i))
			{
				System.out.println(i);
			}
				
		}

	}
}
