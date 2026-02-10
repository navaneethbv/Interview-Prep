package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;

/*
 * http://www.geeksforgeeks.org/remove-all-nodes-which-lie-on-a-path-having-sum-less-than-k/
 * Remove all nodes which dont lie in any path with sum>= k
 * 
 */;
/**
 * Implementation of Data Structures_ Binary Tree_46 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_46 {
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
		 binaryTree1.insert(3,"right",7);
		 binaryTree1.insert(4,"left",8);
		 binaryTree1.insert(4,"right",9);
		 binaryTree1.insert(5,"left",12);
		 binaryTree1.insert(7,"left",10);
		 binaryTree1.insert(9,"left",13);
		 binaryTree1.insert(9,"right",14);
		 binaryTree1.insert(10,"right",11);
		 binaryTree1.insert(14,"left",15);
		 binaryTree1.preOrder();
		 Node outputNode=deleteNodeSum(binaryTree1,14);
		 preOrder(outputNode);
	 }

	 /**
	  * Performs preOrder operation.
	  *
	  * @param node the tree node to process
	  */
	 private static void preOrder(Node node) {
		 // Check for null/base case
		 if(node!=null)
		 {
			 preOrder(node.left);
			 preOrder(node.right);
			 System.out.print(node.data+",");
		 }

	 }

	 private static Node deleteNodeSum(
			 _01DataStructures_BinaryTree_00 binaryTree1, int k) {
		 return deleteNodeSum(binaryTree1.rootNode,k,0);
	 }

	 /**
	  * Performs deleteNodeSum operation.
	  *
	  * @param node the tree node to process
	  * @param k the k value
	  * @param sum the sum parameter
	  * @return the Node result
	  */
	 private static Node deleteNodeSum(Node node, int k, int sum) {
		 // Check for null/base case
		 if(node==null)
			 return null;
		 int leftSum=sum+node.data;
		 int rightSum=leftSum;
		 node.left=deleteNodeSum(node.left,k,leftSum);
		 node.right=deleteNodeSum(node.right,k,rightSum);
		 sum=(leftSum>rightSum)?leftSum:rightSum;
		 if(sum>k)
			 node=null;
		 return node;
	 }
 }
