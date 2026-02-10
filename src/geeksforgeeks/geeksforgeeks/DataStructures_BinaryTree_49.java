package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;

/*
 * http://www.geeksforgeeks.org/check-leaves-level/
 * Check if all leaves are at same level
 */;
/**
 * Implementation of Data Structures_ Binary Tree_49 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_49 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 _01DataStructures_BinaryTree_00 binaryTree1=new _01DataStructures_BinaryTree_00();
		 binaryTree1.insert(null,null,12);
		 binaryTree1.insert(12,"left",5);
		 binaryTree1.insert(12,"right",7);
		 binaryTree1.insert(5,"left",3);
		 //binaryTree1.insert(7,"right",1);
		 binaryTree1.preOrder();
		 System.out.println(checkLeavesLevel(binaryTree1));
	 }

	 private static boolean checkLeavesLevel(
			 _01DataStructures_BinaryTree_00 binaryTree1) {
		 return checkLeavesLevel(binaryTree1.rootNode);
	 }

	 /**
	  * Performs checkLeavesLevel operation.
	  *
	  * @param node the tree node to process
	  * @return true if condition is met, false otherwise
	  */
	 private static boolean  checkLeavesLevel(Node node) {
		 tempQueue queue =new tempQueue();
		 // Check for null/base case
		 if(node!=null){
			 queue.add(node);
			 int depth=0;
			 while(!queue.isEmpty()){
				 Node n=queue.poll();
				 // Check if node is a leaf (no children)
				 if(n.left==null && n.right==null)
				 {
					 int nodeDepth=getDepth(node,n,1);
					 // Check for null/base case
					 if(depth==0)
						 depth=nodeDepth;
					 else{
						 if(nodeDepth!=depth)
							 return false;
					 }
				 }
				 // Check for null/base case
				 if(n.left!=null)
					 queue.add(n.left);
				 // Check for null/base case
				 if(n.right!=null)
					 queue.add(n.right); 
			 }
			 return true;
		 }
		 return false;
	 }

	 /**
	  * Retrieves depth from the data structure.
	  *
	  * @param node the tree node to process
	  * @param n the size or count parameter
	  * @param i the i parameter
	  * @return the computed integer result
	  */
	 private static int getDepth(Node node, Node n, int i) {
		 // Check for null/base case
		 if(node==null)
			 return 0;
		 if(node.data==n.data)
			 return i;
		 int downLevel=getDepth(node.left,n,i+1);
		 if(downLevel!=0)
			 return downLevel;
		 downLevel=getDepth(node.right,n,i+1);
		 return downLevel;
	 }

 }
