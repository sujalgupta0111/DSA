package office;


public class que16 {
	public static void main(String[] args){
		System.out.print("Check if equal :");
		System.out.println(Float.NaN == Float.NaN);

		System.out.print("Check if unequal: ");
		System.out.println(Float.NaN != Float.NaN);

		System.out.print("Check if equal: ");
		System.out.println(Double.NaN == Double.NaN);

		System.out.print("Check if unequal: ");
		System.out.println(Double.NaN != Double.NaN);

		double t = 0 % 0.0;
		System.out.println(t);
		System.out.println((2.1%0) == t);
		System.out.println(t == t);
	}
}
