package office;


interface MathLogic {
    static double calc(double a, double b) {
    	
        return (a > b) ? (a / b) : (b % a);
    }
}

public class que15 {
    public static void main(String[] args) {
        try {
            double x = MathLogic.calc(0, 5);
            System.out.println(9.0/3);
            boolean result = (x == x / 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e);
        } finally {
            System.out.println("Final Check");
        }
    }
}
