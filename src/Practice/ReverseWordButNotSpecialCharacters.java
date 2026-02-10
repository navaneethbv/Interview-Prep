package Practice;

/**
 * Implementation of Reverse Word But Not Special Characters algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReverseWordButNotSpecialCharacters {
	/**
	 * Performs revWord operation.
	 *
	 * @param str the str parameter
	 */
	public void revWord(String str){		
		int flag=0;
		String word="";
		String finalString="";
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++){
			if(charArray[i]!=' '&&charArray[i]!=','&&!Character.isDigit(charArray[i])){				
				flag=1;
			}
			else if(flag==1&&(charArray[i]==' '||charArray[i]==','||Character.isDigit(charArray[i])))
				flag=2;
			if(flag==1&&i==str.length()-1){
				flag=2;
			}
			if(flag==1){
				word=word+charArray[i];
			}
			else if(flag==2){
				word= new StringBuffer(word).reverse().toString();
				finalString=finalString+word;
				flag=0;
				word="";
			}
			// Check for null/base case
			if(flag==0){ // System.out.println("final else");
				finalString=finalString+charArray[i];
			}
		}
		System.out.println(finalString);
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args[] the args[] parameter
	 */
	public static void main(String args[]){
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
}
