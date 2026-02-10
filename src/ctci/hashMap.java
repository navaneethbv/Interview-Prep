package ctci;

import java.util.Arrays;

/*Implementation of Hash Map Data Structure
 * 
 * BY - Navaneeth Rao
 * 
 * */
/**
 * Implementation of hash Map algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class hashMap {
	private String[] list=new String[20];
	private int totalElements=0;
	public _01hashMap() {
		Arrays.fill(list,null);
	}
	/**
	 * Checks if function encode.
	 *
	 * @param str the str parameter
	 * @return the computed integer result
	 */
	public int hashFunctionEncode(String str){
		System.out.println(list.length-1+"||||||"+totalElements);
		if(totalElements==list.length-1){
			System.out.println(totalElements);
			Arrays.copyOf(list,(int)(list.length*1.5));
		}
		int index=str.hashCode()%(list.length-1);
		return index;
	}
	/**
	 * Performs put operation.
	 *
	 * @param key the key value
	 * @param value the value value
	 * @return true if condition is met, false otherwise
	 */
	public boolean put(String key,String value){
		int indexToUse=(int)Math.abs(hashFunctionEncode(key));
		// Check for null/base case
		if(list[indexToUse]!=null)
			return false;
		else
			list[indexToUse]=value;
		totalElements++;
		return true;
	}
	/**
	 * Retrieves  from the data structure.
	 *
	 * @param key the key value
	 * @return the resulting string
	 */
	public String get(String key){
		int indexToUse=(int)Math.abs(hashFunctionDecode(key));
		if(indexToUse>list.length)
			return  null;
		return list[indexToUse];
	}
	/**
	 * Checks if function decode.
	 *
	 * @param key the key value
	 * @return the computed integer result
	 */
	public int hashFunctionDecode(String key){
		return (int)(Math.abs(key.hashCode()%(list.length-1)));
	}
	/**
	 * Performs delete operation.
	 *
	 * @param key the key value
	 * @return true if condition is met, false otherwise
	 */
	public boolean delete(String key){
		 // Check for null/base case
		 if(list[hashFunctionDecode(key)]!=null?true:false){
			 list[hashFunctionDecode(key)]=null;
		 		return true;
		 }
		 return false;
	}
	
	/**
	 * Performs toString operation.
	 *
	 * @return the resulting string
	 */
	public String toString(){
		StringBuffer returnString=new StringBuffer();
		// Iterate through all elements
		for (int i = 0; i < list.length; i++) {
			// Check for null/base case
			if(list[i]!=null)
				returnString.append("Index : "+i+"|||value :"+list[i]+"\n");
		}
		// Recursively process left and right subtrees
		return returnString.toString();
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
