package LeetCodePerformancePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Implementation of Lexicographical Numbers algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LexicographicalNumbers {
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
	 * Performs lexicalOrder operation.
	 *
	 * @param n the size or count parameter
	 * @return the list of results
	 */
	public static List<Integer> lexicalOrder(int n) {
		List<Integer> outputList=new ArrayList<>();
		for (int i = 1; i <=n; i++) {
			outputList.add(i);
		}
		Collections.sort(outputList,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return (o1+"").compareTo(o2+"");
			}
		});
		return outputList;
	}
}
