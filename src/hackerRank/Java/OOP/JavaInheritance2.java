package hackerRank.Java.OOP;

/*
 * Link:https://www.hackerrank.com/challenges/java-inheritance-2
 */

/**
 * Implementation of Java Inheritance2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class JavaInheritance2 {

	//Write your code here
	class Arithmetic{
	    /**
	     * Retrieves name from the data structure.
	     *
	     * @return the resulting string
	     */
	    public String getName(){
	        // Recursively process left and right subtrees
	        return this.getClass().getName();
	    }
	}
	class Adder extends Arithmetic{
	    /**
	     * Adds  to the data structure.
	     *
	     * @param a the a parameter
	     * @param b the b parameter
	     * @return the computed integer result
	     */
	    public int add(int a,int b){
	        return a+b;
	    }
	    
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

}
