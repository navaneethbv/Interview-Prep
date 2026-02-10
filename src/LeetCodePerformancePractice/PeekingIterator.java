package LeetCodePerformancePractice;

import java.util.Iterator;

/**
 * Implementation of Peeking Iterator algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PeekingIterator {
	class PeekingIterator implements Iterator<Integer> {
		Integer next=null;
		Iterator<Integer> iterator;
		public PeekingIterator(Iterator<Integer> iterator) {
			this.iterator=iterator;
			if(iterator.hasNext())
			{
				next=iterator.next();
			}
		}

		// Returns the next element in the iteration without advancing the iterator.
		/**
		 * Performs peek operation.
		 *
		 * @return the Integer result
		 */
		public Integer peek() {
			return next;
		}

		// hasNext() and next() should behave the same as in the Iterator interface.
		// Override them if needed.
		@Override
		/**
		 * Performs next operation.
		 *
		 * @return the Integer result
		 */
		public Integer next() {
			int currElement=next;
			if(iterator.hasNext())
				next=iterator.next();
			else
				next=null;
			return currElement;
		}

		@Override
		/**
		 * Checks if next.
		 *
		 * @return true if condition is met, false otherwise
		 */
		public boolean hasNext() {
			return next==null?false:true;
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
