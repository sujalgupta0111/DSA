package office;


public class que18 {
    static String data = "A";

    public static String method() {
        try {
            data += "B";
            if (data.length() > 0) {
				throw new RuntimeException("Boom");
			}
            data += "C";
        } catch (Exception e) {
            data += "D";
            throw new IllegalStateException("Fail");
        } finally {
            data += "E";
            throw new NullPointerException("Final blow");
        }
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (Exception e) {
            data += "F";
        } finally {
            data += "G";
        }
        System.out.println(data);
    }
}

