package geeksforgeeks;

import ctci._05queue;

/*
 * http://www.geeksforgeeks.org/implement-stack-using-queue/
 * Implement Stack using Queues
 */;
/**
 * Implementation of Data Structures_ Stack_06 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_Stack_06 {	 
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
         
		 MyStack myStack=new MyStack();
		 myStack.push(10);
		 myStack.push(20);
		 myStack.push(30);
		 myStack.push(40);
		 myStack.push(50);
		 System.out.println(myStack.pop());
		 myStack.push(60);
		 myStack.push(70);
		 System.out.println(myStack.pop());

	 }

 }
 class MyStack{
	 _05queue queue1=new _05queue();
	 _05queue queue2=new _05queue();

	 /**
	  * Performs push operation.
	  *
	  * @param value the value value
	  */
	 public void push(int value){
		 queue1.add(value);
	 }
	 /**
	  * Performs pop operation.
	  *
	  * @return the computed integer result
	  */
	 public int pop(){
		 if(queue1.isEmpty())
			 return Integer.MIN_VALUE;
		 while(queue1.size()!=1){
			 queue2.add(queue1.remove());
		 }
		 int value=queue1.remove();
		 queue1=queue2;
		 queue2=new _05queue();
		 return value;
	 }
 }
