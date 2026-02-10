package LeetCodePerformancePractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of Gray Code algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GrayCode {
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
	 * Performs grayCode operation.
	 *
	 * @param n the size or count parameter
	 * @return the list of results
	 */
	public static List<Integer> grayCode(int n) {
		List<Integer> outputList=new ArrayList<>();
		List<String> stringList=new ArrayList<>();
		// Check for null/base case
		if(n==0){
			outputList.add(0);
			return outputList;
		}
		outputList.add(0);
		outputList.add(1);
		if(n==1)
			return outputList;
		stringList.add("0");
		stringList.add("1");
		for (int i = 2	; i <=n; i++) {
			List<String> stringListNew=new ArrayList<>();
			outputList=new ArrayList<>();
			// Inner loop to check combinations
			for (int j = 0; j < stringList.size(); j++) {
				// Check for null/base case
				if(j%2==0)
				{
					stringListNew.add(stringList.get(j)+"0");
					outputList.add(Integer.parseInt(stringList.get(j)+"0", 2));
					stringListNew.add(stringList.get(j)+"1");
					outputList.add(Integer.parseInt(stringList.get(j)+"1", 2));					
				}
				else{
					stringListNew.add(stringList.get(j)+"1");
					outputList.add(Integer.parseInt(stringList.get(j)+"1", 2));
					stringListNew.add(stringList.get(j)+"0");
					outputList.add(Integer.parseInt(stringList.get(j)+"0", 2));
				}
			}
			stringList=stringListNew;
		}
		return outputList;



	}

}
