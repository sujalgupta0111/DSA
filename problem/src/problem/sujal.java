package problem;

public class sujal {

	public static boolean pal(String s) {
		if (s.length() == 1)
			return false;
		if (s.length() == 0)
			return false;
		int f = 0;
		int l = s.length() - 1;

		while (f < l) {
			if (s.charAt(f) != s.charAt(l))
				return false;
			f++;
			l--;
		}

		return true;
	}

	public static void main(String[] args) {
		String S = "TMAM";
		int count = 0;

		for (int i = 0; i < S.length() + 1; i++) {
			for (int j = i; j < S.length() + 1; j++) {
				if (pal(S.substring(i, j))) {
					count++;

				}
			}
		}
		System.out.println(count);

	}

}
