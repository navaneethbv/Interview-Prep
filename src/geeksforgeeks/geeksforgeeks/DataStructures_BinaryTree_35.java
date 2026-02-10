package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;

/*
 * http://www.geeksforgeeks.org/check-if-a-given-binary-tree-is-full-tree-or-not/	
 * Check whether a given Binary Tree is Full or not
 */;
/**
 * Implementation of Data Structures_ Binary Tree_35 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_35 {
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
		 binaryTree1.insert(3,"left",6);
		 binaryTree1.inOrder();
		 System.out.println(checkFull(binaryTree1));
		 binaryTree1=new _01DataStructures_BinaryTree_00();
		 binaryTree1.insert(null,null,1);
		 binaryTree1.insert(1,"left",2);
		 binaryTree1.insert(1,"right",3);
		 binaryTree1.insert(3,"left",5);
		 binaryTree1.insert(3,"right",6);
		 binaryTree1.insert(2,"right",4);
		 binaryTree1.insert(2,"left",7);
		 
		 binaryTree1.inOrder();
		 System.out.println(checkFull(binaryTree1));
	 }

	private static boolean checkFull(
			_01DataStructures_BinaryTree_00 binaryTree1) {
		return checkFull(binaryTree1.rootNode);
	}

	/**
	 * Performs checkFull operation.
	 *
	 * @param node the tree node to process
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkFull(Node node) {
		// Check for null/base case
		if(node!=null){
			if(node.left==null && node.right!=null || node.left!=null && node.right==null)
			{
				return false;
			}
			// Recursively process left and right subtrees
			return checkFull(node.left) && checkFull(node.right);
		}
		return true;
	}
	

 }
