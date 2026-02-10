package yelpInterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

/**
 * Implementation of Array Merge Overlapping Intervals algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayMergeOverlappingIntervals {
	/**
	 * Inner class Interval for supporting operations.
	 */
	static class Interval{
		int start;
		int end;
		public Interval(int s,int e) {
			this.start=s;
			this.end=e;
		}
	}
	static Stack<Interval> stack=new Stack<>();
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param a[] the a[] parameter
	 */
	public static void main(String a[]){
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	/**
	 * Finds over lapping interval in the data structure.
	 *
	 * @param inputArray the array to process
	 */
	private static void findOverLappingInterval(Interval[] inputArray) {
		System.out.println(Arrays.toString(inputArray));
		Arrays.sort(inputArray,new Comparator<Interval>(){
			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start>o2.start?1:-1;
			}
		});
		stack=new Stack<>();
		stack.push(inputArray[0]);
		for (int i = 1; i < inputArray.length; i++) {
			Interval top=stack.peek();
			Interval interval=inputArray[i];
			if(interval.start>=top.start && interval.end<=top.end)
			{
				//do nothing
			}
			else if(interval.start>top.end){
				stack.push(interval);
			}
			else{
				Interval st=stack.pop();
				st.end=Math.max(st.end, interval.end);
				stack.push(st);
			}
		}
		while(!stack.isEmpty())
		{
			Interval interval=stack.pop();
			System.out.println(interval.start+"/"+interval.end);
		}
	}



}