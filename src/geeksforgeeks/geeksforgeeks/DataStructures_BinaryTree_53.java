package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * http://www.geeksforgeeks.org/lowest-common-ancestor-binary-tree-set-1/
 * Lowest Common Ancestor in a Binary Tree
 */;
/**
 * Implementation of Data Structures_ Binary Tree_53 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_53 {
	 static int path[];
	 static ArrayList<int []> arrayList=new ArrayList<int []>();
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
		 System.out.println(findLCALong(binaryTree1,3,4));
		 System.out.println(findLCAShort(binaryTree1,3,4));

	 }
	 private static int findLCAShort(
			 _01DataStructures_BinaryTree_00 binaryTree1, int i, int j) {
		 return findLCAShort(binaryTree1.rootNode,i,j).data;
	 }
	 /**
	  * Finds lca short in the data structure.
	  *
	  * @param node the tree node to process
	  * @param i the i parameter
	  * @param j the j parameter
	  * @return the Node result
	  */
	 private static Node findLCAShort(Node node, int i, int j) {
		 // Check for null/base case
		 if(node==null)
			 return null;
		 if(node.data==i||node.data==j)
			 return node;
		 Node left=findLCAShort(node.left,i,j);
		 Node right=findLCAShort(node.right,i,j);
		 // Check if node is a leaf (no children)
		 if(left!=null && right!=null)
			 return node;
		 return left!=null?left:right;
	 }
	 private static int findLCALong(
			 _01DataStructures_BinaryTree_00 binaryTree1, int i, int j) {
		 path=new int[getHeight(binaryTree1.rootNode)];
		 findLCALong(binaryTree1.rootNode,path,3,4,0);
		 int size=(arrayList.get(0).length>arrayList.get(1).length)?arrayList.get(1).length:arrayList.get(0).length;
		 int firstArray[]=arrayList.get(0);
		 int secondArray[]=arrayList.get(1);
		 if(size==1)
			 return firstArray[0];
		 for (int k = 0; k < size; k++) {
			 if(firstArray[k]!=secondArray[k])
				 return firstArray[(k-1)];
		 }
		 return 0;
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
	  * Finds lca long in the data structure.
	  *
	  * @param node the tree node to process
	  * @param path the array to process
	  * @param i the i parameter
	  * @param j the j parameter
	  * @param pathLen the pathLen parameter
	  */
	 private static void findLCALong(Node node,int[] path, int i, int j,int pathLen) {
		 // Check for null/base case
		 if(node!=null)
		 {
			 if(node.data==i||node.data==j)
			 {
				 arrayList.add(Arrays.copyOfRange(path,0,pathLen));
			 }
			 path[pathLen]=node.data;
			 pathLen++;

			 findLCALong(node.left,path,i,j,pathLen);
			 findLCALong(node.right,path,i,j,pathLen);
		 }
	 }
 }
