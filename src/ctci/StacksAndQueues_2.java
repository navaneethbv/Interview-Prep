package ctci;

import java.util.ArrayList;

/*Implementation of CTCI 3.2*/
class _8Stacks {
	private Node presentNode;
	private int noOfElements;
	ArrayList<Integer> minList=new ArrayList<Integer>();
	public _8Stacks() {
		presentNode=new Node();
		presentNode.previousNode=null;
	}
	/**
	 * Performs push operation.
	 *
	 * @param value the value value
	 */
	public void push(int value){
		// Check for null/base case
		if(minList.size()==0)
			minList.add(value);
		else{
			if(value<minList.get(minList.size()-1))
				minList.add(value);
			else
				minList.add(minList.get(minList.size()-1));
		}
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
		if(minList.size()!=0)
			minList.remove(minList.size()-1);
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
	/**
	 * Performs min operation.
	 *
	 * @return the computed integer result
	 */
	public int min(){
		// Recursively process left and right subtrees
		return minList.get(minList.size()-1);
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
}
/**
 * Implementation of Stacks And Queues_2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class StacksAndQueues_2{
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		_8Stacks stack=new _8Stacks();
		stack.push(10);
		stack.push(20);
		stack.push(30);		
		System.out.println("Min is"+stack.min());
		stack.push(5);
		System.out.println("Min is"+stack.min());
		stack.pop();
		System.out.println(stack.size());
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.isEmpty());
		stack.pop();
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack.toString());
	}
}
