package yelpInterview;

/**
 * Implementation of BST Count BST Sub Trees algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BSTCountBSTSubTrees{
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{
		int value;
		Node left,right;
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
		Node n=insert(null,10);
		insert(n,5);
		insert(n,50);
		insert(n,1);
		insert(n,40);
		insert(n,100);
		inOrderTraversal(n);
		System.out.println();
		System.out.println(findSubTreeCount(n,5,45));
		System.out.println(findSubTreeCount(n,1,45));
	}







	/**
	 * Finds sub tree count in the data structure.
	 *
	 * @param n the size or count parameter
	 * @param i the i parameter
	 * @param j the j parameter
	 * @return the computed integer result
	 */
	private static int findSubTreeCount(Node n, int i, int j) {
		// Check for null/base case
		if(n!=null)
		{
			// Recursively process left and right subtrees
			return findSubTreeCountUtil(n, i, j);
		}
		return 0;
	}







	/**
	 * Finds sub tree count util in the data structure.
	 *
	 * @param n the size or count parameter
	 * @param min the min parameter
	 * @param max the max parameter
	 * @return the computed integer result
	 */
	private static int findSubTreeCountUtil(Node n, int min, int max) {
		// Check for null/base case
		if(n!=null)
		{
			int value=getNodes(n,min,max)==getSize(n)?1:0;
			// Recursively process left and right subtrees
			return value+findSubTreeCountUtil(n.left,min,max)+findSubTreeCountUtil(n.right, min, max);

		}
		return 0;
	}

	/**
	 * Retrieves size from the data structure.
	 *
	 * @param n the size or count parameter
	 * @return the computed integer result
	 */
	private static int getSize(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			// Recursively process left and right subtrees
			return 1+getSize(n.left)+getSize(n.right);
		}
		return 0;
	}


	/**
	 * Retrieves nodes from the data structure.
	 *
	 * @param n the size or count parameter
	 * @param min the min parameter
	 * @param max the max parameter
	 * @return the computed integer result
	 */
	private static int getNodes(Node n, int min, int max) {
		// Check for null/base case
		if(n!=null)
		{
			if(n.value>=min && n.value<=max)
			{
				// Recursively process left and right subtrees
				return 1+getNodes(n.left, min, max)+getNodes(n.right, min, max);
			}
			else if(n.value>max)
				// Recursively process left and right subtrees
				return getNodes(n.left, min, max);
			else
				// Recursively process left and right subtrees
				return getNodes(n.right, min, max);
		}
		return 0;
	}







	/**
	 * Performs inOrderTraversal operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void inOrderTraversal(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			inOrderTraversal(n.left);
			System.out.print(n.value+" ");
			inOrderTraversal(n.right);
		}
	}

	/**
	 * Performs insert operation.
	 *
	 * @param n the size or count parameter
	 * @param value the value value
	 * @return the Node result
	 */
	private static Node insert(Node n, int value) {
		// Check for null/base case
		if(n==null)
			return new Node(value);
		if(n.value>value)
		{//move left
			n.left=insert(n.left,value);
		}
		else{//move right
			n.right=insert(n.right,value);			
		}
		return n;
	}

}