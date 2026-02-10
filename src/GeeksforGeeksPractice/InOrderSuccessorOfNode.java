package GeeksforGeeksPractice;

/**
 * Implementation of In Order Successor Of Node algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class InOrderSuccessorOfNode {
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode next;
		TreeNode(int x) { val = x; }
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args[] the args[] parameter
	 */
	public static void main(String args[]){
		TreeNode tn=new TreeNode(10);
		tn.left=new TreeNode(8);
		tn.right=new TreeNode(2);
		tn.left.left=new TreeNode(3);
		tn.left.right=new TreeNode(5);
		tn.right.left=new TreeNode(1);
		tn.right.right=new TreeNode(30);
		inOrder(tn);
		System.out.println("*****************");
		populateInorderSuccessor(tn);
		inOrder(tn);
	}
	static TreeNode temp;
	/**
	 * Performs populateInorderSuccessor operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void populateInorderSuccessor(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			populateInorderSuccessor(tn.right);
			// Check for null/base case
			if(temp==null)
			{
				temp=tn;
			}
			else{
				tn.next=temp;
				temp=tn;
			}
			populateInorderSuccessor(tn.left);
		}

	}
	/**
	 * Performs inOrder operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void inOrder(TreeNode tn) {
		// Check for null/base case
		if(tn!=null){
			inOrder(tn.left);
			// Check for null/base case
			if(tn.next==null)
				System.out.println(tn.val+"//null");
			else
				System.out.println(tn.val+"//"+tn.next.val);
			inOrder(tn.right);
		}
	}
}
