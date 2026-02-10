package hackerRank.CodeWhiz;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Maximum and Minimum
 * Link:https://www.hackerrank.com/contests/codewhiz-java-march-2016/challenges/maximum-and-minimum
 */
/**
 * Implementation of Java List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class JavaList {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		ArrayList<String> stringList=new ArrayList<>();
		for(int i=0;i<n;i++){
			stringList.add(in.nextInt()+"");
		}
		int noOfTestCases=in.nextInt();
		for (int i = 0; i <noOfTestCases; i++) {
			String query=in.next();
			if(query.contentEquals("Insert"))
			{
				int index=in.nextInt();
				int value=in.nextInt();
				stringList.add(index, value+"");
			}
			else{
				int index=in.nextInt();
				stringList.remove(index);
			}
		}
		for (int i = 0; i <stringList.size(); i++) {
			System.out.print(stringList.get(i)+" ");
		}

	}

}
