package office;


class Parent4 {
    int compute(int x) {
        return x * 2;
    }
}
class Child4 extends Parent4 {
    @Override
    int compute(int x) {
        return x-- > 5 ? ++x : --x;
    }
}
public class que13 {
    public static void main(String[] args) {
        Parent4 obj = new Child4();
        int val = 6;
        try {
            try {
                System.out.println("Result: " + obj.compute(val));
                int res = 10 / (val-- - 6);  // May cause divide by zero
                System.out.println("Res: " + res);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e);
                throw new NullPointerException("Nested boom");
            } finally {
                System.out.println("Inner finally, val = " + val);
            }
        } catch (Exception e) {
            System.out.println("Outer catch: " + e.getClass().getSimpleName());
        }
    }
}
