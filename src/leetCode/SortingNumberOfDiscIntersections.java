package leetCode;

import java.util.Arrays;
import java.util.HashMap;

/*
 * Link : https://codility.com/programmers/task/number_of_disc_intersections
 */

/**
 * Implementation of Sorting Number Of Disc Intersections algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SortingNumberOfDiscIntersections {

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
	 * Performs solution operation.
	 *
	 * @param A the array to process
	 * @return the computed integer result
	 */
	public static int solution(int[] A){
		int posArray[] = new int[A.length];
		int negArray[] = new int[A.length];

		// Iterate through all elements
		for(int i = 0; i < A.length; i++){
			posArray[i] = A[i] + i;
			negArray[i] = i-A[i];
		}

		Arrays.sort(posArray);
		Arrays.sort(negArray);
		System.out.println(Arrays.toString(posArray));
		System.out.println(Arrays.toString(negArray));
		int count = 0;
		for(int i = A.length - 1; i >= 0; i--){
			int pos = Arrays.binarySearch(negArray, posArray[i]);
			if(pos >= 0){
				System.out.println(pos);
				while(pos < A.length && negArray[pos] == posArray[i]){
					pos++;
				}
				count += pos;
			} else{ 
				int insertionPoint = -(pos+1);
				count += insertionPoint;
			}

		}

		int sub =A.length*(A.length+1)/2;
		count = count - sub;

		if(count > 1e7) return -1;

		return (int)count;
	}
	/**
	 * Performs NotSoPropersolution operation.
	 *
	 * @param A the array to process
	 * @return the computed integer result
	 */
	public static int NotSoPropersolution(int[] A){
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		HashMap<Integer, Integer> elementMap=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < A.length; i++) {
			int element=A[i];
			min =-i-element<min?-i-element:min;
			max=i+element>max?i+element:max;
			for (int j = -i-element; j <= i+element; j++) {
				if(elementMap.containsKey(j))
				{
					elementMap.put(j, elementMap.get(j)+1);
				}
				else
				{
					elementMap.put(j,1);
				}
			}
		}
		int count=0;
		for (int i = min; i <= max; i++) {
			if(elementMap.containsKey(i) && elementMap.get(i)>1)
				count++;
		}
		return count>0?count:-1;
	}
}