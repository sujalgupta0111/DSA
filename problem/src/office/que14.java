package office;


public class que14 {
	  public static void main(String[] args) {
	        try {
	            try {
	                int a = 3;
	                if (a++ > 2) {
						throw new RuntimeException("R1");
					}
	            } catch (RuntimeException e) {
	                System.out.println("Inner: " + e.getMessage());
	                throw new IllegalArgumentException("R2");
	            } finally {
	                System.out.println("Inner finally");
	                throw new NullPointerException("R3");
	            }
	        } catch (Exception e) {
	            System.out.println("Outer: " + e.getClass().getSimpleName());
	            throw new Error("R4");
	        } finally {
	            System.out.println("Main finally");
	        }
	    }
}
