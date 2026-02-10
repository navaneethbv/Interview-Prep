package careerCup;

import java.util.Arrays;

/*
 * Link: http://www.careercup.com/question?id=66873
 * Given a set of points (x,y) on a 2D coord system, identify list of 2D coords that are of distance less than x units long.
 * Let x = 1; 
 * Given (0,0), (0,1), (1, 2), (4,6);
 * Return 1 -> (0,0), (0,1)
 */
/**
 * Implementation of Google Career Cup Problem6873 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GoogleCareerCupProblem6873 {

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Finds distance in the data structure.
	 *
	 * @param distance the distance parameter
	 * @return the computed integer result
	 */
	private static int findDistance(int distance) {
		String points[]=new String[]{"(0,0)","(0,1)","(1,2)","(4,6)"};
		Arrays.sort(points);
		int count=0;
		// Iterate through all elements
		for (int i = 0; i < points.length; i++) {
			String element[]=points[i].replace("(","").replace(")","").split(",");
			int x1=Integer.parseInt(element[0]),y1=Integer.parseInt(element[1]);
			System.out.println(Arrays.toString(element));
			for (int j = i+1; j < points.length; j++) {
					String elementNew[]=points[j].replace("(","").replace(")","").split(",");
					int x2=Integer.parseInt(element[0]),y2=Integer.parseInt(element[1]);
					double pointDistance=Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
					if(pointDistance<distance)
						count++;
			}
		}
		return count;
	}
	

}
