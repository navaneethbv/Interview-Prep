package TopCoder;

import java.util.HashMap;

/*
 * SRM 186 Div2
 * Link:
 */



/**
 * Implementation of SRM686 Tree And Vertex algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM686TreeAndVertex {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println(get(new int[]{0,0,0}));
		System.out.println(get(new int[]{0, 1, 2, 3}));
		System.out.println(get(new int[]{0, 0, 2, 2}));
		System.out.println(get(new int[]{0, 0, 0, 1, 1, 1}));
		System.out.println(get(new int[]{0, 1, 2, 0, 1, 5, 6, 1, 7, 4, 2, 5, 5, 8, 6, 2, 14, 12, 18, 10, 0, 6, 18, 2, 20, 11, 0, 11, 7, 12, 17, 3, 18, 31, 14, 34, 30, 11, 9}));
		
		
	}
	/**
	 * Retrieves  from the data structure.
	 *
	 * @param tree the array to process
	 * @return the computed integer result
	 */
	public static int get(int[] tree){
		int count=0;
		HashMap<Integer, Integer> counter=new HashMap<>();
		// Iterate through all elements
		for (int i = 0; i < tree.length; i++) {
			if(counter.containsKey(i+1))
			{
				counter.put(i+1, counter.get(i+1)+1);
			}
			else{
				counter.put(i+1,1);
			}

			if(counter.containsKey(tree[i]))
			{
				counter.put(tree[i], counter.get(tree[i])+1);
			}
			else{
				counter.put(tree[i],1);
			}
		}
		Object arr[]=counter.keySet().toArray();
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			count=Math.max(count, counter.get(arr[i]));
		}
		return count;
	}
}
