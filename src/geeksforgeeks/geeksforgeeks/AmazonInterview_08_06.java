package geeksforgeeks;

import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

/*
 * http://www.geeksforgeeks.org/amazon-interview-set-8/
 *  Find non-unique characters in a given string
 */;
/**
 * Implementation of Amazon Interview_08_06 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class AmazonInterview_08_06 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 Scanner scanner=new Scanner(new InputStreamReader(System.in));
		 String inputString=scanner.nextLine();
		 scanner.close();
		 HashMap<String, Integer> elementsMap=new HashMap<String, Integer>();
		 for (int i = 0; i < inputString.length(); i++) {
			if(!elementsMap.containsKey(inputString.charAt(i)+"")){
				elementsMap.put(inputString.charAt(i)+"",1);
			}
			else{
				elementsMap.put(inputString.charAt(i)+"",elementsMap.get(inputString.charAt(i)+"")+1);
			}
		}
		Object[] keyArray= elementsMap.keySet().toArray();
		Object[] valueArray= elementsMap.values().toArray();
		
		 for (int i = 0; i < keyArray.length; i++) {
			if((int)valueArray[i]==1){
				System.out.print(keyArray[i]+",");
			}
		}
		 
	 }
 }