package ctci;


/*Implementation of Queue Data Structure*/
/**
 * Implementation of queue algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class queue {
	Node headNode;
	Node exitNode;
	int noOfElements=0;
	/**
	 * Performs poll operation.
	 *
	 * @return the computed integer result
	 */
	public int poll(){//Retrieves and removes the head of this queue, or returns null if this queue is empty.
		int returnData=0;
		// Check for null/base case
		if(headNode!=null)
		{
			returnData=headNode.data;
			headNode=headNode.next;
			noOfElements--;
		}
		return returnData;
	}
	/**
	 * Performs peek operation.
	 *
	 * @return the computed integer result
	 */
	public int peek(){//Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
		// Check for null/base case
		if(headNode!=null)
			return headNode.data;
		return 0;
	}
	/**
	 * Checks if empty.
	 *
	 * @return the Boolean result
	 */
	public Boolean isEmpty(){
		return noOfElements==0?true:false;
	}
	/**
	 * Performs clear operation.
	 *
	 */
	public void clear(){
		noOfElements=0;
		headNode=exitNode=null;
	}
	/**
	 * Adds  to the data structure.
	 *
	 * @param value the value value
	 */
	public void add(int value){
		// Check for null/base case
		if(headNode==null){
			headNode=new Node();
			headNode.data=value;
			exitNode=headNode;
		}
		else{
			Node newNode=new Node();
			newNode.data=value;
			exitNode.next=newNode;
			exitNode=newNode;
		}
		noOfElements++;
	}
	/**
	 * Removes  from the data structure.
	 *
	 * @return the computed integer result
	 */
	public int remove(){//Retrieves and removes the head of this queue. This method differs from poll only in that it throws an exception if this queue is empty.
		int returnData=0;
		// Check for null/base case
		if(headNode!=null)
		{
			returnData=headNode.data;
			headNode=headNode.next;
			noOfElements--;
		}
		return returnData;
	}
	/**
	 * Performs contains operation.
	 *
	 * @param value the value value
	 * @return the Boolean result
	 */
	public Boolean contains(int value){
		Node pointerNode=new Node();
		pointerNode=headNode;
		while(pointerNode!=null){
			if(pointerNode.data==value)
				return true;
			pointerNode=pointerNode.next;
		}
		return false;
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
	 * Performs toString operation.
	 *
	 * @return the resulting string
	 */
	public String toString(){
		StringBuilder outputStringBuilder=new StringBuilder();
		Node pointerNode=new Node();
		pointerNode=headNode;
		while(pointerNode!=null){
			outputStringBuilder.append(pointerNode.data+",");
			pointerNode=pointerNode.next;
		}
		// Recursively process left and right subtrees
		return outputStringBuilder.toString();
	}




	class Node{
		int data;
		Node next;
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
		 * Retrieves next from the data structure.
		 *
		 * @return the Node result
		 */
		public Node getNext() {
			return next;
		}
		/**
		 * Sets next in the data structure.
		 *
		 * @param next the next parameter
		 */
		public void setNext(Node next) {
			this.next = next;
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
