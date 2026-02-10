package GeeksforGeeksPractice;

/**
 * Implementation of Connect Nodes Same Level algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ConnectNodesSameLevel {
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
		tn.next=null;
		//connect(tn);
		connectRecursive(tn);
		preOrder(tn);
	}
	/**
	 * Performs connectRecursive operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void connectRecursive(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			// Check for null/base case
			if(tn.left!=null)
			{
				tn.left.next=tn.right;
			}
			// Check for null/base case
			if(tn.right!=null)
			{
				tn.right.next=(tn.next!=null)?tn.next.left:null;
			}
			connectRecursive(tn.left);
			connectRecursive(tn.right);
		}
		
	}
	static TreeNode temp;
	/**
	 * Performs preOrder operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void preOrder(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{	
			// Check for null/base case
			if(tn.next==null)
				System.out.println(tn.val+"//null");
			else
				System.out.println(tn.val+"//"+tn.next.val);
			preOrder(tn.left);
			preOrder(tn.right);
		}
	}
	/**
	 * Performs connect operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void connect(TreeNode tn) {
		int height=getHeight(tn);
		for (int i = 0; i <=height; i++) {
			temp=null;
			connectNodes(tn,i);
			System.out.println();
		}
	}
	/**
	 * Performs connectNodes operation.
	 *
	 * @param tn the tree node to process
	 * @param i the i parameter
	 */
	private static void connectNodes(TreeNode tn, int i) {
		// Check for null/base case
		if(tn!=null)
		{
			if(i==1){
				System.out.print(tn.val+"/");
				// Check for null/base case
				if(temp!=null)
					tn.next=temp;
				else{
					tn.next=null;
				}
				temp=tn;
			}
			connectNodes(tn.right,i-1);
			connectNodes(tn.left,i-1);
		}
	}
	/**
	 * Retrieves height from the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int getHeight(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{
			// Recursively process left and right subtrees
			return 1+Math.max(getHeight(tn.left), getHeight(tn.right));
		}
		return 0;
	}
	
}
