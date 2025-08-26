package office;


public class que22 {
	  public static void main(String[] args) {
	        StringBuilder sb = new StringBuilder("S");
	        for (int i = 0; i < 2; i++) {
	            try {
	            	System.out.println("inside try");
	                if (i == 0 || i--> 0) { //Infinite condition
	                	System.out.println("");
						throw new IllegalArgumentException();
					}
	                sb.append("X");
	            } catch (Exception e) {
	            	System.out.println("catch");
	                sb.append("Y");
	                continue;
	            } finally {
	            	System.out.println("finally");
	                sb.append("Z");
	                if (i == 1) {
						throw new RuntimeException("F");
					}
	            }
	        }
	        sb.append("E");
	        System.out.println(sb);

	}
}
