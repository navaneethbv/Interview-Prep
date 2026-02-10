package LeetCodePerformancePractice;

/**
 * Implementation of Populate Next Right Pointers algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PopulateNextRightPointers {
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class TreeLinkNode {
		int val;
		TreeLinkNode left;
		TreeLinkNode right,next;
		TreeLinkNode(int x) { val = x; }
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeLinkNode tn=new TreeLinkNode(1);
		tn.left=new TreeLinkNode(2);
		tn.right=new TreeLinkNode(3);
		tn.left.left=new TreeLinkNode(4);
		tn.left.right=new TreeLinkNode(5);
		tn.right.left=new TreeLinkNode(6);
		tn.right.right=new TreeLinkNode(7);
		connect(tn);
	}
	static TreeLinkNode prevVisitedNode=null;
	/**
	 * Performs connect operation.
	 *
	 * @param root the tree node to process
	 */
	public static void connect(TreeLinkNode root) {
		int height=getHeight(root);
		for(int i=0;i<height;i++)
		{
			prevVisitedNode=null;
			levelOrder(root,i);
		}
	}
	/**
	 * Retrieves height from the data structure.
	 *
	 * @param root the tree node to process
	 * @return the computed integer result
	 */
	public static int getHeight(TreeLinkNode root)
	public static int getHeight(TreeLinkNode root)
	{
		return root==null?0:1+Math.max(getHeight(root.left),getHeight(root.right));
	}
	/**
	 * Performs levelOrder operation.
	 *
	 * @param tn the tree node to process
	 * @param level the level parameter
	 */
	public static void levelOrder(TreeLinkNode tn,int level){
		// Check for null/base case
		if(tn==null||level<0)
			return;
		// Check for null/base case
		if(level==0)
		{
			tn.next=prevVisitedNode;
			prevVisitedNode=tn;
			return;
		}
		levelOrder(tn.right,level-1);
		levelOrder(tn.left,level-1);
	}


}
