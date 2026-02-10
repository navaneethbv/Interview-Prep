package careerCup;

/*
 * Link: http://www.careercup.com/question?id=231679
 * What is the best efficient algorithm to find intersection point of two lines.
 * You are given four points A, B , C , d. 
 * Find the intersection point between AB and CD.
 * Optimize the algorithm as much as you can.
 * Reference:http://mathworld.wolfram.com/Line-LineIntersection.html 
 */
/**
 * Implementation of Google Career Cup Problem1679 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class GoogleCareerCupProblem1679 {
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
	 * @param a the a parameter
	 * @param b the b parameter
	 * @param c the c parameter
	 * @param d the d parameter
	 * @return the resulting string
	 */
	private static String findIntersection(String a, String b, String c, String d) {
		String firstPoint[]=a.replace("(","").replace(")","").split(",");
		int x1=Integer.parseInt(firstPoint[0]),y1=Integer.parseInt(firstPoint[1]);
		String secondPoint[]=b.replace("(","").replace(")","").split(",");
		int x2=Integer.parseInt(secondPoint[0]),y2=Integer.parseInt(secondPoint[1]);
		String thirdPoint[]=a.replace("(","").replace(")","").split(",");
		int x3=Integer.parseInt(thirdPoint[0]),y3=Integer.parseInt(thirdPoint[1]);
		String fourthPoint[]=a.replace("(","").replace(")","").split(",");
		int x4=Integer.parseInt(fourthPoint[0]),y4=Integer.parseInt(fourthPoint[1]);
		int xNumerator=(((x1*y2)-(x2*y1))*(x3-x4))-(((x3*y4)-(x4*y3))*(x1-x2));
		int xDenominator=((x1-x2)*(y3-y4))-((x3-x4)*(y1-y2));
		int yNumerator=(((x1*y2)-(x2*y1))*(y3-y4))-(((x3*y4)-(x4*y3))*(y1-y2));
		int yDenominator=((x1-x2)*(y3-y4))-((x3-x4)*(y1-y2));
		// Check for null/base case
		if(xDenominator==0 || yDenominator==0)
			return "No Intersection Point";
		return "("+xNumerator/xDenominator+","+yNumerator/yDenominator+")";
	}
}
