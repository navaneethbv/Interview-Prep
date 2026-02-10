package TopCoder;

import java.util.Arrays;

/*
 * SRM 155 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1669&rd=4580
 */

/**
 * Implementation of SRM155 Paternity Test algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM155PaternityTest {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.toString(possibleFathers("ABCD","AXCY", new String[]{ "SBTD", "QRCD" })));
		System.out.println(Arrays.toString(possibleFathers("ABCD","ABCX", new String[]{ "ABCY", "ASTD", "QBCD" })));
		System.out.println(Arrays.toString(possibleFathers("ABABAB","ABABAB" , new String[]{ "ABABAB", "ABABCC", "ABCCDD", "CCDDEE" })));
		System.out.println(Arrays.toString(possibleFathers("YZGLSYQT","YUQRWYQT", new String[]{"YZQLDPWT", "BZELSWQM", "OZGPSFKT", "GZTKFYQT", "WQJLSMQT"})));
		System.out.println(Arrays.toString(possibleFathers("WXETPYCHUWSQEMKKYNVP","AXQTUQVAUOSQEEKCYNVP" , new String[]{ "WNELPYCHXWXPCMNKDDXD",
				"WFEEPYCHFWDNPMKKALIW",
				"WSEFPYCHEWEFGMPKIQCK",
				"WAEXPYCHAWEQXMSKYARN",
		"WKEXPYCHYWLLFMGKKFBB" })));
	}
	/**
	 * Performs possibleFathers operation.
	 *
	 * @param child the child parameter
	 * @param mother the mother parameter
	 * @param men the array to process
	 * @return the resulting array
	 */
	public static int[] possibleFathers(String child, String mother, String[] men){
		boolean[] arr=new boolean[child.length()];

		StringBuilder sb=new StringBuilder();
		// Iterate through all elements
		for (int i = 0; i < men.length; i++) {
			boolean exit=false;
			int count=0;
			boolean flagArray[]=new boolean[child.length()];
			// Inner loop to check combinations
			for (int j = 0; j < arr.length; j++) {
				if(men[i].charAt(j)==child.charAt(j))
				{
					count++;
					flagArray[j]=true;
				}
			}
			// Inner loop to check combinations
			for (int j = 0; j < flagArray.length; j++) {
				if(!flagArray[j])
				{
					if(mother.charAt(j)!=child.charAt(j))
					{
						exit=true;
						break;
					}
				}
			}
			if(!exit && count>=men[i].length()/2)
				sb.append(i+"/");
		}
		if(sb.toString().contentEquals(""))
			return new int[]{};
		String str[]=sb.toString().trim().split("/");
		int[] outputArr=new int[str.length];
		// Iterate through all elements
		for (int i = 0; i < outputArr.length; i++) {
			outputArr[i]=Integer.parseInt(str[i]);
		}
		return outputArr;
	}
}
