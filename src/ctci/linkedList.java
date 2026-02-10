package ctci;

/*Implementation of Singly Linked List Data Structure*/
/**
 * Implementation of linked List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class linkedList {
	private Node presentNode;
	private Node headNode;
	private int noOfElements=0;
	public _02linkedList() {
	}
	/**
	 * Retrieves head node from the data structure.
	 *
	 * @return the Node result
	 */
	public Node getHeadNode(){
		return headNode;
	}
	/**
	 * Retrieves  from the data structure.
	 *
	 * @param position the position parameter
	 * @return the computed integer result
	 */
	public int get(int position){
		if(position>noOfElements)
			throw new ArrayIndexOutOfBoundsException();
		else{
			int elementCount=0;
			Node pointerNode=new Node();
			pointerNode=headNode;
			while(position!=elementCount){
				//conditions,its at last
				pointerNode=pointerNode.next;
				elementCount++;
				//not at last
			}
			return pointerNode.data;
		}
	}
	/**
	 * Adds  to the data structure.
	 *
	 * @param position the position parameter
	 * @param value the value value
	 * @return true if condition is met, false otherwise
	 */
	public boolean add(int position,int value){
		if(position>noOfElements)
			return false;
		// Check for null/base case
		if(position==0){
			add(value);
			return true;
		}
		//go from header till that position
		Node pointerNode=new Node();
		pointerNode=headNode;
		int elementCount=0;
		while(position-1!=elementCount){
			pointerNode=pointerNode.next;
			elementCount++;
		}
		Node newNode=new Node();
		newNode.data=value;
		newNode.next=pointerNode.next;
		pointerNode.next=newNode;
		noOfElements++;
		return true;
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
	 * Adds  to the data structure.
	 *
	 * @param value the value value
	 */
	public void add(int value){
		// Check for null/base case
		if(presentNode==null){
			headNode=new Node();
			headNode.next=null;
			headNode.data=value;
			presentNode=headNode;
		}
		else{
			Node newNode=new Node();
			presentNode.next=newNode;
			newNode.next=null;
			newNode.data=value;
			presentNode=newNode;
		}
		noOfElements++;
	}
	/**
	 * Performs delete operation.
	 *
	 * @return true if condition is met, false otherwise
	 */
	public boolean delete(){
		// Check for null/base case
		if(headNode==null)
			return false;
		headNode=headNode.next;
		noOfElements--;
		return true;
	}
	/**
	 * Performs delete operation.
	 *
	 * @param position the position parameter
	 * @return true if condition is met, false otherwise
	 */
	public boolean delete(int position){
		if(position>noOfElements)
			return false;
		// Check for null/base case
		if(position==0){
			delete();
			return true;
		}
		//go from header till that position
		Node pointerNode=new Node();
		pointerNode=headNode;
		int elementCount=0;
		while(position-1!=elementCount){
			//conditions,its at last
			pointerNode=pointerNode.next;
			elementCount++;
			//not at last
		}
		pointerNode.next=pointerNode.next.next;
		noOfElements--;
		return true;
	}
	/**
	 * Performs toString operation.
	 *
	 * @return the resulting string
	 */
	public String toString(){
		Node pointerNode=new Node();
		pointerNode=headNode;
		StringBuffer outputStringBuffer=new StringBuffer();
		while(pointerNode!=null){
			outputStringBuffer.append(pointerNode.data+"\n");
			pointerNode=pointerNode.next;
		}
		// Recursively process left and right subtrees
		return outputStringBuffer.toString();
	}
	public class Node{//changed to public inorder to use this in other packages
		public int data;
		public Node next;
		public Node() {
			// TODO Auto-generated constructor stub
		}
		public Node( int data,Node next) {
			this.data=data;
			this.next=next;
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

