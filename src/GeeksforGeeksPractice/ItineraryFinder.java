package GeeksforGeeksPractice;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Link : http://www.geeksforgeeks.org/find-itinerary-from-a-given-list-of-tickets/
 */
/**
 * Implementation of Itinerary Finder algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ItineraryFinder {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		ArrayList<String> inputList=new ArrayList<>();
		inputList.add("Chennai->Banglore");
		inputList.add("Bombay->Delhi");
		inputList.add("Goa->Chennai");
		inputList.add("Delhi->Goa");
		findItinerary(inputList);
	}

	/**
	 * Finds itinerary in the data structure.
	 *
	 * @param inputList the inputList parameter
	 */
	private static void findItinerary(ArrayList<String> inputList) {
		HashMap<String, String> inputMap=new HashMap<>();
		HashMap<String, String> reverseInputMap=new HashMap<>();
		
		for (int i = 0; i < inputList.size(); i++) {
			String str[]=inputList.get(i).split("->");
			inputMap.put(str[0], str[1]);
			reverseInputMap.put(str[1], str[0]);
		}
		
		Object[] keyArray=inputMap.keySet().toArray();
		String startingPoint = null;
		// Iterate through all elements
		for (int i = 0; i < keyArray.length; i++) {
			if(!reverseInputMap.containsKey(keyArray[i]))
			{
				startingPoint=(String) keyArray[i];
			}
		}
		StringBuilder sb=new StringBuilder();
		int count=0;
		while(count<inputList.size())
		{
			sb.append(startingPoint+"->");
			startingPoint=inputMap.get(startingPoint);
			count++;
		}
		sb.append(startingPoint);
		System.out.println(sb.toString());
	}



}
