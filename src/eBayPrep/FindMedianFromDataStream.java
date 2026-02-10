package eBayPrep;

/**
 * Implementation of Find Median From Data Stream algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FindMedianFromDataStream{
	/**
	 * Inner class MedianFinder for supporting operations.
	 */
	public static class MedianFinder {

		// Adds a number into the data structure.
		int count=-1;
		double currMedian=-1;
		/**
		 * Adds num to the data structure.
		 *
		 * @param num the num parameter
		 */
		public void addNum(int num) {
			if(count==-1){
				count=1;
				currMedian=num;
			}
			else{
				currMedian=(double)((currMedian*count)+num)/(double)(count+1);
				count++;
			}
		}

		// Returns the median of current data stream
		/**
		 * Finds median in the data structure.
		 *
		 * @return the double result
		 */
		public double findMedian() {
			return currMedian;
		}
	};


	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		MedianFinder m=new MedianFinder();
		m.addNum(2);
		System.out.println(m.findMedian());
		m.addNum(3);
		System.out.println(m.findMedian());


	}
}

