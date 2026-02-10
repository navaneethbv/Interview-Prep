package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;

/*
 * http://www.geeksforgeeks.org/find-the-maximum-sum-path-in-a-binary-tree/
 * Find the maximum sum leaf to root path in a Binary Tree
 */;
/**
 * Implementation of Data Structures_ Binary Tree_32 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_32 {
	 static int path[],maxSum=0;
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
		 binaryTree1.preOrder();
		 path=new int[getHeight(binaryTree1)];
		 getMaxSum(binaryTree1);
	 }
	/**
	 * Retrieves height from the data structure.
	 *
	 * @param binaryTree1 the binaryTree1 parameter
	 * @return the computed integer result
	 */
	private static int getHeight(_01DataStructures_BinaryTree_00 binaryTree1) {
		
		// Recursively process left and right subtrees
		return getHeight(binaryTree1.rootNode);
	}
	/**
	 * Retrieves height from the data structure.
	 *
	 * @param node the tree node to process
	 * @return the computed integer result
	 */
	private static int getHeight(Node node) {
		// Check for null/base case
		if(node!=null)
		{
			int leftHeight=getHeight(node.left);
			int rightHeight=getHeight(node.right);
			return 1+((leftHeight>rightHeight)?leftHeight:rightHeight);
		}
		return 0;
	}
	/**
	 * Retrieves max sum from the data structure.
	 *
	 * @param binaryTree1 the binaryTree1 parameter
	 */
	private static void getMaxSum(_01DataStructures_BinaryTree_00 binaryTree1) {
		getMaxSum(binaryTree1.rootNode,path,0);
		System.out.println("Max Sum is :"+maxSum);
	}
	/**
	 * Retrieves max sum from the data structure.
	 *
	 * @param node the tree node to process
	 * @param path2 the array to process
	 * @param pathLen the pathLen parameter
	 */
	private static void getMaxSum(Node node, int[] path2, int pathLen) {
		// Check for null/base case
		if(node==null)
		{
			return;
		}
		else{
			path[pathLen]=node.data;
			pathLen++;
		}
		// Check if node is a leaf (no children)
		if(node.left==null && node.right==null){
			int sum=0;
			// Iterate through all elements
			for (int i = 0; i < path2.length; i++) {
				sum+=path2[i];
			}
			if(sum>maxSum)
				maxSum=sum;
		}
		else{
			getMaxSum(node.left,path2,pathLen);
			getMaxSum(node.right,path2,pathLen);
		}
		
	}

	

 }
