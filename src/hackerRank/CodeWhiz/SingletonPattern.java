package hackerRank.CodeWhiz;

class Singleton{
	public static Singleton inst ;
	public String str;
	private Singleton() {

	}
	/**
	 * Retrieves single instance from the data structure.
	 *
	 * @return the Singleton result
	 */
	public static Singleton getSingleInstance () {
		// Check for null/base case
		if(inst == null) {
			inst = new Singleton();
		}
		return inst;
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
