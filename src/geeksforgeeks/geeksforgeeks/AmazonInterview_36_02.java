package geeksforgeeks;

import java.util.HashMap;


/*
 * http://www.geeksforgeeks.org/amazon-interview-set-36/
 * check the validity of sudoku.
 */;
/**
 * Implementation of Amazon Interview_36_02 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_36_02 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 int inputArray[][]={
				 {5,3,4,6,7,8,9,1,2},
				 {6,7,2,1,9,5,3,4,8},
				 {1,9,8,3,4,2,5,6,7},
				 {8,5,9,7,6,1,4,2,3},
				 {4,2,6,8,5,3,7,9,1},
				 {7,1,3,9,2,4,8,5,6},
				 {9,6,1,5,3,7,2,8,4},
				 {2,8,7,4,1,9,6,3,5},
				 {3,4,5,2,8,6,1,7,9}
		 };

		 System.out.println(checkSudoku(inputArray));
	 }

	 /**
	  * Performs checkSudoku operation.
	  *
	  * @param inputArray the array to process
	  * @return true if condition is met, false otherwise
	  */
	 private static boolean checkSudoku(int[][] inputArray) {
		 HashMap<Integer,Integer> sumMap=new HashMap<Integer,Integer>(); 
		 // Iterate through all elements
		 for (int i = 0; i < inputArray.length; i++) {
			 HashMap<Integer,Integer> elementsMap=new HashMap<Integer,Integer>();
			 // Inner loop to check combinations
			 for (int j = 0; j < inputArray[0].length; j++) {
				 int element=inputArray[i][j];
				 if(element!=0)
				 {
					 if(!elementsMap.containsKey(element)){
						 elementsMap.put(element,element);
					 }
					 else{
						 return false;
					 }
					 if(!sumMap.containsKey(j)){
						 sumMap.put(j,element);
					 }
					 else{
						 sumMap.put(j,sumMap.get(j)+element);
					 }
				 }
				 else{
					 return false;
				 }
			 }
		 }
		 // Iterate through all elements
		 for (int i = 0; i < inputArray.length; i++) {
			 if(sumMap.get(i)!=45)
				 return false;
		 }
		 // Iterate through all elements
		 for (int i = 0; i < inputArray.length; i++) {
			 HashMap<Integer,Integer> elementsMap=new HashMap<Integer,Integer>();
			 // Inner loop to check combinations
			 for (int j = 0; j < inputArray[0].length; j++) {
				 int element=inputArray[j][i];
				 if(element!=0)
				 {
					 if(!elementsMap.containsKey(element)){
						 elementsMap.put(element,element);
					 }
					 else{
						 return false;
					 }
				 }
				 else{
					 return false;
				 }
			 }
		 }
		 return true;
	 }
 }