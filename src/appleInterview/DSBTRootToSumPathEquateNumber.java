package appleInterview;

/**
 * Implementation of DSBT Root To Sum Path Equate Number algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSBTRootToSumPathEquateNumber {
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{
		Node left,right;
		int value;
		public Node(int value){
			this.value=value;
		}
	}
	int path[]=new int[1000];
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Node root=new Node(10);
		root.left=new Node(8);
		root.right=new Node(2);
		root.left.left=new Node(3);
		root.left.right=new Node(5);
		root.right.left=new Node(2);
		System.out.println(findSumPath(root,21));
	}
	/**
	 * Finds sum path in the data structure.
	 *
	 * @param root the tree node to process
	 * @param sum the sum parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean findSumPath(Node root, int sum) {
		// Check for null/base case
		if(root!=null)
		{
			// Check if node is a leaf (no children)
			if(root.left==null && root.right==null)
			{
				return Math.abs(sum-root.value)==0;
			}
			sum=sum-root.value;
			// Recursively process left and right subtrees
			return findSumPath(root.left, sum)||findSumPath(root.right, sum);
		}
		return false;
	}

}

