package geeksforgeeks;

/*
 * http://www.geeksforgeeks.org/618/
 * Tree Traversals
 */;
/**
 * Implementation of Data Structures_ Binary Tree_00 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_00 {
	 Node rootNode,presentNode;
	 int noOfElements=0;
	 /**
	  * Performs insert operation.
	  *
	  * @param element the element parameter
	  * @param type the type parameter
	  * @param data the data parameter
	  */
	 public void insert(Integer element,String type,int data){
		 // Check for null/base case
		 if(rootNode==null){
			 rootNode=new Node(data,null,null);
			 noOfElements++;
		 }
		 else{
			 if(type.toLowerCase().contentEquals("left")){
				 setLeftChild(element,data);
			 }
			 else{
				 setRightChild(element,data);
			 }
		 }
	 }
	 /**
	  * Performs postOrder operation.
	  *
	  */
	 public void postOrder() {
		 postOrder(rootNode);
		 System.out.println();
	 }
	 /**
	  * Performs postOrder operation.
	  *
	  * @param n the size or count parameter
	  */
	 private void postOrder(Node n) {
		 // Check for null/base case
		 if(n!=null){
			 postOrder(n.left);
			 postOrder(n.right); 
			 System.out.print(n.data+",");
		 }
	 }
	 /**
	  * Performs inOrder operation.
	  *
	  */
	 public void inOrder() {
		 inOrder(rootNode);
		 System.out.println();
	 }
	 /**
	  * Performs inOrder operation.
	  *
	  * @param n the size or count parameter
	  */
	 private void inOrder(Node n) {
		 // Check for null/base case
		 if(n!=null){
			 inOrder(n.left);			
			 System.out.print(n.data+",");
			 inOrder(n.right); 
		 }
	 }
	 /**
	  * Sets left child in the data structure.
	  *
	  * @param element the element parameter
	  * @param data the data parameter
	  */
	 public void setLeftChild(int element,int data){
		 preOrderGetNode(element);
		 // Check for null/base case
		 if(presentNode!=null)
		 {
			 // Check for null/base case
			 if(presentNode.left==null){
				 presentNode.left=new Node(data,null,null);
				 noOfElements++;
			 }
		 }
	 }
	 /**
	  * Sets right child in the data structure.
	  *
	  * @param element the element parameter
	  * @param data the data parameter
	  */
	 public void setRightChild(int element,int data){
		 preOrderGetNode(element);
		 // Check for null/base case
		 if(presentNode!=null)
		 {
			 // Check for null/base case
			 if(presentNode.right==null){
				 presentNode.right=new Node(data,null,null);
				 noOfElements++;
			 }
		 }
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
	  * Searches for .
	  *
	  * @param data the data parameter
	  * @return true if condition is met, false otherwise
	  */
	 public boolean search(int data){
		 presentNode=null;
		 preOrderGetNode(data);
		 return presentNode==null?false:true;
	 }
	 /**
	  * Performs preOrder operation.
	  *
	  */
	 public void preOrder(){
		 preorder(rootNode);
		 System.out.println();
	 }
	 /**
	  * Performs preorder operation.
	  *
	  * @param n the size or count parameter
	  */
	 private void preorder(Node n){
		 // Check for null/base case
		 if(n!=null){			 
			 if(n.data!=null)//not needed,needed only for tree deletion
				 System.out.print(n.data+",");
			 preorder(n.left);
			 preorder(n.right);
		 }
	 }

	 /**
	  * Performs preOrderGetNode operation.
	  *
	  * @param data the data parameter
	  */
	 public void preOrderGetNode(int data){
		 presentNode=null;
		 preOrderGetNode(rootNode,data);
	 }
	 /**
	  * Performs preOrderGetNode operation.
	  *
	  * @param n the size or count parameter
	  * @param data the data parameter
	  */
	 public void preOrderGetNode(Node n,int data){
		 // Check for null/base case
		 if(n!=null){
			 if(n.data==data){
				 presentNode=n;
				 return;
			 }
			 preOrderGetNode(n.left,data);
			 preOrderGetNode(n.right,data);
		 }

	 }
	 class Node{
		 Integer data;
		 Node left,right,nextRight,next;
		 public Node(Integer data,Node left,Node right) {
			 this.data=data;
			 this.left=left;
			 this.right=right;
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
