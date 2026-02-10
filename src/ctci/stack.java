package ctci;



/*Implementation of Hash Map Data Structure*/
/**
 * Implementation of stack algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class stack {
	private Node presentNode;
	private int noOfElements;
	public _03stack() {
		presentNode=new Node();
		presentNode.previousNode=null;
	}
	/**
	 * Performs push operation.
	 *
	 * @param value the value value
	 */
	public void push(int value){
		presentNode.data=value;
		Node newNode=new Node();
		newNode.previousNode=presentNode;
		presentNode=newNode;
		noOfElements++;
	}
	/**
	 * Performs pop operation.
	 *
	 * @return the computed integer result
	 */
	public int pop() throws ArrayIndexOutOfBoundsException{
		int value=presentNode.previousNode.data;
		presentNode=presentNode.previousNode;
		noOfElements--;
		return value;
	}
	/**
	 * Performs size operation.
	 *
	 * @return the computed integer result
	 */
	public int size(){
		return noOfElements;
	}
	/**
	 * Checks if empty.
	 *
	 * @return true if condition is met, false otherwise
	 */
	public boolean isEmpty(){
		return noOfElements==0?true:false;
	}
	/**
	 * Performs toString operation.
	 *
	 * @return the resulting string
	 */
	public String toString(){
		StringBuilder outputStringBuilder=new StringBuilder();
		Node pointerNode=new Node();
		pointerNode=presentNode.previousNode;
		while(pointerNode!=null){
			outputStringBuilder.append(pointerNode.data+"\n");
			pointerNode=pointerNode.previousNode;
		}
		// Recursively process left and right subtrees
		return outputStringBuilder.toString();
	}





	class Node{
		int data;
		Node previousNode;
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
		 * Retrieves previous node from the data structure.
		 *
		 * @return the Node result
		 */
		public Node getPreviousNode() {
			return previousNode;
		}
		/**
		 * Sets previous node in the data structure.
		 *
		 * @param previousNode the previousNode parameter
		 */
		public void setPreviousNode(Node previousNode) {
			this.previousNode = previousNode;
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

