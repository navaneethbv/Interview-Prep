package careerCup;

/*
 * Link: http://www.careercup.com/question?id=198698
 * Given 2 sorted array print their intersection.
 */
/**
 * Implementation of Google Career Cup Problem8698 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GoogleCareerCupProblem8698 {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds intersection in the data structure.
	 *
	 * @param inputArray1 the array to process
	 * @param inputArray2 the array to process
	 * @return the computed integer result
	 */
	private static int findIntersection(int[] inputArray1, int[] inputArray2) {
		int size1=inputArray1.length;
		int size2=inputArray2.length;
		int diff=Math.abs(size1-size2);
		if(size1<size2)
		{	
			int temp[]=inputArray2;
			inputArray2=inputArray1;
			inputArray1=temp;
		}
		int count=0;
		for (int i = diff; i < inputArray1.length; i++) {
			if(inputArray1[i]==inputArray2[count])
				return i;
			count++;
		}
		return -1;
	}
	

}
