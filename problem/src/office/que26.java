package office;

public class que26 {
	public static void main(String[] args) {
		String[] arr = { "One", null, "Three" };
		for (String element : arr) {
			try {
				System.out.println("Result: " + tMethod(element));
			} catch (Exception e) {
				System.out.println("Caught in main: " + e);
			}
		}
	}

	static String tMethod(String input) {
		try {
			if (input == null) {
				throw new IllegalArgumentException("Input is null");
			}

			if (input.length() == 3) {
				return "Three-letter word";
			} else if (input.startsWith("T")) {
				return "Starts with T";
			}
		} catch (IllegalArgumentException e) {
			return "Handled null";
		} finally {
			System.out.println("Finally for input: " + input);
			if ("One".equals(input)) {
				return "Forced override from finally";
			}
		}
		return "Processed: " + input;
	}
}
