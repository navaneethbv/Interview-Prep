package TopCoder;

import java.util.Arrays;

/*
 * SRM 147 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1667&rd=4540
 */



/**
 * Implementation of SRM583 Swapping Digits algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM583SwappingDigits {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		System.out.println(minNumber("596"));
		System.out.println(minNumber("93561"));
		System.out.println(minNumber("5491727514"));
		System.out.println(minNumber("10234"));
		System.out.println(minNumber("93218910471211292416"));
	}
	/**
	 * Performs minNumber operation.
	 *
	 * @param num the num parameter
	 * @return the resulting string
	 */
	public static String minNumber(String num){
		if(num.indexOf('0')>-1)//contains 0
		{	
			char[] charArr=num.toCharArray();
			Arrays.sort(charArr);
			int counter=0;
			// Iterate through all elements
			for (int i = 0; i < charArr.length; i++) {
				if(charArr[i]!='0')
				{
					if(charArr[i]<num.charAt(counter)){
						num=num.replaceFirst(charArr[i]+"",num.charAt(counter)+"");
						num=num.substring(0, counter)+charArr[i]+num.substring(counter+1);
						return num;
					}
				}
			}
		}
		else{
			char[] charArr=num.toCharArray();
			Arrays.sort(charArr);
			// Iterate through all elements
			for (int i = 0; i < num.length(); i++) {
				if(num.charAt(i)!=charArr[i])
				{
					num=num.replaceFirst(charArr[i]+"",num.charAt(i)+"");
					num=num.substring(0, i)+charArr[i]+num.substring(i+1);
					return num;
				}
			}
		}
		return num;
	}
}
