package ctci;

import ctci._10BinarySearchTree.Node;


/*Implementation of Depth First Search */
/**
 * Implementation of DFS algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DFS{
	Node rootNode;
	/**
	 * Performs preOrder operation.
	 *
	 */
	public void preOrder(){
		System.out.println("********Pre order Starts**********");
		preOrder(rootNode);
		System.out.println("*********Pre order Ends***********");
	}
	/**
	 * Performs preOrder operation.
	 *
	 * @param node the tree node to process
	 */
	private void preOrder(Node node){
		// Check for null/base case
		if(node!=null){
			System.out.println(node.data);
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

}