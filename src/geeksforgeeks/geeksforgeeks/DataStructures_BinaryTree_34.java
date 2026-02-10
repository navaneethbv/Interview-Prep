package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;

/*
 * http://www.geeksforgeeks.org/construct-a-special-tree-from-given-preorder-traversal/
 * Construct a special tree from given preorder traversal
 * 				***********Code HAS BUG*************
 */;
/**
 * Implementation of Data Structures_ Binary Tree_34 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_34 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {

	 }
	 /**
	  * Performs buildTree operation.
	  *
	  * @param pre the array to process
	  * @param preLN the array to process
	  * @param i the i parameter
	  * @param j the j parameter
	  * @return the Node result
	  */
	 private static Node buildTree(int[] pre, char[] preLN, int i, int j) {
		 int index=i;
		 if(i==j)
			 return null;
		 _01DataStructures_BinaryTree_00 tree=new _01DataStructures_BinaryTree_00();
		 Node n=tree.new Node(pre[index],null,null);
		 index++;
		 if(preLN[index]=='N'){
			 n.left=buildTree(pre,preLN,index,j);
			 n.right=buildTree(pre,preLN,index,j);
		 }
		 return n;
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

 }
