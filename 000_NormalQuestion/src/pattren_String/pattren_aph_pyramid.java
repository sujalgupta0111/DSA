package pattren_String;

public class pattren_aph_pyramid {

	public static void main(String[] args) {
		int A = 65;
		int out = 8;
		int in = 8;
		int b = 0;

		for (int rows = 0; rows <= out; rows++) {
			for (int space = 1; space <= b; space++) {
				System.out.print(" ");
			}
			for (int alpha = 0; alpha <= in; alpha++) {

				System.out.printf("%c", A + alpha);
			}

			if (rows < out / 2) {
				b++;
				A++;
				in = in - 2;
			}

			// if(rows>=out/2)
			else {
				b--;
				A--;
				in = in + 2;
			}
			System.out.println();

		}

	}

}
