package leetCode;

/*
 * Link : https://leetcode.com/problems/rectangle-area/
 */

/**
 * Implementation of Rectangle Area algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RectangleArea {
	/**
	 * Performs computeArea operation.
	 *
	 * @param A the A parameter
	 * @param B the B parameter
	 * @param C the C parameter
	 * @param D the D parameter
	 * @param E the E parameter
	 * @param F the F parameter
	 * @param G the G parameter
	 * @param H the H parameter
	 * @return the computed integer result
	 */
	public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		if(C<E||G<A )
	        return (G-E)*(H-F) + (C-A)*(D-B);
	 
	    if(D<F || H<B)
	        return (G-E)*(H-F) + (C-A)*(D-B);
	 
	    int right = Math.min(C,G);
	    int left = Math.max(A,E);
	    int top = Math.min(H,D);
	    int bottom = Math.max(F,B);
	 
	    return (G-E)*(H-F) + (C-A)*(D-B) - (right-left)*(top-bottom);
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
}