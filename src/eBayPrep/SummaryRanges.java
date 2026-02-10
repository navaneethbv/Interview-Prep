package eBayPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Implementation of Summary Ranges algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SummaryRanges{
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs summaryRanges operation.
	 *
	 * @param arr the array to process
	 * @return the list of results
	 */
	private static List<String> summaryRanges(int[] arr) {
		List<String> list=new ArrayList<>();
		// Check for null/base case
		if(arr==null||arr.length==0)
			return list;
		int startValue=arr[0],endValue=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]==endValue+1)
			{
				endValue=arr[i];
			}
			else{
				if(startValue==endValue)
					list.add(startValue+"");
				else{
					list.add(startValue+"->"+endValue);
				}
				startValue=arr[i];
				endValue=arr[i];
			}
		}
		if(startValue==endValue)
			list.add(startValue+"");
		else{
			list.add(startValue+"->"+endValue);
		}
		return list;
	}

}

