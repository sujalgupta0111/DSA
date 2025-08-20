package w;

public class Interview_Question {

	public static void main(String[] args) {
		Integer a = 127;
		Integer b = 127;
		System.out.println(a == b); // true, because both reference the same cached object

		Integer c = 128;
		Integer d = 128;
		System.out.println(c == d); // false, because 128 is outside the cached range

	}

}
