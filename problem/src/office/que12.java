package office;



class Base {
    static {
        System.out.println("Base static");
    }
    int getValue() {
        return 5;
    }
}

class Child3 extends Base {
    static {
        System.out.println("Child static");
    }

    @Override
    int getValue() {
        int x = 3, y = 2;
        if (x-- > ++y) {
			throw new RuntimeException("RTE..");
		}
        return x + y++;
    }
}

public class que12 {
    public static void main(String[] args) {
        Base obj = new Child3();
        try {
            System.out.println("Val: " + obj.getValue());
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        } finally {
            System.out.println("Done");
        }
    }
}