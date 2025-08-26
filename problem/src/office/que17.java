package office;


class Mystery {
    String test() {
        try {
            throw new IllegalStateException("From try");
        } catch (NullPointerException e) {
            System.out.println("Catch: " + e.getMessage());
            throw new UnsupportedOperationException("From catch");
        } finally {
            System.out.println("In finally");
            throw new NullPointerException("From finally");
        }
    }
}

public class que17 {
    public static void main(String[] args) {
        Mystery m = new Mystery();
        try {
            m.test();
        } catch (Exception e) {
            System.out.println("Main caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}

