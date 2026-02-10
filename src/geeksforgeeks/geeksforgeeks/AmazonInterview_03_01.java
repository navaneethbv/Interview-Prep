package geeksforgeeks;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-2/
 * Given a linked list containing character in each node, segregate its nodes in such a way that all nodes containing a vowel
 * are moved to the end of the linked list.We will have to maintain the order.
 */
/**
 * Implementation of Amazon Interview_03_01 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AmazonInterview_03_01 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		_01AmazonInterview_03linkedList linkedList=new _01AmazonInterview_03linkedList();
		linkedList.add("d");
		linkedList.add("a");
		linkedList.add("r");
		linkedList.add("s");
		linkedList.add("h");
		linkedList.add("a");
		linkedList.add("n");
		linkedList.add("e");
		linkedList.add("i");
		linkedList.add("s");
		linkedList.add("h");
		linkedList.add("o");
		linkedList.add("n");
		linkedList.add("u");
		linkedList.add("i");
		System.out.println(linkedList.toString());
		linkedList=reArrangeLinkedList(linkedList);
		System.out.println(linkedList.toString());
		
	}

	private static _01AmazonInterview_03linkedList reArrangeLinkedList(
			_01AmazonInterview_03linkedList linkedList) {
		_01AmazonInterview_03linkedList newLinkedList=new _01AmazonInterview_03linkedList();
		for (int i = 0; i < linkedList.size(); i++) {
			String element=linkedList.get(i);
			if(!(element.contentEquals("a")||element.contentEquals("e")||
					element.contentEquals("i")||element.contentEquals("o")||element.contentEquals("u"))){
				newLinkedList.add(element);
			}
		}
		for (int i = 0; i < linkedList.size(); i++) {
			String element=linkedList.get(i);
			if((element.contentEquals("a")||element.contentEquals("e")||
					element.contentEquals("i")||element.contentEquals("o")||element.contentEquals("u"))){
				newLinkedList.add(element);
			}
		}
		return newLinkedList;
	}
	

}
class _01AmazonInterview_03linkedList {
	private Node presentNode;
	private Node headNode;
	private int noOfElements=0;
	public _01AmazonInterview_03linkedList() {
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
	 * @return the resulting string
	 */
	public String get(int position){
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
	public boolean add(int position,String value){
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
	public void add(String value){
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
			outputStringBuffer.append(pointerNode.data+" ");
			pointerNode=pointerNode.next;
		}
		// Recursively process left and right subtrees
		return outputStringBuffer.toString();
	}
	public class Node{
		public String data;
		public Node next;
		public Node() {
			// TODO Auto-generated constructor stub
		}
		public Node( String data,Node next) {
			this.data=data;
			this.next=next;
		}
		/**
		 * Retrieves data from the data structure.
		 *
		 * @return the resulting string
		 */
		public String getData() {
			return data;
		}
		/**
		 * Sets data in the data structure.
		 *
		 * @param data the data parameter
		 */
		public void setData(String data) {
			this.data = data;
		}
	}
}