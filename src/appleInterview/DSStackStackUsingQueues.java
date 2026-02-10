package appleInterview;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implementation of DS Stack Stack Using Queues algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DSStackStackUsingQueues {
	static Queue<Integer> q1=new LinkedList<>();
	static Queue<Integer> q2=new LinkedList<>();
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		q1=new LinkedList<>();
		q2=new LinkedList<>();
		addtoStack(10);
		addtoStack(20);
		addtoStack(30);
		System.out.println(removefromStack());
		addtoStack(50);
		addtoStack(60);
		System.out.println(removefromStack());
	}
	/**
	 * Adds stack to the data structure.
	 *
	 * @param element the element parameter
	 */
	static void addtoStack(int element){
		q1.add(element);
	}
	/**
	 * Removes stack from the data structure.
	 *
	 * @return the computed integer result
	 */
	static int removefromStack(){
		while(q1.size()>1)
		{
			q2.add(q1.remove());
		}
		while(q2.size()>0)
		{
			q1.add(q2.remove());
		}
		return 	q1.remove();
	}
}
