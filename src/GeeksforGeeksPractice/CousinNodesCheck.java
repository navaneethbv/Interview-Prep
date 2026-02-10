package GeeksforGeeksPractice;

import java.util.Arrays;

/*
 * Link : http://www.geeksforgeeks.org/check-two-nodes-cousins-binary-tree/
 */
/**
 * Implementation of Cousin Nodes Check algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CousinNodesCheck {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn=new TreeNode(6);
		tn.left=new TreeNode(3);
		tn.right=new TreeNode(5);
		tn.left.left=new TreeNode(7);
		tn.left.right=new TreeNode(8);
		tn.right.left=new TreeNode(1);
		tn.right.right=new TreeNode(3);
		System.out.println(checkCousins(tn,7,1));
		System.out.println(checkCousins(tn,3,5));
		System.out.println(checkCousins(tn,7,5));
	}
	static int[] path,firstPath,secondPath;
	/**
	 * Performs checkCousins operation.
	 *
	 * @param tn the tree node to process
	 * @param firstNode the firstNode parameter
	 * @param secondNode the secondNode parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkCousins(TreeNode tn, int firstNode, int secondNode) {
		path=new int[10];
		printNodes(tn,firstNode,secondNode,path,0);
		if(firstPath.length!=secondPath.length)
			return false;
		else{
			for (int k = firstPath.length-2;k>=0; k--) {
				if(firstPath[k]==secondPath[k])
					return false;
				else
					break;
			}
		}
		return true;

	}
	/**
	 * Performs printNodes operation.
	 *
	 * @param tn the tree node to process
	 * @param firstNode the firstNode parameter
	 * @param secondNode the secondNode parameter
	 * @param path the array to process
	 * @param pathLen the pathLen parameter
	 */
	private static void printNodes(TreeNode tn, int firstNode, int secondNode, int[] path, int pathLen) {
		// Check for null/base case
		if(tn!=null)
		{
			path[pathLen]=tn.value;
			pathLen++;
			if(tn.value==firstNode)
			{
				firstPath=Arrays.copyOfRange(path, 0, pathLen);
			}
			else if(tn.value==secondNode)
			{
				secondPath=Arrays.copyOfRange(path, 0, pathLen);
			}
			printNodes(tn.left, firstNode, secondNode, path, pathLen);
			printNodes(tn.right, firstNode, secondNode, path, pathLen);
		}	
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
