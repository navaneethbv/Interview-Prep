package GeeksforGeeksPractice;

import java.util.Arrays;
import java.util.HashMap;

/*
 * Link : http://www.geeksforgeeks.org/print-unique-rows/
 */
/**
 * Implementation of Print Unique Rows algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrintUniqueRows {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		int mat[][] = {{0, 1, 0, 0, 1},
				{1, 0, 1, 1, 0},
				{0, 1, 0, 0, 1},
				{1, 0, 1, 0, 0}
		};

		findUniqueRows(mat);
	}

	/**
	 * Finds unique rows in the data structure.
	 *
	 * @param mat the array to process
	 */
	private static void findUniqueRows(int[][] mat) {
		HashMap<String, Integer> rowMap=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < mat.length; i++) {
			String str=Arrays.toString(mat[i]).replace(",","").replace("[","").replace("]","").replaceAll(" ","");
			if(rowMap.containsKey(str))
				rowMap.put(str, 2);
			else
				rowMap.put(str, 1);
		}
		Object[] str=rowMap.keySet().toArray();
		// Iterate through all elements
		for (int i = 0; i < str.length; i++) {
			if(rowMap.get(str[i])<2)
				System.out.println(str[i]);
		}
	}

}
