package office;


public class que23 {
    static StringBuilder log = new StringBuilder("Start");

    static String test(int x) {
        try {
            if (x++ == 1) {
				throw new IllegalArgumentException("A");
			}
            log.append("-T" + x);
            return "T";
        } catch (Exception e) {
            log.append("-C" + x);
            throw new RuntimeException("B");
        } finally {
            log.append("-F" + x);
            if (--x > 1) {
				return "F";
			}
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Returned: " + test(1));
        } catch (Exception e) {
            log.append("-E");
        } finally {
            log.append("-X");
        }
        System.out.println(log);
    }
}
