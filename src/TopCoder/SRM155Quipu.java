package TopCoder;

/*
 * SRM 154 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1768&rd=4575
 */



/**
 * Implementation of SRM155 Quipu algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM155Quipu {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println(readKnots("-XX-XXXX-XXX-"));
		System.out.println(readKnots("-XX--XXXX---XXX-"));
		System.out.println(readKnots("-X-"));
		System.out.println(readKnots("-X-------"));
		System.out.println(readKnots("-XXXXXXXXX--XXXXXXXXX-XXXXXXXXX-XXXXXXX-XXXXXXXXX-"));
	}
	/**
	 * Performs readKnots operation.
	 *
	 * @param knots the knots parameter
	 * @return the computed integer result
	 */
	public static int readKnots(String knots){
		StringBuilder sb=new StringBuilder("");
		int knotCounter=0;
		int dashCounter=0;
		for (int i = 1; i < knots.length(); i++) {
			if(knots.charAt(i)=='X'){
				dashCounter=0;
				knotCounter++;
			}else{
				if(knotCounter!=0)
					sb.append(knotCounter+"");
				knotCounter=0;
				if(dashCounter>0)
					sb.append("0");
				dashCounter++;
			}
		}
		return Integer.parseInt(sb.toString());
	}
}
