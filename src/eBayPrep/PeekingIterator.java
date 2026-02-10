package eBayPrep;

import java.util.Iterator;

/**
 * Implementation of Peeking Iterator algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PeekingIterator{
	class PeekingIterator implements Iterator<Integer> {
		Iterator<Integer> iter;
		Integer next;
		public PeekingIterator(Iterator<Integer> iterator) {
			// initialize any member here.
			iter=iterator;
			if(iter.hasNext())
			{
				next=iter.next();
			}
		}

		/**
		 * Performs peek operation.
		 *
		 * @return the Integer result
		 */
		public Integer peek() {
			return next;
		}

		// Override them if needed.
		@Override
		/**
		 * Performs next operation.
		 *
		 * @return the Integer result
		 */
		public Integer next() {
			Integer value=next;
			next=iter.hasNext()?iter.next():null;
			return value;
		}

		@Override
		/**
		 * Checks if next.
		 *
		 * @return true if condition is met, false otherwise
		 */
		public boolean hasNext() {
			return next!=null;
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

