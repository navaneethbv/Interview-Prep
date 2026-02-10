package yelpInterview;

/**
 * Implementation of Count Occurences LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CountOccurencesLL {
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{
		int value;
		Node next;
		public Node(int value) {
			this.value=value;
		}
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		Node n=new Node(1);
		n.next=new Node(2);
		n.next.next=new Node(1);
		n.next.next.next=new Node(4);
		n.next.next.next.next=new Node(1);
		n.next.next.next.next.next=new Node(6);
		System.out.println(countOccurences(n,1));
		System.out.println(countOccurencesRecursive(n,1));
	}

	/**
	 * Counts the number of occurences recursive.
	 *
	 * @param n the size or count parameter
	 * @param value the value value
	 * @return the computed integer result
	 */
	private static int countOccurencesRecursive(Node n, int value) {
		// Check for null/base case
		if(n==null)
			return 0;
		if(n.value==value)
			return 1+countOccurences(n.next, value);
		else
			return countOccurences(n.next, value);
	}

	/**
	 * Counts the number of occurences.
	 *
	 * @param n the size or count parameter
	 * @param value the value value
	 * @return the computed integer result
	 */
	private static int countOccurences(Node n,int value) {
		int count=0;
		while(n!=null){
			if(n.value==value)
				count++;
			n=n.next;
		}
		return count;
	}



}






