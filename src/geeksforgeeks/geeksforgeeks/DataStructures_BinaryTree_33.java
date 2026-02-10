package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;


/*
 * http://www.geeksforgeeks.org/construct-binary-tree-from-inorder-traversal/
 * Construct Special Binary Tree from given Inorder traversal
 */;
/**
 * Implementation of Data Structures_ Binary Tree_33 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_33 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {

	 }
	 /**
	  * Performs preOrder operation.
	  *
	  * @param root the tree node to process
	  */
	 private static void preOrder(Node root) {
		 // Check for null/base case
		 if(root!=null)
		 {
			 System.out.print(root.data+",");
			 preOrder(root.left);
			 preOrder(root.right);
		 }
		
	 }
	/**
	 * Performs buildTree operation.
	 *
	 * @param inorder the array to process
	 * @param start the start parameter
	 * @param end the end parameter
	 * @return the Node result
	 */
	private static Node buildTree(int[] inorder,int start,int end) {
		 if(start>end)
			 return null;
		 int index=findMax(inorder,start,end);
		 _01DataStructures_BinaryTree_00 tree=new _01DataStructures_BinaryTree_00();
		 Node n=tree.new Node(inorder[index],null,null);
		 if(start==end)
			 return n;
		 n.left=buildTree(inorder,start,index-1);
		 n.right=buildTree(inorder,index+1,end);
		 return n;
	}
	 /**
	  * Finds max in the data structure.
	  *
	  * @param inorder the array to process
	  * @param start the start parameter
	  * @param end the end parameter
	  * @return the computed integer result
	  */
	 private static int findMax(int[] inorder, int start, int end) {
		 int max=0;
		 int index=-1;
		 for (int i = start; i <=end; i++) {
			 if(inorder[i]>max){
				 max=inorder[i];
				 index=i;
			 }
		 }
		 return index;
	 }



 }
