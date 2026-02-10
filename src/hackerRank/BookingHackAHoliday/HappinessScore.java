package hackerRank.BookingHackAHoliday;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * Link:https://www.hackerrank.com/contests/booking-hack-a-holiday/challenges/happiness-score
*/
/**
 * Implementation of Happiness Score algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class HappinessScore{

	/**
	 * Checks if prime.
	 *
	 * @param num the num parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean isPrime(int num) {
        if (num == 2 ) return true;
        // Check for null/base case
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            // Check for null/base case
            if (num % i == 0) return false;
        return true;
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		Set<Integer> s=new TreeSet<Integer>();

		for (int i = 0; i < N; i++) {
			s.add(scanner.nextInt());
		}
		Set<Set<Integer>> outputSet=powerSet(s);
		System.out.println(outputSet.size());
		System.out.println(outputSet);
		s=new TreeSet<Integer>();
		Iterator<Set<Integer>> iter=outputSet.iterator();
		while(iter.hasNext())
		{
			Iterator<Integer> it=iter.next().iterator();
			int sum=0;
			while(it.hasNext())
			{
				sum+=it.next();
			}
			if(isPrime(sum)&&sum!=1)
				s.add(sum);
		}
		System.out.println(s.size());
	}
	/**
	 * Performs powerSet operation.
	 *
	 * @param originalSet the originalSet parameter
	 * @return the Set<Set<Integer>> result
	 */
	public static Set<Set<Integer>> powerSet(Set<Integer> originalSet) {
		Set<Set<Integer>> sets = new HashSet<Set<Integer>>();
		if (originalSet.isEmpty()) {
			sets.add(new HashSet<Integer>());
			return sets;
		}
		List<Integer> list = new ArrayList<Integer>(originalSet);
		Integer head = list.get(0);
		Set<Integer> rest = new HashSet<Integer>(list.subList(1, list.size()));
		for (Set<Integer> set : powerSet(rest)) {
			Set<Integer> newSet = new HashSet<Integer>();
			newSet.add(head);
			newSet.addAll(set);
			sets.add(newSet);
			sets.add(set);
		}
		return sets;
	}
}