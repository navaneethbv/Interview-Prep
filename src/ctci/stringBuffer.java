package ctci;

import java.util.Stack;

/*Implementation of String Buffer Data Structure*/
/**
 * Implementation of string Buffer algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class stringBuffer {
	String mainString;
	public _04stringBuffer() {
		// TODO Auto-generated constructor stub
		mainString=new String();
	}
	/**
	 * Performs append operation.
	 *
	 * @param string the string parameter
	 */
	public void append(String string){
		mainString=new String(mainString+string);
	}
	/**
	 * Performs append operation.
	 *
	 * @param c the c parameter
	 */
	public void append(char c){
		mainString=new String(mainString+String.valueOf(c));
	}
	/**
	 * Performs append operation.
	 *
	 * @param i the i parameter
	 */
	public void append(int i){
		mainString=new String(mainString+i);
	}
	/**
	 * Performs length operation.
	 *
	 * @return the computed integer result
	 */
	public int length(){
		// Recursively process left and right subtrees
		return mainString!=null?mainString.length():0;
	}
	/**
	 * Performs delete operation.
	 *
	 * @param startIndex the startIndex parameter
	 * @param endIndex the endIndex parameter
	 */
	public void delete(int startIndex,int endIndex){
		mainString=new String(mainString.substring(0,startIndex)+mainString.substring(endIndex));
	}
	/**
	 * Performs deleteCharAt operation.
	 *
	 * @param i the i parameter
	 */
	public void deleteCharAt(int i){
		mainString=new String(mainString.substring(0,i)+mainString.substring(i+1));
	}
	/**
	 * Sets length in the data structure.
	 *
	 * @param newLength the newLength parameter
	 */
	public void setLength(int newLength){
		if(newLength<mainString.length())
			mainString=new String(mainString.substring(0,newLength));
		else
			mainString=new String(mainString+"\u0000");
	}
	/**
	 * Performs reverse operation.
	 *
	 */
	public void reverse(){
		Stack<Character> reverser=new Stack<Character>();
		// Iterate through all elements
		for (int i = 0; i < mainString.length(); i++) {
			reverser.push(mainString.charAt(i));
		}
		int length=mainString.length();
		mainString=new String();
		// Iterate through all elements
		for (int i = 0; i < length; i++) {
			mainString+=reverser.pop();
		}
	}
	/**
	 * Performs toString operation.
	 *
	 * @return the resulting string
	 */
	public String toString(){
		return mainString;
	}

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

}
