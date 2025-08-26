package office;


public class que19 {
	 public static void main(String[] args) {
	        StringBuilder sb = new StringBuilder("A");

	        for (int i = 0; i < 2; i++) {
	            try {
	                sb.append(i);
	                if (i++ == 0) {
						throw new RuntimeException("X");
					}
	            } finally {
	                sb.append("F");
	                if (i == 1) {
						throw new RuntimeException("Y");
					}
	            }
	        }

	        sb.append("Z");
	        System.out.println(sb);
	    }
}
