package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-29/
 * http://www.geeksforgeeks.org/median-of-stream-of-integers-running-integers/
 * Find a median in running stream of numbers.
 */;
/**
 * Implementation of Amazon Interview_29_01 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_29_01 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 Scanner scanner=new Scanner(new InputStreamReader(System.in));
		 String line="";
		 ArrayList<Integer> inputList=new ArrayList<Integer>();
		 while(!(line=scanner.nextLine()).toLowerCase().contentEquals("exit"))
		 {
			 inputList.add(Integer.parseInt(line));
			 System.out.println(getMedian(inputList));
		 }
		 scanner.close();
	 }

	 /**
	  * Retrieves median from the data structure.
	  *
	  * @param inputList the inputList parameter
	  * @return the computed integer result
	  */
	 private static int getMedian(ArrayList<Integer> inputList) {
		 Object[] array=inputList.toArray();
		 Arrays.sort(array);
		 if(array.length%2!=0)
		 {
			 return (int)array[array.length/2];
		 }else
		 {
			 return ((int)array[(int)(array.length/2)]+(int)array[(int)(array.length/2)-1])/2;
		 }
	 }
 }