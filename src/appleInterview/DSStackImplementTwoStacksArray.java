package appleInterview;

/**
 * Implementation of DS Stack Implement Two Stacks Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSStackImplementTwoStacksArray {
	static int[] arr=new int[10];
	static int stackPointer1=-1;
	static int stackPointer2=arr.length;

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		push1(20);
		push1(21);
		push1(22);
		push1(23);
		push1(24);
		push1(25);
		push2(10);
		push2(11);
		push2(12);
		push2(13);
		System.out.println(pop2());
		push1(40);
		System.out.println(pop1());
	}
	/**
	 * Performs pop1 operation.
	 *
	 * @return the computed integer result
	 */
	private static int pop1() {
		if(stackPointer1>=0)
		{
			stackPointer1--;
		}
		return arr[stackPointer1+1];
	}
	/**
	 * Performs pop2 operation.
	 *
	 * @return the computed integer result
	 */
	private static int pop2() {
		if(stackPointer2<arr.length)
		{
			stackPointer2++;
		}
		return arr[stackPointer2-1];
	}
	/**
	 * Performs push2 operation.
	 *
	 * @param i the i parameter
	 */
	private static void push2(int i) {
		if(stackPointer2-1>stackPointer1)
		{
			arr[stackPointer2-1]=i;
			stackPointer2--;
		}
	}
	/**
	 * Performs push1 operation.
	 *
	 * @param i the i parameter
	 */
	private static void push1(int i) {
		if(stackPointer1+1<stackPointer2)
		{
			arr[stackPointer1+1]=i;
			stackPointer1++;
		}
	}

}
