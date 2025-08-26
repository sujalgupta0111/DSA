package office;


public class que21 {
	  static String s = "";

	    public static String test() {
	        try {
	            s += "A";
	            int x = 1 / 0;
	            s += "B";
	            return s;
	        } catch (ArithmeticException e) {
	            s += "C";
	            return s += "D";
	        } finally {
	            s += "E";

	            return s += "F";
	        }

	    }

	    public static void main(String[] args) {
	        System.out.println(test());
	    }
}
