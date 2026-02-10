package TopCoder;

import java.util.HashMap;
import java.util.TreeSet;

/*
 * SRM 175 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=2244&rd=4680
 */

/**
 * Implementation of SRM175 Instant Runoff algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM175InstantRunoff {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println(outcome("ABC",new String[]{"ACB", "BCA", "ACB", "BCA", "CBA"}));
		System.out.println(outcome("DCBA",new String[]{"ACBD", "ACBD", "ACBD", "BCAD", "BCAD", "DBCA", "CBDA"}));
		System.out.println(outcome("ACB",new String[]{"ACB", "BCA", "ACB", "BCA", "ACB", "BCA", "CBA", "CAB"}));
		System.out.println(outcome("CAB",new String[]{"ACB", "BCA", "ACB", "BCA", "ACB", "BCA", "CAB", "CAB"}));
		System.out.println(outcome("Z",new String[]{"Z"}));
	}
	static HashMap<Character,Integer> voteCount=new HashMap<>();
	static TreeSet<Character> invalidUsers=new TreeSet<>();
	/**
	 * Performs outcome operation.
	 *
	 * @param candidates the candidates parameter
	 * @param ballots the array to process
	 * @return the resulting string
	 */
	public static String outcome(String candidates, String[] ballots){
		voteCount=new HashMap<>();
		invalidUsers=new TreeSet<>();
		// Iterate through all elements
		for (int i = 0; i < candidates.length(); i++) {
			for (int j = 0; j < ballots.length; j++) {
				char c=ballots[j].charAt(i);
				if(invalidUsers.contains(c))
				{
					continue;
				}
				else{
					if(voteCount.containsKey(c)){
						voteCount.put(c, voteCount.get(c)+1);
					}else{
						voteCount.put(c,1);
					}
				}
			}
			invalidUsers.add(findUserWithLeastWin());
		}
		return candidates;
	}
	/**
	 * Finds user with least win in the data structure.
	 *
	 * @return the Character result
	 */
	private static Character findUserWithLeastWin() {
		Object arr[]=voteCount.keySet().toArray();
		int count=Integer.MAX_VALUE;
		char output = 0;
		// Iterate through all elements
		for (int i = 0; i < arr.length; i++) {
			char c=(char) arr[i];
			if(!invalidUsers.contains(c)){
				if(count>voteCount.get(c))
				{
					count=voteCount.get(c);
					output=c;
				}
			}
		}
		return output;
	}
}
