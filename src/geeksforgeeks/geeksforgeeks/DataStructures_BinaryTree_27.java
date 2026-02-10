package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;


/*
 * http://www.geeksforgeeks.org/check-if-a-binary-tree-is-subtree-of-another-binary-tree/
 * Check if a binary tree is subtree of another binary tree 
 */;
/**
 * Implementation of Data Structures_ Binary Tree_27 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_27 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 _01DataStructures_BinaryTree_00 binaryTree1=new _01DataStructures_BinaryTree_00();
		 binaryTree1.insert(null,null,10);
		 binaryTree1.insert(10,"left",4);
		 binaryTree1.insert(10,"right",6);
		 binaryTree1.insert(4,"right",30);
		 binaryTree1.preOrder();
		 _01DataStructures_BinaryTree_00 binaryTree2=new _01DataStructures_BinaryTree_00();
		 binaryTree2.insert(null,null,26);
		 binaryTree2.insert(26,"left",10);
		 binaryTree2.insert(26,"right",3);
		 binaryTree2.insert(3,"right",3);
		 binaryTree2.insert(10,"left",4);
		 binaryTree2.insert(10,"right",6);
		 binaryTree2.insert(4,"right",32);
		 binaryTree2.preOrder();
		 System.out.println(checkSubTree(binaryTree1,binaryTree2));
	 }

	 private static boolean checkSubTree(//checks if bin tree1 is a subset of bin tree2
			 _01DataStructures_BinaryTree_00 binaryTree1,
			 _01DataStructures_BinaryTree_00 binaryTree2) {
		 return checkSubTree(binaryTree1.rootNode,binaryTree2.rootNode);
	 }

	 /**
	  * Performs checkSubTree operation.
	  *
	  * @param node1 the node1 parameter
	  * @param node2 the node2 parameter
	  * @return true if condition is met, false otherwise
	  */
	 private static boolean checkSubTree(Node node1, Node node2) {
		 node2=getNode(node1,node2);
		 return checkStructure(node1,node2);
	 }

	 /**
	  * Performs checkStructure operation.
	  *
	  * @param node1 the node1 parameter
	  * @param node2 the node2 parameter
	  * @return true if condition is met, false otherwise
	  */
	 private static boolean checkStructure(Node node1, Node node2) {
		// Check for null/base case
		if(node1!=null && node2!=null)
		{
			return (node1.data==node2.data 
					&& checkStructure(node1.left,node2.left)
					&& checkStructure(node1.right,node2.right));
		}
		return true;
	 }

	/**
	 * Retrieves node from the data structure.
	 *
	 * @param node1 the node1 parameter
	 * @param node2 the node2 parameter
	 * @return the Node result
	 */
	private static Node getNode(Node node1, Node node2) {
		 // Check for null/base case
		 if(node2!=null){
			 if(node1.data==node2.data)
				 return node2;
			 // Check for null/base case
			 else if(node2.left!=null)
				 // Recursively process left and right subtrees
				 return getNode(node1,node2.left);
			 else
				 // Recursively process left and right subtrees
				 return getNode(node1,node2.right);
		 }
		 return null;
	}


 }
