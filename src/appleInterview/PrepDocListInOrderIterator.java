package appleInterview;

import java.util.Iterator;
import java.util.Stack;

/**
 * Implementation of Prep Doc List In Order Iterator algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrepDocListInOrderIterator {
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class Node{Node left,right;int value;
	public Node( int value){this.value=value;}
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Node n=new Node(5);
		n.left=new Node(3);
		n.right=new Node(7);
		n.left.left=new Node(1);
		n.left.right=new Node(4);
		n.right.left=new Node(6);
		n.right.right=new Node(8);
		Iteratorn itr=new Iteratorn(n);
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	/**
	 * Inner class Iteratorn for supporting operations.
	 */
	static class Iteratorn implements Iterator<Integer>{
		Stack<Node> stack=new Stack<>();
		public Iteratorn(Node root) {
			addLeftNodes(root);
		}
		/**
		 * Adds left nodes to the data structure.
		 *
		 * @param n the size or count parameter
		 */
		public void addLeftNodes(Node n)
		{
			while(n!=null)
			{
				stack.push(n);
				n=n.left;
			}
		}
		@Override
		/**
		 * Checks if next.
		 *
		 * @return true if condition is met, false otherwise
		 */
		public boolean hasNext() {
			return !stack.isEmpty();
		}

		@Override
		/**
		 * Performs next operation.
		 *
		 * @return the Integer result
		 */
		public Integer next() {
			Node n=stack.pop();
			addLeftNodes(n.right);
			return n.value;
		}

	}
}
