package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;

/*
 * http://www.geeksforgeeks.org/check-if-a-given-binary-tree-is-sumtree/
 * Check if a given Binary Tree is SumTree
 */;
/**
 * Implementation of Data Structures_ Binary Tree_26 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_26 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 _01DataStructures_BinaryTree_00 binaryTree1=new _01DataStructures_BinaryTree_00();
		 binaryTree1.insert(null,null,13);
		 binaryTree1.insert(13,"left",10);
		 binaryTree1.insert(13,"right",3);
		 binaryTree1.insert(10,"left",4);
		 binaryTree1.insert(10,"right",6);
		 binaryTree1.insert(3,"left",1);
		 binaryTree1.insert(3,"right",2);
		 binaryTree1.preOrder();
		 System.out.println(checkSumTree(binaryTree1));
	 }

	private static boolean checkSumTree(
			_01DataStructures_BinaryTree_00 binaryTree1) {
		return checkSumTree(binaryTree1.rootNode);
	}

	/**
	 * Performs checkSumTree operation.
	 *
	 * @param node the tree node to process
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkSumTree(Node node) {
		int leftSum=0,rightSum=0;
		// Check for null/base case
		if(node==null)
			return true;
		// Check for null/base case
		if(node.left!=null)
			leftSum=node.left.data;
		// Check for null/base case
		if(node.right!=null)
			rightSum=node.right.data;
		// Check if node is a leaf (no children)
		if(node.left==null && node.right==null)
			return true;
		else if(node.data==(leftSum+rightSum) && checkSumTree(node.left) && checkSumTree(node.right))
			return true;
		else
			return false;
	}

	

	
 }
