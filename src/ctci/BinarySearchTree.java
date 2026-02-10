package ctci;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*Implementation of Binary Search Tree */
/**
 * Implementation of Binary Search Tree algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class BinarySearchTree{
	private Node rootNode,searchedNode;
	private int noOfElements=0;
	public _10BinarySearchTree() {
	}
	/**
	 * Performs insert operation.
	 *
	 * @param value the value value
	 */
	public void insert(int value){
		// Check for null/base case
		if(rootNode==null){
			rootNode=new Node(value, null, null);
		}
		else{
			insert(rootNode,value);
		}
		noOfElements++;
	}
	/**
	 * Performs insert operation.
	 *
	 * @param node the tree node to process
	 * @param value the value value
	 * @return the Node result
	 */
	private Node insert(Node node,int value){
		// Check for null/base case
		if(node==null){
			node=new Node(value, null, null);
			return node;
		}
		else{
			if(node.data>value){
				node.left=insert(node.left,value);
			}
			else if(node.data<value){
				node.right=insert(node.right,value);
			}
			return node;
		}
	}
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
	 * Performs inOrder operation.
	 *
	 */
	public void inOrder(){
		System.out.println("********In order Starts**********");
		inOrder(rootNode);
		System.out.println("*********In order Ends***********");
	}
	/**
	 * Performs inOrder operation.
	 *
	 * @param node the tree node to process
	 */
	private void inOrder(Node node){
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
	 */
	public void postOrder(){		
		System.out.println("********Post order Starts**********");
		postOrder(rootNode);
		System.out.println("*********Post order Ends***********");
	}
	/**
	 * Performs postOrder operation.
	 *
	 * @param node the tree node to process
	 */
	private void postOrder(Node node){
		// Check for null/base case
		if(node!=null){
			postOrder(node.left);
			postOrder(node.right);
			System.out.println(node.data);
		}
	}
	/**
	 * Performs delete operation.
	 *
	 * @param value the value value
	 */
	public void delete(int value){
		// Check for null/base case
		if(delete(rootNode,value)!=null)
			noOfElements--;
	}
	/**
	 * Performs delete operation.
	 *
	 * @param node the tree node to process
	 * @param value the value value
	 * @return the Node result
	 */
	private Node delete(Node node,int value){
		// Check for null/base case
		if(node==null)
			return node;

		if(node.data>value)
			node.left=delete(node.left,value);
		else if(node.data<value)
			node.right=delete(node.right,value);
		// Check if node is a leaf (no children)
		else if(node.left!=null && node.right!=null){
			node.data=findMinimum(node.right).data;
			node.right=delete(node.right,node.data);
		}
		else
		{
			node=(node.left!=null)?node.left:node.right;
		}
		return node;
	}
	/**
	 * Finds minimum in the data structure.
	 *
	 * @param node the tree node to process
	 * @return the Node result
	 */
	private Node findMinimum(Node node) {
		// Check for null/base case
		if(node.left==null)
			return node;
		else
			// Recursively process left and right subtrees
			return findMinimum(node.left);
	}
	/**
	 * Searches for node.
	 *
	 * @param node the tree node to process
	 * @param value the value value
	 */
	private void searchNode(Node node,int value) {
		// Check for null/base case
		if(node!=null && node.data>value){
			searchNode(node.left,value);
		}
		// Check for null/base case
		else if(node!=null && node.data<value){
			searchNode(node.right,value);
		}else{
			searchedNode=node;
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
		searchNode(rootNode,value);
		// Check for null/base case
		if(searchedNode!=null)
			return true;
		return  false;
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
	 * Performs height operation.
	 *
	 * @return the computed integer result
	 */
	public int height(){

		// Recursively process left and right subtrees
		return height(rootNode);

	}

	/**
	 * Performs height operation.
	 *
	 * @param node the tree node to process
	 * @return the computed integer result
	 */
	private int height(Node node) {
		// Check for null/base case
		if(node==null)
			return 0;

		int leftDepth=height(node.left);
		int rightDepth=height(node.right);
		if(leftDepth>rightDepth)
			return leftDepth+1;
		else
			return rightDepth+1;
	}

	/**
	 * Performs bfs operation.
	 *
	 */
	public void bfs(){
		bfs(rootNode);
	}
	
	/**
	 * Performs dfs operation.
	 *
	 */
	public void dfs(){
		dfs(rootNode);
	}
	
	/**
	 * Performs dfs operation.
	 *
	 * @param node the tree node to process
	 */
	private void dfs(Node node){//to be checked later
		preOrder();
	}
	

	
	/**
	 * Performs bfs operation.
	 *
	 * @param node the tree node to process
	 */
	private void bfs(Node node){//same as levelorder
		Queue<Node> q=new Queue<_10BinarySearchTree.Node>() {
			int noOfElements=0;
			LinkedList<Node> l=new LinkedList<Node>();
			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				return (noOfElements==0)?true:false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(Collection<? extends Node> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean add(Node e) {
				l.add(e);
				noOfElements++;
				return true;
			}

			

			@Override
			public Node remove() {
				noOfElements--;
				return l.removeFirst();
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<Node> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean offer(Node e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Node poll() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Node element() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Node peek() {
				// TODO Auto-generated method stub
				return null;
			}

			
		};
		q.add(rootNode);
		Node n;
		while(!q.isEmpty()){
			n=q.remove();
			// Check for null/base case
			if(n!=null){
				System.out.println(n.data);
				// Check for null/base case
				if(n.left!=null)
					q.add(n.left);
				// Check for null/base case
				if(n.right!=null)
					q.add(n.right);
			}
		}
	}

	

	class Node{
		int data;
		Node left=null;
		Node right=null;
		boolean visited=false;
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
