package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/*
 * http://www.geeksforgeeks.org/amazon-interview-2/
 * Median of two sorted arrays.
 * 
 */;
/**
 * Implementation of Amazon Interview_07_05 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_07_05 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 Scanner scanner=new Scanner(new InputStreamReader(System.in));
		 int size=Integer.parseInt(scanner.nextLine());
		 scanner.close();
		 int inputArray1[]=new int[size];
		 int inputArray2[]=new int[size];

		 for (int i = 0; i < size; i++) {
			 inputArray1[i]=new Random().nextInt(3*size);
			 inputArray2[i]=new Random().nextInt(3*size);
		 }
		 Arrays.sort(inputArray1);
		 Arrays.sort(inputArray2);
		 for (int i = 0; i < size; i++) {
			 System.out.print(inputArray1[i]+",");
		 }
		 System.out.println();
		 for (int i = 0; i < size; i++) {
			 System.out.print(inputArray2[i]+",");
		 }
		 System.out.println();		 
		 int median=findMedian(inputArray1,inputArray2);
		 System.out.println("Median is : "+median);
	 }

	 /**
	  * Finds median in the data structure.
	  *
	  * @param inputArray1 the array to process
	  * @param inputArray2 the array to process
	  * @return the computed integer result
	  */
	 private static int findMedian(int[] inputArray1, int[] inputArray2) {
		 int median1=inputArray1[inputArray1.length/2];
		 int median2=inputArray2[inputArray2.length/2];
		 if(inputArray1.length==2 && inputArray2.length==2){
			 return (Math.max(inputArray1[0],inputArray2[0])+Math.min(inputArray1[1],inputArray2[1]))/2;
		 }
		 if(median1==median2)
		 {
			 return median1;
		 }
		 else if(median1>median2){
			 // Recursively process left and right subtrees
			 return findMedian(Arrays.copyOfRange(inputArray1, 0, (inputArray1.length/2)+1),Arrays.copyOfRange(inputArray2, inputArray2.length/2,inputArray2.length));
		 }else{
			 // Recursively process left and right subtrees
			 return findMedian(Arrays.copyOfRange(inputArray1, inputArray2.length/2,inputArray2.length),Arrays.copyOfRange(inputArray2,0,(inputArray2.length/2)+1));
		 }
	 }
 }