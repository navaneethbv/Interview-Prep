package TopCoder;

/*
 * SRM 151 Div2
 * Link:https://community.topcoder.com/stat?c=problem_statement&pm=1739&rd=4560
 */



/**
 * Implementation of SRM151 Birthday algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class SRM151Birthday {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	/**
	 * Retrieves next from the data structure.
	 *
	 * @param date the date parameter
	 * @param birthdays the array to process
	 * @return the resulting string
	 */
	public static String getNext(String date, String[] birthdays){
		int monthVal=Integer.parseInt(date.substring(0,2));
		int dateVal=Integer.parseInt(date.substring(3,5));
		System.out.println(dateVal+"/"+monthVal);
		int outputDateVal=Integer.MIN_VALUE,outputMonthVal=Integer.MIN_VALUE;
		int diffDateVal,diffMonthVal;
		// Iterate through all elements
		for (int i = 0; i < birthdays.length; i++) {
			int ithMonth=Integer.parseInt(birthdays[i].substring(0,2));
			int ithDate=Integer.parseInt(birthdays[i].substring(3,5));
			int monthDiff=ithMonth-monthVal;
			int dateDiff=ithDate-dateVal;
			if(monthDiff<0)
			{
				if(dateDiff>0){
					
				}else if(dateDiff<0){
					
				}else{

				}
			}
			else if(monthDiff>0)
			{
				if(dateDiff>0){

				}else if(dateDiff<0){

				}else{

				}
			}
			else{
				if(dateDiff>0){

				}else if(dateDiff<0){

				}else{

				}
			}
		}
		return  "";
	}

}
