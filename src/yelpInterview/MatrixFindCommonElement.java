package yelpInterview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Implementation of Matrix Find Common Element algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MatrixFindCommonElement {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		int mat[][]={ {1, 2, 3, 4, 5},
				{2, 4, 5, 8, 10},
				{3, 5, 7, 9, 11},
				{1, 3, 5, 7, 9},
		};
		System.out.println(findCommonElement(mat));
	}

	/**
	 * Finds common element in the data structure.
	 *
	 * @param mat the array to process
	 * @return the computed integer result
	 */
	private static int findCommonElement(int[][] mat) {
		HashMap<Integer, Integer> map=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < mat.length; i++) {
			HashSet<Integer> set=new HashSet<>();
			// Inner loop to check combinations
			for (int j = 0; j < mat[0].length; j++) {
				if(!set.contains(mat[i][j]))
				{	
					set.add(mat[i][j]);
					// Check for null/base case
					if(i==0)
					{
						map.put(mat[i][j], 1);
					}
					else{
						if(map.containsKey(mat[i][j]))
							map.put(mat[i][j], map.get(mat[i][j])+1);
					}
				}
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue()==mat.length)
				return entry.getKey();
		}
		return -1;
	}

}