package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;




/*
 * http://www.geeksforgeeks.org/convert-a-given-tree-to-sum-tree/
 * Convert a given tree to its Sum Tree
 */;
/**
 * Implementation of Data Structures_ Binary Tree_30 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_30 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 _01DataStructures_BinaryTree_00 binaryTree1=new _01DataStructures_BinaryTree_00();
		 binaryTree1.insert(null,null,1);
		 binaryTree1.insert(1,"left",2);
		 binaryTree1.insert(1,"right",3);
		 binaryTree1.insert(2,"left",4);
		 binaryTree1.insert(2,"right",5);
		 binaryTree1.insert(3,"right",6);
		 binaryTree1.preOrder();
		 checkSumTree(binaryTree1);
		 binaryTree1.preOrder();
	 }

	/**
	 * Performs checkSumTree operation.
	 *
	 * @param binaryTree1 the binaryTree1 parameter
	 */
	private static void checkSumTree(_01DataStructures_BinaryTree_00 binaryTree1) {
		checkSumTree(binaryTree1.rootNode);
	}

	/**
	 * Performs checkSumTree operation.
	 *
	 * @param node the tree node to process
	 * @return the computed integer result
	 */
	private static int checkSumTree(Node node) {
		// Check for null/base case
		if(node!=null)
		{
			int leftValue=checkSumTree(node.left);
			int rightValue=checkSumTree(node.right);
			if(leftValue!=0 || rightValue!=0 && node.data!=(leftValue+rightValue)){
				node.data=leftValue+rightValue;
			}
			return node.data;
		}
		else
			return 0;
		
	}
 }
