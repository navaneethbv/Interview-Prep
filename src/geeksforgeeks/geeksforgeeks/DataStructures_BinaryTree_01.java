package geeksforgeeks;



/*
 * http://www.geeksforgeeks.org/618/
 * Tree Traversals
 */;
/**
 * Implementation of Data Structures_ Binary Tree_01 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_01 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 _01DataStructures_BinaryTree_00 binaryTree=new _01DataStructures_BinaryTree_00();
		 binaryTree.insert(null,null,10);
		 binaryTree.insert(10,"left",11);
		 binaryTree.insert(10,"right",12);
		 binaryTree.insert(11,"left",13);
		 binaryTree.insert(11,"right",14);
		 binaryTree.insert(12,"left",15);
		 binaryTree.insert(12,"right",16);
		 binaryTree.preOrder();
		 binaryTree.inOrder();
		 binaryTree.postOrder();
	 }
 }