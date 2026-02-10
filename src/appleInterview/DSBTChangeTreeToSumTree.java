package appleInterview;

/**
 * Implementation of DSBT Change Tree To Sum Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSBTChangeTreeToSumTree {
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
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Node n=new Node(50);
		n.left=new Node(7);
		n.right=new Node(2);
		n.left.left=new Node(3);
		n.left.right=new Node(5);
		n.right.left=new Node(1);
		n.right.right=new Node(30);
		preOrder(n);System.out.println();
		convertTree(n);
		preOrder(n);
	}
	/**
	 * Performs convertTree operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void convertTree(Node tn) {
		// Check for null/base case
		if(tn!=null)
		{	
			// Check if node is a leaf (no children)
			if(tn.left==null && tn.right==null)
				return;
			convertTree(tn.left);
			convertTree(tn.right);
			int leftVal=0,rightVal=0;
			// Check for null/base case
			if(tn.left!=null)leftVal=tn.left.value;
			if(tn.right!=null)rightVal=tn.right.value;
			int diff=-tn.value+(leftVal+rightVal);
			if(diff>0){
				tn.value=tn.value+diff;
			}
			if(diff<0)
			{
				increment(tn,-diff);
			}
		}
	}
	/**
	 * Performs increment operation.
	 *
	 * @param tn the tree node to process
	 * @param i the i parameter
	 */
	private static void increment(Node tn, int i) {
		// Check for null/base case
		if(tn.left!=null)
		{
			tn.left.value+=i;
			increment(tn.left,i);  
		}
		// Check for null/base case
		else if (tn.right!=null) 
		{
			tn.right.value+=i;
			increment(tn.right,i);  
		}

	}
	/**
	 * Performs preOrder operation.
	 *
	 * @param n the size or count parameter
	 */
	private static void preOrder(Node n) {
		// Check for null/base case
		if(n!=null)
		{
			preOrder(n.left);
			System.out.print(n.value+"/");
			preOrder(n.right);
		}
	}
}

