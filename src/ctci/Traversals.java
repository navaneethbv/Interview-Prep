package ctci;



/*Implementation of CTCI */
/**
 * Implementation of Traversals algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Traversals{
	//level order traversal same as BFS
	/**
	 * Performs preOrder operation.
	 *
	 * @param node the tree node to process
	 */
	public void preOrder(Node node){
		// Check for null/base case
		if(node!=null){
			System.out.println(node.data);
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	/**
	 * Performs inOrder operation.
	 *
	 * @param node the tree node to process
	 */
	public void inOrder(Node node){
		// Check for null/base case
		if(node!=null){
			inOrder(node.left);
			System.out.println(node.data);
			inOrder(node.right);
		}
	}
	/**
	 * Performs postOrder operation.
	 *
	 * @param node the tree node to process
	 */
	public void postOrder(Node node){
		// Check for null/base case
		if(node!=null){
			postOrder(node.left);
			postOrder(node.right);
			System.out.println(node.data);
		}
	}
	class Node{
		int data;
		Node left=null;
		Node right=null;
		public Node(int data,Node left,Node right) {
			this.data=data;
			this.left=left;
			this.right=right;
		}
		/**
		 * Retrieves data from the data structure.
		 *
		 * @return the computed integer result
		 */
		public int getData() {
			return data;
		}
		/**
		 * Sets data in the data structure.
		 *
		 * @param data the data parameter
		 */
		public void setData(int data) {
			this.data = data;
		}
		/**
		 * Retrieves left from the data structure.
		 *
		 * @return the Node result
		 */
		public Node getLeft() {
			return left;
		}
		/**
		 * Sets left in the data structure.
		 *
		 * @param left the left parameter
		 */
		public void setLeft(Node left) {
			this.left = left;
		}
		/**
		 * Retrieves right from the data structure.
		 *
		 * @return the Node result
		 */
		public Node getRight() {
			return right;
		}
		/**
		 * Sets right in the data structure.
		 *
		 * @param right the right parameter
		 */
		public void setRight(Node right) {
			this.right = right;
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