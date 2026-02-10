package careerCup;

/*
 * Link: http://www.careercup.com/question?id=296113
 * Find the next in order node of given node in binary tree. Write the program of same. pointer to parent node is given.
 * http://www.geeksforgeeks.org/inorder-successor-in-binary-search-tree/
 */
/**
 * Implementation of Google Career Cup Problem6113 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GoogleCareerCupProblem6113 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

		TreeNode tn=new TreeNode(20);
		tn.left=new TreeNode(8);
		tn.right=new TreeNode(22);
		tn.left.left=new TreeNode(4);
		tn.left.right=new TreeNode(12);
		tn.left.right.left=new TreeNode(10);
		tn.left.right.right=new TreeNode(14);
		inOrder(tn);
		System.out.println();
		System.out.println(findInOrderSuccessor(tn.left));
		System.out.println(findInOrderSuccessor(tn.left.right.left));
		System.out.println(findInOrderSuccessor(tn.left.right.right));
	}


	/**
	 * Finds in order successor in the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the TreeNode result
	 */
	private static TreeNode findInOrderSuccessor(TreeNode tn) {


		// Check for null/base case
		if(tn.right!=null)
		{
			while(tn.left!=null)
			{
				tn=tn.left;
			}
			return tn;
		}
		TreeNode tempNode=tn.parent;

		while(tempNode.parent!=null && tempNode.parent.right==tempNode)
		{
			tempNode=tempNode.parent;
		}
		// Check for null/base case
		if(tempNode!=null)
			if(tempNode.parent.left==tempNode && tempNode.parent.right!=tempNode)
				return tempNode.parent;

		return null;
	}


	/**
	 * Performs inOrder operation.
	 *
	 * @param tn the tree node to process
	 */
	private static void inOrder(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{	
			inOrder(tn.left);
			System.out.print(tn.val+"/");
			inOrder(tn.right);
		}

	}


	/**
	 * Inner class representing a node in the data structure.
	 */
	static class TreeNode{
		TreeNode left,right,parent;
		int val;
		public TreeNode(int val) {
			this.val=val;
		}
	}

}
