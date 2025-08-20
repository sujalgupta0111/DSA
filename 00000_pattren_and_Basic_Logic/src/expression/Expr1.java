package expression;

public class Expr1 {
	public static void main(String... strings) {

		int a = 7;
		int x = a++ + 18 / 3 + 3 + 36 / 9 + 3 + ++a;
		System.out.println(x);

	}
}
