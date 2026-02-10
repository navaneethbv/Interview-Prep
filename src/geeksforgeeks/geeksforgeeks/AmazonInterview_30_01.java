package geeksforgeeks;

import ctci._02linkedList;
import ctci._02linkedList.Node;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-30/
 * Given a string in the form of a Linked List,
 * check whether the string is palindrome or not. Dont use extra memory. 
 */;
/**
 * Implementation of Amazon Interview_30_01 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_30_01 {
	 static Node headNode;
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 _02linkedList linkedList=new _02linkedList();
		 linkedList.add(1);
		 linkedList.add(2);
		 linkedList.add(3);
		 linkedList.add(4);
		 linkedList.add(3);
		 linkedList.add(2);
		 linkedList.add(1);
		 System.out.println(checkForPalindrome(linkedList));
		 linkedList=new _02linkedList();
		 linkedList.add(1);
		 linkedList.add(2);
		 linkedList.add(3);
		 linkedList.add(4);
		 linkedList.add(5);
		 linkedList.add(2);
		 linkedList.add(1);
		 System.out.println(checkForPalindrome(linkedList));
	 }

	 /**
	  * Performs checkForPalindrome operation.
	  *
	  * @param linkedList the linkedList parameter
	  * @return true if condition is met, false otherwise
	  */
	 private static boolean checkForPalindrome(_02linkedList linkedList) {
		 headNode=linkedList.getHeadNode();
		 return IsPalindrome(headNode);
	 }

	 /**
	  * Checks if palindrome.
	  *
	  * @param headerNode the headerNode parameter
	  * @return true if condition is met, false otherwise
	  */
	 private static boolean IsPalindrome(Node headerNode) {
		 boolean check=false;
		 // Check for null/base case
		 if(headerNode!=null){
			 check=IsPalindrome(headerNode.next);
		 }else{
			 return true;
		 }
		 if(check){
			 if(headerNode.data==headNode.data){
				 headNode=headNode.next;
				 return true;
			 }
			 else{
				 return false;
			 }
		 }
		 return check;
	 }
 }