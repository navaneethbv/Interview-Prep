package geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-4-2/
 * Given life time of different elephants find period when maximum number of elephants lived.
 * ex [5, 10], [6, 15], [2, 7] etc. year in which max no elephants exists.
 */
/**
 * Implementation of Amazon Interview_05_05 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AmazonInterview_05_05 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		String strInput1="(3,10),(5,8),(6,9),(10,20),(15,18),(16,18),(16,17)";
		String strInput2="(5, 10),(6, 15),(2, 7)";
		String inputArray1[]=strInput1.split("\\),\\(");
		String inputArray2[]=strInput2.split("\\),\\(");
		System.out.println(Arrays.toString(inputArray1));
		System.out.println("Big method : "+getValueRangeBig(inputArray1));
		System.out.println("Big method : "+getValueRangeBig(inputArray2));
		System.out.println("Small method : "+getValueRangeSmall(inputArray1));
		System.out.println("Small method : "+getValueRangeSmall(inputArray2));
	}

	/**
	 * Retrieves value range small from the data structure.
	 *
	 * @param inputArray1 the array to process
	 * @return the resulting string
	 */
	private static String getValueRangeSmall(String[] inputArray1) {
		int[] minElementsArray=new int[inputArray1.length];
		int[] maxElementsArray=new int[inputArray1.length];
		
		// Iterate through all elements
		for (int i = 0; i < inputArray1.length; i++) {
			String elementString;
			// Check for null/base case
			if(i==0)
				elementString=inputArray1[i].replace("(","");
			else if(i==inputArray1.length-1)
			{
				elementString=inputArray1[i].replace(")","");
			}
			else{
				elementString=inputArray1[i];
			}
			String[] elementStringArray=elementString.split(",");
			minElementsArray[i]=Integer.parseInt(elementStringArray[0]);
			maxElementsArray[i]=Integer.parseInt(elementStringArray[1].trim());
		}
		Arrays.sort(minElementsArray);
		Arrays.sort(maxElementsArray);
		int minElement=minElementsArray[minElementsArray.length-1],maxElement=0;
		// Iterate through all elements
		for (int i = 0; i < maxElementsArray.length; i++) {
			if(maxElementsArray[i]>minElement){
				maxElement=maxElementsArray[i];
				break;
			}
		}
		
		return "Min:"+minElement+" Max:"+maxElement;
	}

	/**
	 * Retrieves value range big from the data structure.
	 *
	 * @param inputArray1 the array to process
	 * @return the resulting string
	 */
	private static String getValueRangeBig(String[] inputArray1) {
		HashMap<Integer, Integer> elementMap= new HashMap<Integer, Integer>();
		ArrayList<Integer> valuesList=new ArrayList<Integer>();
		// Iterate through all elements
		for (int i = 0; i < inputArray1.length; i++) {
			String elementString;
			// Check for null/base case
			if(i==0)
				elementString=inputArray1[i].replace("(","");
			else if(i==inputArray1.length-1)
			{
				elementString=inputArray1[i].replace(")","");
			}
			else{
				elementString=inputArray1[i];
			}
			String[] elementStringArray=elementString.split(",");

			for (int j = Integer.parseInt(elementStringArray[0]); j <= Integer.parseInt(elementStringArray[1].trim()); j++) {
				if(!valuesList.contains(j)){
					valuesList.add(j);
					elementMap.put(j,1);
				}
				else{
					elementMap.put(j, elementMap.get(j)+1);
				}
			}

		}

		Object[] newListArray=valuesList.toArray();
		Arrays.sort(newListArray);
		int maxMinValue=0,minElement=0,index=0,maxElement=0;
		// Inner loop to check combinations
		for (int j = 0; j < newListArray.length; j++) {
			if(elementMap.get(newListArray[j])>maxMinValue){
				maxMinValue=elementMap.get(newListArray[j]);
				minElement=(int) newListArray[j];
				index=j;
			}
		}
		for (int j = index; j < newListArray.length; j++) {
			if(elementMap.get(newListArray[j])<elementMap.get(minElement)){
				maxElement=(int) newListArray[j-1];
				break;
			}
		}
		
		return "Min:"+minElement+" Max:"+maxElement;

	}
}