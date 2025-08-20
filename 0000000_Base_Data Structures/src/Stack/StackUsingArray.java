package Stack;

// Stack using array
class Stack {

	int sos; // size of stack
	int top;
	int Stack[]; // Issue: 'Stack' is the class name, renaming the array to avoid confusion

	// Stack defined
	/*********************************************************/
	Stack(int sos) { // constructor to define the size of the array
		this.sos = sos;
		Stack = new int[sos];
		top = -1;
	}

	/*********************************************************/
	public boolean dalo(int ntais) { // number that added in stack
		if (top >= sos - 1) { 
								// overflow
			System.out.println("Stack Over Flow");
			return false;
		}
		top++;
		Stack[top] = ntais;
		System.out.println(ntais + " added to the Stack");
		return true;
	}

	/*********************************************************/
	public boolean nikalo() {

		if (top == -1) {
			System.out.println("There is No element in the stack");
			return false;
		}
		Stack[top] = 0;
		--top;
		System.out.println("Number pop out Success fully");
		return true;
	}

	/*********************************************************/
	public void print() {
		if (top == -1) {
			System.out.println("There is No element in the stack");
			return;
		}

		System.out.println("from the top:");
		for (int i = top; i >= 0; i--) { // Issue: The loop condition should be 'i >= 0' instead of 'i <= 0' for proper
											// iteration
			System.out.println(Stack[i]);
		}
	}

	/*********************************************************/
	public int []stacklo() {
		
		return Stack;
	}

}

public class StackUsingArray {

	public static void main(String... strings) {
		Stack one = new Stack(5);
		one.dalo(1);
		one.dalo(2);
		one.dalo(3);
		one.dalo(4);
		one.dalo(5);
		one.nikalo();
		
		

		
	}
}
