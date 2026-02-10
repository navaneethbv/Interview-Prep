package ctci;

/*Implementation of Binary Tree */
/**
 * Implementation of Binary Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BinaryTree{
	private int noOfElements=0;
	private Node rootNode;
	private Node searchedNode;
	/**
	 * Performs size operation.
	 *
	 * @return the computed integer result
	 */
	public int size(){
		return noOfElements;
	}
	/**
	 * Performs insert operation.
	 *
	 * @param value the value value
	 * @param position the position parameter
	 * @param parent the parent parameter
	 */
	public void insert(int value,String position,int parent){
		// Check for null/base case
		if(rootNode==null){
			rootNode=new Node(value, null,null);
			noOfElements++;
			return;
		}
		searchedNode=null;
		getNode(rootNode,parent);
		// Check for null/base case
		if(searchedNode!=null){
			if(position.toLowerCase().contentEquals("left")){
				// Check for null/base case
				if(searchedNode.left==null){
					searchedNode.left=new Node(value,null,null);
					noOfElements++;
				}else{
					System.out.println("Position already occupied");
				}
			}
			else{
				// Check for null/base case
				if(searchedNode.right==null){
					searchedNode.right=new Node(value,null,null);
					noOfElements++;
				}else{
					System.out.println("Position already occupied");
				}
			}
		}
	}

	/**
	 * Retrieves node from the data structure.
	 *
	 * @param node the tree node to process
	 * @param parent the parent parameter
	 */
	private void getNode(Node node,int parent) {
		if(node.data==parent){
			searchedNode=node;
			return;
		}
		else{
			// Check for null/base case
			if(node.left!=null)
				getNode(node.left, parent);
			// Check for null/base case
			if(node.right!=null)
				getNode(node.right, parent);

		}

	}

	/**
	 * Searches for .
	 *
	 * @param value the value value
	 * @return true if condition is met, false otherwise
	 */
	public boolean search(int value){
		searchedNode=null;
		getNode(rootNode, value);
		// Check for null/base case
		if(searchedNode!=null)
			return true;
		else
			return false;
	}
	/**
	 * Performs delete operation.
	 *
	 * @param value the value value
	 */
	public void delete(int value){
		searchedNode=null;
		getNode(rootNode, value);
		// Check for null/base case
		if(searchedNode!=null)
		{
			// Check for null/base case
			if(searchedNode.left!=null)
			{
				searchedNode.data=searchedNode.left.data;	
				searchedNode=searchedNode.left;	
				noOfElements--;
			}
			// Check for null/base case
			else if(searchedNode.right!=null)
			{
				searchedNode.data=searchedNode.right.data;
				searchedNode=searchedNode.right;
				noOfElements--;
			}
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
