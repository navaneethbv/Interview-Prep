package yelpInterview;

import java.util.Arrays;

/**
 * Implementation of Array Min Max algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayMinMax {
	/**
	 * Inner class minMax for supporting operations.
	 */
	static class minMax{
		int min,max;
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){

	}

	/**
	 * Performs printMinMax operation.
	 *
	 * @param inputArray the array to process
	 * @return the minMax result
	 */
	private static minMax printMinMax(int[] inputArray) {
		if(inputArray.length==1)
		{
			minMax mm=new minMax();
			mm.min=inputArray[0];
			mm.max=inputArray[0];
			return mm;
		}
		else if(inputArray.length==2)
		{
			minMax mm=new minMax();
			if(inputArray[0]>inputArray[1])
			{
				mm.min=inputArray[1];
				mm.max=inputArray[0];
			}
			else{
				mm.min=inputArray[0];
				mm.max=inputArray[1];
			}
			return mm;
		}
		else{
			minMax mm1=printMinMax(Arrays.copyOf(inputArray, inputArray.length/2));
			minMax mm2=printMinMax(Arrays.copyOfRange(inputArray, inputArray.length/2,inputArray.length));

			minMax output=new minMax();
			if(mm1.min<mm2.min)
				output.min=mm1.min;
			else
				output.min=mm2.min;
			if(mm1.max>mm2.max)
				output.max=mm1.max;
			else
				output.max=mm2.max;
			return output;
		}
	}

}