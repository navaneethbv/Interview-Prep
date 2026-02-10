package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;



/*
 * http://www.geeksforgeeks.org/check-if-a-given-binary-tree-is-complete-tree-or-not/	
 * Check whether a given Binary Tree is complete or not
 */;
/**
 * Implementation of Data Structures_ Binary Tree_36 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_36 {
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
		 checkComplete(binaryTree1);
		 binaryTree1=new _01DataStructures_BinaryTree_00();
		 binaryTree1.insert(null,null,1);
		 binaryTree1.insert(1,"left",2);
		 binaryTree1.insert(1,"right",3);
		 binaryTree1.insert(3,"left",5);
		 binaryTree1.insert(3,"right",6);
		 binaryTree1.insert(2,"right",4);
		 binaryTree1.inOrder();
		 checkComplete(binaryTree1);
	 }

	private static void checkComplete(
			_01DataStructures_BinaryTree_00 binaryTree1) {
		 checkComplete(binaryTree1.rootNode);
		 System.out.println("It is a compelete tree");
	}

	/**
	 * Performs checkComplete operation.
	 *
	 * @param node the tree node to process
	 */
	private static void checkComplete(Node node) {
		tempQueue1 queue=new tempQueue1();
		boolean fullNodeFound=false;
		while(node!=null){
			//System.out.print(node.data+",");
			// Check if node is a leaf (no children)
			if(fullNodeFound && (node.left!=null || node.right!=null)){
				System.out.println("Not a complete tree");
				System.exit(1);
			}
			// Check for null/base case
			if(node.left!=null)
				queue.add(node.left);
			// Check for null/base case
			if(node.right!=null)
				queue.add(node.right);
			// Check if node is a leaf (no children)
			if(node.left==null || node.right==null)
				fullNodeFound=true;
			node=queue.poll();
		}
	}
	

 }
