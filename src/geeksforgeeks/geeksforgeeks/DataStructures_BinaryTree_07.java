package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;


/*
 * http://www.geeksforgeeks.org/level-order-tree-traversal/
 * Level Order Tree Traversal
 */;
/**
 * Implementation of Data Structures_ Binary Tree_07 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_07 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 _01DataStructures_BinaryTree_00 binaryTree1=new _01DataStructures_BinaryTree_00();
		 binaryTree1.insert(null,null,10);
		 binaryTree1.insert(10,"left",11);
		 binaryTree1.insert(10,"right",12);
		 binaryTree1.insert(11,"left",13);
		 binaryTree1.insert(11,"right",14);
		 binaryTree1.insert(12,"left",15);
		 binaryTree1.insert(12,"right",16);
		 binaryTree1.preOrder();
		 levelOrder(binaryTree1);
	 }

	/**
	 * Performs levelOrder operation.
	 *
	 * @param binaryTree1 the binaryTree1 parameter
	 */
	private static void levelOrder(_01DataStructures_BinaryTree_00 binaryTree1) {
		// TODO Auto-generated method stub
		levelOrder(binaryTree1.rootNode);
	}

	/**
	 * Performs levelOrder operation.
	 *
	 * @param node the tree node to process
	 */
	private static void levelOrder(Node node) {
		tempQueue queue=new tempQueue();
		while(node!=null){
			System.out.print(node.data+",");
			queue.add(node.left);
			queue.add(node.right);
			node=queue.poll();
		}
	}
	


 }
class tempQueue {
		Node headNode;
		Node exitNode;
		int noOfElements=0;
		/**
		 * Performs poll operation.
		 *
		 * @return the _01DataStructures_BinaryTree_00.Node result
		 */
		public _01DataStructures_BinaryTree_00.Node poll(){//Retrieves and removes the head of this queue, or returns null if this queue is empty.
			_01DataStructures_BinaryTree_00.Node returnData=null;
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
		 * @return the _01DataStructures_BinaryTree_00.Node result
		 */
		public _01DataStructures_BinaryTree_00.Node peek(){//Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
			// Check for null/base case
			if(headNode!=null)
				return headNode.data;
			return null;
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
		public void add(_01DataStructures_BinaryTree_00.Node value){
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
		 * @return the _01DataStructures_BinaryTree_00.Node result
		 */
		public _01DataStructures_BinaryTree_00.Node remove(){//Retrieves and removes the head of this queue. This method differs from poll only in that it throws an exception if this queue is empty.
			_01DataStructures_BinaryTree_00.Node returnData=null;
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
		public Boolean contains(_01DataStructures_BinaryTree_00.Node value){
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
				outputStringBuilder.append(pointerNode.data+"\n");
				pointerNode=pointerNode.next;
			}
			// Recursively process left and right subtrees
			return outputStringBuilder.toString();
		}




		class Node{
			_01DataStructures_BinaryTree_00.Node data;
			Node next;
			/**
			 * Retrieves data from the data structure.
			 *
			 * @return the _01DataStructures_BinaryTree_00.Node result
			 */
			public _01DataStructures_BinaryTree_00.Node getData() {
				return data;
			}
			/**
			 * Sets data in the data structure.
			 *
			 * @param data the data parameter
			 */
			public void setData(_01DataStructures_BinaryTree_00.Node data) {
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
	}
