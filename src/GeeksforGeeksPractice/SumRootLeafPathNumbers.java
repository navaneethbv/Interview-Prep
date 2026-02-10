package GeeksforGeeksPractice;

/*
 * Link : http://www.geeksforgeeks.org/sum-numbers-formed-root-leaf-paths/
 */
/**
 * Implementation of Sum Root Leaf Path Numbers algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SumRootLeafPathNumbers {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn=new TreeNode(6);
		tn.left=new TreeNode(3);
		tn.right=new TreeNode(5);
		tn.left.left=new TreeNode(2);
		tn.left.right=new TreeNode(5);
		tn.right.right=new TreeNode(4);
		tn.left.right.left=new TreeNode(7);
		tn.left.right.right=new TreeNode(4);
		System.out.println(findSum(tn));
	}
	
	static int[] path;
	static int sum;
	/**
	 * Finds sum in the data structure.
	 *
	 * @param tn the tree node to process
	 * @return the computed integer result
	 */
	private static int findSum(TreeNode tn) {
		path=new int[10];
		getPaths(tn,path,0);
		return sum;
	}

	/**
	 * Retrieves paths from the data structure.
	 *
	 * @param tn the tree node to process
	 * @param path the array to process
	 * @param pathLen the pathLen parameter
	 */
	private static void getPaths(TreeNode tn, int[] path, int pathLen) {
		// Check for null/base case
		if(tn!=null)
		{
			path[pathLen]=tn.value;
			pathLen++;
			// Check if node is a leaf (no children)
			if(tn.left==null && tn.right==null){
				sum+=getSum(path,pathLen);
			}
			getPaths(tn.left, path, pathLen);
			getPaths(tn.right, path, pathLen);
		}		
	}
	
	/**
	 * Retrieves sum from the data structure.
	 *
	 * @param path2 the array to process
	 * @param pathLen the pathLen parameter
	 * @return the computed integer result
	 */
	private static int getSum(int[] path2, int pathLen) {
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < pathLen; i++) {
			sb.append(path2[i]);
		}
		return Integer.parseInt(sb.toString());
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
