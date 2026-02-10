package yelpInterview;

/**
 * Implementation of Flatten ALL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class FlattenALL {
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{
		int value;
		Node right;
		Node down;
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
		Node n=new Node(5);
		n.right=new Node(10);
		n.down=new Node(7);
		n.down.down=new Node(8);
		n.down.down.down=new Node(30);
		n.right.down=new Node(20);
		n.right.right=new Node(19);
		n.right.right.down=new Node(22);
		n.right.right.down.down=new Node(50);
		n.right.right.right=new Node(28);
		n.right.right.right.down=new Node(35);
		n.right.right.right.down.down=new Node(40);
		n.right.right.right.down.down.down=new Node(45);
		n=flatten(n);
		print(n);
	}

	/**
	 * Performs flatten operation.
	 *
	 * @param n the size or count parameter
	 * @return the Node result
	 */
	private static Node flatten(Node n) {
		// Check for null/base case
		if(n==null||n.right==null)
			return n;
		// Recursively process left and right subtrees
		return merge(n,flatten(n.right));
	}

	/**
	 * Performs merge operation.
	 *
	 * @param a the a parameter
	 * @param b the b parameter
	 * @return the Node result
	 */
	private static Node merge(Node a, Node b) {
		// Check for null/base case
		if(a==null)
			return b;
		// Check for null/base case
		if(b==null)
			return a;
		Node result;
		if(a.value<b.value)
		{
			result=a;
			result.down=merge(a.down,b);
		}
		else{
			result=b;
			result.down=merge(a,b.down);
		}
		return result;
	}

	/**
	 * Performs print operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void print(Node n) {
		while(n!=null)
		{
			System.out.println(n.value);
			n=n.down;
		}
	}

}

