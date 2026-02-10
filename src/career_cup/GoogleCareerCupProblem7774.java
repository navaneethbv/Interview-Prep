package careerCup;

import java.util.Random;

/*
 * Link: http://www.careercup.com/question?id=197774
 * Given a 3 number discrete random number generator {1,2,3} ,
 * how can you design a 5 number random generator.
 */
/**
 * Implementation of Google Career Cup Problem7774 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GoogleCareerCupProblem7774 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}
	/**
	 * Retrieves random from the data structure.
	 *
	 * @return the computed integer result
	 */
	private static int getRandom() {
		Random r=new Random();
		int value=0;
		int randomThree=(r.nextInt(4)+1);
		value=(randomThree+randomThree+randomThree+1)%5;
		return value;
	}
}
