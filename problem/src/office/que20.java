package office;


public class que20 {
	public static void main(String[] args) {
        System.out.println(blt());
    }

    static String blt() {
        String result = "A";
        try {
            result += "B";
            int s=3/0;
            return result;
        }
        catch (Exception e) {
        	 throw new RuntimeException("Oops");
        }
        finally {
           return result += "C";
           

        }
    }
}
