package ctci;

/* 
 * Implementation of CTCI 
 * Link:http://geeksquiz.com/binary-heap/
 */
/**
 * Implementation of Heap algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Heap{
	//use arrays to implement this
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

	/**
	 * Inner class Heap for supporting operations.
	 */
	static class Heap{
		int capacity,noOfElements=0;
		int heapArray[];
		public Heap(int capacity) {
			this.capacity=capacity;
			heapArray=new int[capacity];
		}
		/**
		 * Performs insert operation.
		 *
		 * @param value the value value
		 */
		public void insert(int value){

		}

		/**
		 * Performs extractMax operation.
		 *
		 * @return the computed integer result
		 */
		public int extractMax(){
			return 0;
		}
		/**
		 * Performs delete operation.
		 *
		 * @return the computed integer result
		 */
		public int delete(){
			return 0;
		}
			

	}
}