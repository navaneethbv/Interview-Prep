package Warmup;

import java.util.Iterator;
import java.util.Stack;

/**
 * Implementation of square Skype Interview2 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class squareSkypeInterview2 {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		BST tree = new BST();
		tree.add(10);
		tree.add(15);
		tree.add(5);

		tree.add(2);

		tree.add(7);
		tree.add(12);
		tree.add(20);
		tree.add(5);

		tree.print();
		System.out.println("---");
		for (int i : tree) {
			System.out.println(i);
		}


		//tree.print();
		System.out.println("done");
	}

	/**
	 * Inner class representing a node in the data structure.
	 */
	static class TreeNode{
		TreeNode left,right;
		int value;
		public TreeNode(int value)
		{
			this.value=value;
		}
	}

	/**
	 * Inner class BSTIter for supporting operations.
	 */
	static class BSTIter implements Iterator<Integer> {
		Stack<TreeNode> stack=new Stack<TreeNode>();

		public BSTIter(TreeNode root) {
			addLeftChild(root);
		}
		/**
		 * Adds left child to the data structure.
		 *
		 * @param tn the tree node to process
		 */
		public void addLeftChild(TreeNode tn){
			while(tn!=null)
			{
				stack.push(tn);
				tn=tn.left;        
			}
		}
		@Override
		/**
		 * Checks if next.
		 *
		 * @return true if condition is met, false otherwise
		 */
		public boolean hasNext() {
			if(stack.isEmpty())
				return false;
			return true;
		}

		@Override
		/**
		 * Performs next operation.
		 *
		 * @return the Integer result
		 */
		public Integer next() {
			TreeNode tn=stack.pop();
			addLeftChild(tn.right);
			return tn.value;      
		}
		@Override
		/**
		 * Removes  from the data structure.
		 *
		 */
		public void remove() {
			// TODO Auto-generated method stub
			
		}
	}

	/**
	 * Inner class BST for supporting operations.
	 */
	static class BST implements Iterable<Integer> {

		TreeNode root;

		@Override
		/**
		 * Performs iterator operation.
		 *
		 * @return the Iterator<Integer> result
		 */
		public Iterator<Integer> iterator() {
			return new BSTIter(root);
		}

		/**
		 * Adds  to the data structure.
		 *
		 * @param value the value value
		 */
		public  void add(int value){
			// Check for null/base case
			if(root==null)
			{
				root=new TreeNode(value);
			}
			else{
				if(root.value>value)
					root.left= addUtil(root.left,value);    
				else  if(root.value<value)
					root.right=addUtil(root.right,value); 
			}

		}
		/**
		 * Adds util to the data structure.
		 *
		 * @param tn the tree node to process
		 * @param value the value value
		 * @return the TreeNode result
		 */
		public TreeNode addUtil(TreeNode tn,int value){
			// Check for null/base case
			if(tn==null)
			{
				tn=new TreeNode(value);
				return tn;
			}
			else{
				if(tn.value>value)
				{
					tn.left=addUtil(tn.left,value);
				}
				else if(tn.value<value)
				{
					tn.right=addUtil(tn.right,value);
				}
			}
			return tn;
		}

		/**
		 * Performs print operation.
		 *
		 */
		public void print() {
			print(root);
		}

		/**
		 * Performs print operation.
		 *
		 * @param node the tree node to process
		 */
		private void print(TreeNode node) {
			// Check for null/base case
			if (node == null) {
				return;
			}

			print(node.left);
			System.out.println(node.value);
			print(node.right);
		}
	}
}
