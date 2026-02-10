package TopCoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/*
 * SRM 164 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1757&rd=4625
 */



/**
 * Implementation of SRM164 Party Seats algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM164PartySeats {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.toString(seating(new String[]{"BOB boy","SAM girl","DAVE boy","JO girl"})));
		System.out.println(Arrays.toString(seating(new String[]{"JOHN boy"})));
		System.out.println(Arrays.toString(seating(new String[]{"JOHN boy","CARLA girl"})));
		System.out.println(Arrays.toString(seating(new String[]{"BOB boy","SUZIE girl","DAVE boy","JO girl",
				"AL boy","BOB boy","CARLA girl","DEBBIE girl"})));
		System.out.println(Arrays.toString(seating(new String[]{"AM girl", "ROB boy", "JIM boy", "AM girl", "DAVE boy", "JO girl"})));
	}

	/**
	 * Performs seating operation.
	 *
	 * @param attendees the array to process
	 * @return the resulting array
	 */
	public static String[] seating(String[] attendees){
		if(attendees.length%2!=0)
			return new String[]{};
		ArrayList<String> girls=new ArrayList<>();
		ArrayList<String> boys=new ArrayList<>();
		// Iterate through all elements
		for (int i = 0; i < attendees.length; i++) {
			if(attendees[i].contains("girl")){
				girls.add(attendees[i].split(" ")[0]);
			}
			else{
				boys.add(attendees[i].split(" ")[0]);
			}
		}
		Collections.sort(girls); 
		Collections.sort(boys); 
		Iterator<String> boysIter=boys.iterator();
		Iterator<String> girlsIter=girls.iterator();
		if(boys.size()!=girls.size())
			return new String[]{};
		ArrayList<String> outputList=new ArrayList<>();
		String next="M";
		// Iterate through all elements
		for (int i = 0; i < attendees.length+2; i++) {
			// Check for null/base case
			if(i==0 && next.equals("M"))
			{
				outputList.add("HOST");
				next="F";
			}
			else if(i==(attendees.length+2)/2 && next.equals("F"))
			{
				outputList.add("HOSTESS");
				next="M";
			}
			else{
				if(next.equals("M")){
					next="F";
					if(boysIter.hasNext())
						outputList.add(boysIter.next());
					else
						return new String[]{};
				}
				else{
					next="M";
					if(girlsIter.hasNext())
						outputList.add(girlsIter.next());
					else
						return new String[]{};
				}
			}
		}
		String str=(Arrays.toString(outputList.toArray(new String[]{})));
		return (str.replace("[", "").replace("]", "").split(", "));
	}
}
