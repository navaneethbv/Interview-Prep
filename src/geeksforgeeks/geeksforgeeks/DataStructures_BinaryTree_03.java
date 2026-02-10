package geeksforgeeks;

/*
 * http://www.geeksforgeeks.org/write-a-c-program-to-find-the-maximum-depth-or-height-of-a-tree/
 * Write a C Program to Find the Maximum Depth or Height of a Tree
 */;
/**
 * Implementation of Data Structures_ Binary Tree_03 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_03 {
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
		 binaryTree1.insert(16,"right",17);		
		 binaryTree1.insert(17,"right",18);
		 binaryTree1.preOrder();
		 System.out.println(getMaxDepth(binaryTree1));
	 }

	 /**
	  * Retrieves max depth from the data structure.
	  *
	  * @param binaryTree1 the binaryTree1 parameter
	  * @return the computed integer result
	  */
	 private static int getMaxDepth(_01DataStructures_BinaryTree_00 binaryTree1) {
		 // Check for null/base case
		 if(binaryTree1.size()==0)
			 return 0;
		 else
			 // Recursively process left and right subtrees
			 return getMaxDepth(binaryTree1.rootNode);
	 }

	 /**
	  * Retrieves max depth from the data structure.
	  *
	  * @param node the tree node to process
	  * @return the Integer result
	  */
	 private static Integer getMaxDepth(_01DataStructures_BinaryTree_00.Node node) {
		 // Check for null/base case
		 if(node==null)
		 {
			 return 0;
		 }
		 else{
			 int left=getMaxDepth(node.left);
			 int right=getMaxDepth(node.right);
			 return (left>right)?left+1:right+1;
		 }
	 }

 }
 class BinaryTree3{
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
		 int data;
		 Node left,right;
		 public Node(int data,Node left,Node right) {
			 this.data=data;
			 this.left=left;
			 this.right=right;
		 }
	 }
 }
