package appleInterview;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Implementation of Prep Doc Iterator LL Of LL algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrepDocIteratorLLOfLL {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		LinkedList<LinkedList<Integer>> listOfLists=new LinkedList<>();
		for (int i = 0; i < 4; i++) {
			LinkedList<Integer> l=new LinkedList<>();
			l.add(i);
			l.add(i+1);
			listOfLists.add(l);
		}
		iterate(listOfLists);
		
		
	}

	/**
	 * Performs iterate operation.
	 *
	 * @param listOfLists the listOfLists parameter
	 */
	private static void iterate(LinkedList<LinkedList<Integer>> listOfLists) {
		Iterator<LinkedList<Integer>> parentIter=listOfLists.iterator();
		while(parentIter.hasNext())
		{
			Iterator<Integer> childIter=parentIter.next().iterator();
			while(childIter.hasNext())
			{
				System.out.print(childIter.next()+"/");
			}
			System.out.println();
		}
		
	}


}
