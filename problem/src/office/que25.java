package office;

public class que25 {
	public static void main(String[] args) {
		String[] arr = { "Hi", null, "Bye" };
		

		for (int i = 0; i < arr.length; i++) {
			try {
				if (arr[i] == "Hi" && arr[i + 1].length() == 2) {
					System.out.println("Match at " + i);
				}

				if (arr[i].equals("Bye")) {
					System.out.println("Found Bye");
					break;
				}
			} catch (NullPointerException e) {
				System.out.println("Null at " + i);
				continue;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Out of bounds at " + i);
				break;
			} finally {
				System.out.println("Finally at " + i);
			}
		}

		System.out.println("End");
	}
}
