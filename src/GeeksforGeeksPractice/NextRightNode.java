package GeeksforGeeksPractice;

/*
 * Link : http://www.geeksforgeeks.org/find-next-right-node-of-a-given-key/
 */
/**
 * Implementation of Next Right Node algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class NextRightNode {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn=new TreeNode(10);
		tn.left=new TreeNode(2);
		tn.right=new TreeNode(6);
		tn.left.left=new TreeNode(8);
		tn.left.right=new TreeNode(4);
		tn.right.right=new TreeNode(5);
		System.out.println(findNextRightNode(tn,2));
		System.out.println(findNextRightNode(tn,4));
		System.out.println(findNextRightNode(tn,10));
		System.out.println(findNextRightNode(tn,6));
		System.out.println(findNextRightNode(tn,5));
	}


	static boolean flag;
	static Integer nextNode=null;
	static TreeNode temp=null;
	/**
	 * Finds next right node in the data structure.
	 *
	 * @param tn the tree node to process
	 * @param i the i parameter
	 * @return the Integer result
	 */
	private static Integer findNextRightNode(TreeNode tn,int i) {
		int height=getHeight(tn);
		flag=false;
		nextNode=null;
		// Inner loop to check combinations
		for (int j = 0; j <=height; j++) {
			temp=null;
			getNode(tn,i,j);
			if(flag)
				break;
		}
		return nextNode;
	}


	/**
	 * Retrieves node from the data structure.
	 *
	 * @param tn the tree node to process
	 * @param value the value value
	 * @param level the level parameter
	 */
	private static void getNode(TreeNode tn, int value, int level) {
		// Check for null/base case
		if(tn!=null)
		{
			if(level==1)
			{
				
				// Check for null/base case
				if(temp!=null && tn.value==value)
				{
					nextNode=temp.value;
					flag=true;
				}
				// Check for null/base case
				else if(temp==null && tn.value==value){
					nextNode=null;
					flag=true;
				}
				else
				{
					temp=tn;
				}
			}
			getNode(tn.right, value, level-1);
			getNode(tn.left, value, level-1);
		}
	}



	/**
	 * Retrieves height from the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int getHeight(TreeNode tn) {
		// Recursively process left and right subtrees
		return tn!=null?1+Math.max(getHeight(tn.left), getHeight(tn.right)):0;
	}



	/**
	 * Inner class representing a node in the data structure.
	 */
	static class TreeNode{
		TreeNode left,right;
		int value;
		public TreeNode(int value) {
			this.value=value;
		}		
	}


}
