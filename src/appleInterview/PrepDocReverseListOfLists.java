package appleInterview;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Implementation of Prep Doc Reverse List Of Lists algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrepDocReverseListOfLists {
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
		reverseLists(listOfLists);
	}
	/**
	 * Performs reverseLists operation.
	 *
	 * @param listOfLists the listOfLists parameter
	 * @return the list of results
	 */
	private static LinkedList<LinkedList<Integer>> reverseLists(LinkedList<LinkedList<Integer>> listOfLists) {
		Stack<LinkedList<Integer>> listStack=new Stack<>();
		for (int i = 0; i < listOfLists.size(); i++) {
			listStack.push(listOfLists.get(i));
		}
		listOfLists=new LinkedList<>();
		while(!listStack.isEmpty()){
			listOfLists.add(listStack.pop());
		}
		return listOfLists;
	}
}
