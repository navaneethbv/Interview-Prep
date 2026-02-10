package LeetCodePerformancePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Implementation of Top Frequent K Items algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class TopFrequentKItems {
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
	 * Inner class Pair for supporting operations.
	 */
	static class Pair{
		int value,count=0;
		public Pair(int value,int count) {
			this.value=value;
			this.count=count;
		}
	}
	/**
	 * Performs topKFrequent operation.
	 *
	 * @param nums the array to process
	 * @param k the k value
	 * @return the list of results
	 */
	public List<Integer> topKFrequent(int[] nums, int k) {
		List<Integer> outputList=new ArrayList<>();
		HashMap<Integer, Integer> map=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i]))
			{
				map.put(nums[i], map.get(nums[i])+1);
			}
			else
			{
				map.put(nums[i], 1);
			}
		}
		PriorityQueue<Pair> queue=new PriorityQueue<>(new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				return o1.count-o2.count;
			}
		});

		for(Map.Entry<Integer, Integer> entry: map.entrySet()){
			int key=entry.getKey();
			int value=entry.getValue();
			Pair p=new Pair(key, value);
			queue.offer(p);
			if(queue.size()>k)
				queue.poll();
		}
		while(queue.size()>0)
			outputList.add(queue.poll().value);
		Collections.reverse(outputList);
		return outputList;

	}
}
