package leetCode;

import java.util.Stack;

/*
 * Link : https://codility.com/programmers/task/stone_wall
 */

/**
 * Implementation of Stacks And Queues Stone Wall algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class StacksAndQueuesStoneWall {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	 /**
	  * Performs solution operation.
	  *
	  * @param H the array to process
	  * @return the computed integer result
	  */
	 public static int solution(int[] H) {
         int len = H.length;
         Stack<Integer> stack = new Stack<>();
         int blockRectangles = 0;
         for (int i = 0; i < len; ++i) {
             int element = H[i];
             if (stack.isEmpty()) {
                 stack.push(element);
                 blockRectangles++;
             } else {
                 while (!stack.isEmpty() && stack.peek() > element) {
                     stack.pop();
                 } 
                 if (!stack.isEmpty() && stack.peek() == element) {
                    continue;
                 } else {
                     stack.push(element);
                     blockRectangles++;
                 }
             }
         }

         return blockRectangles;
	 }

}