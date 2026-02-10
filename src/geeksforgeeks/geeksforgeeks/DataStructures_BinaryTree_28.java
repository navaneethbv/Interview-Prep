package geeksforgeeks;

import geeksforgeeks._01DataStructures_BinaryTree_00.Node;
import ctci._05queue;



/*
 * http://www.geeksforgeeks.org/connect-nodes-at-same-level/
 * Connect nodes at same level
 */;
/**
 * Implementation of Data Structures_ Binary Tree_28 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_28 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 _01DataStructures_BinaryTree_00 binaryTree1=new _01DataStructures_BinaryTree_00();
		 binaryTree1.insert(null,null,1);
		 binaryTree1.insert(1,"left",2);
		 binaryTree1.insert(1,"right",3);
		 binaryTree1.insert(2,"left",4);
		 binaryTree1.insert(2,"right",5);
		 binaryTree1.insert(3,"right",6);
		 binaryTree1.preOrder();
		 connectNodes(binaryTree1);
		 printConnections(binaryTree1);
	 }

	 private static void printConnections(
			 _01DataStructures_BinaryTree_00 binaryTree1) {
		 printConnections(binaryTree1.rootNode);
	 }

	 private static void printConnections(
			 geeksforgeeks._01DataStructures_BinaryTree_00.Node node) {
		 if(node!=null)
		 {	
			 System.out.print(node.data+",");
			 Node mainNode=node;
			 while(mainNode.nextRight!=null){
				 System.out.print(mainNode.nextRight.data+",");
				 mainNode=mainNode.nextRight;
			 }
			 if(node.left!=null)
				 printConnections(node.left);
			 else if(node.right!=null)
				 printConnections(node.right);
		 }

	 }

	 /**
	  * Performs connectNodes operation.
	  *
	  * @param binaryTree1 the binaryTree1 parameter
	  */
	 private static void connectNodes(_01DataStructures_BinaryTree_00 binaryTree1) {
		 leveOrderTraversal(binaryTree1.rootNode);
		 System.out.println();
	 }

	 /**
	  * Performs leveOrderTraversal operation.
	  *
	  * @param node the tree node to process
	  */
	 private static void leveOrderTraversal(Node node) {
		 // Check for null/base case
		 if(node!=null){
			 tempQueue1 queue=new tempQueue1();
			 _05queue levelsQueue=new _05queue();
			 Node n=node;
			 int mainlevel=1,level=1;
			 while(n!=null){
				 System.out.print(n.data+"/"+level+",");
				 // Check for null/base case
				 if(n.left!=null){
					 queue.add(n.left);
					 levelsQueue.add(getLevel(node,n.left));
				 }
				 // Check for null/base case
				 if(n.right!=null){
					 queue.add(n.right);
					 levelsQueue.add(getLevel(node,n.right));
				 }

				 level=levelsQueue.poll();
				 Node temp=n;
				 n=queue.poll();
				 if(level==mainlevel)
					 temp.nextRight=n;
				 else
					 mainlevel=level;
			 }
		 }

	 }

	 private static int getLevel(
			 geeksforgeeks._01DataStructures_BinaryTree_00.Node node,
			 geeksforgeeks._01DataStructures_BinaryTree_00.Node left) {

		 return getLevel(node,left.data,1);
	 }

	 private static int getLevel(
			 geeksforgeeks._01DataStructures_BinaryTree_00.Node node,
			 Integer data, int level) {
		 if(node==null)
			 return 0;
		 if(node.data==data)
			 return level;
		 int downLevel=getLevel(node.left,data,level+1);
		 if(downLevel!=0)
			 return downLevel;
		 downLevel=getLevel(node.right,data,level+1);
		 return downLevel;

	 }


 }
 class tempQueue1 {
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
		 Integer level=0;
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
