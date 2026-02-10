package TopCoder;

/*
 * SRM 161 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1801&rd=4610
 */

/**
 * Implementation of SRM161 String Train algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM161StringTrain {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args)  {
		System.out.println(buildTrain(new String[]{"ABCDE","CDFFF","CDE","CDEGG","GABC"}));
		System.out.println(buildTrain(new String[]{"AAAAA","AAAAA","AAAAA"}));
		System.out.println(buildTrain(new String[]{"CABABDABAB","CABAB","ABABDABAB","DABAB"}));
		System.out.println(buildTrain(new String[]{"ABABAB","ABABAB","ABABABAB","BZZZZZ"}));
		System.out.println(buildTrain(new String[]{"A","A","A","AA"}));
		System.out.println(buildTrain(new String[]{"AA", "AAB"}));
		
	}
	/**
	 * Performs buildTrain operation.
	 *
	 * @param cars the array to process
	 * @return the resulting string
	 */
	public static String buildTrain(String[] cars){
		StringBuilder train=new StringBuilder();
		train.append(cars[0]);
		// Check for null/base case
		if(cars[0].length()==1)
			return "1 "+train.toString();
		for (int i = 1; i < cars.length; i++) {
			train.append(findPrefix(train.toString(),cars[i]));
		}	
		int size=train.length();
		StringBuilder outputString=new StringBuilder();
		String op=train.toString();
		for (int i = op.length()-1; i >=0; i--) {
			if(outputString.toString().indexOf(op.charAt(i))==-1)
				outputString.append(op.charAt(i));
		}

		return size+" "+outputString.reverse().toString();
	}
	/**
	 * Finds prefix in the data structure.
	 *
	 * @param mainString the mainString parameter
	 * @param newString the newString parameter
	 * @return the resulting string
	 */
	private static String findPrefix(String mainString, String newString) {
		boolean match=false;
		int i=0,index=-1;
		// Iterate through all elements
		for (i = 0; i <newString.length()-1; i++) {
			if(i==mainString.length()-1)
				break;
			String ns=newString.substring(0,i+1);
			String ms=mainString.substring(mainString.length()-i-1);
			if(ns.equals(ms)){
				match=true;
				index=i;
			}
		}
		if(match==false)
			return "";
		return newString.substring(index+1);
	}
}
