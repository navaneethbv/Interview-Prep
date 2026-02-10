package Practice;
import java.io.File;
import java.io.FileNotFoundException; 
import java.util.ArrayList; 
import java.util.Scanner; 

/**
 * Implementation of DP4 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DP4 { 
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args[] the args[] parameter
	 */
	public static void main(String args[]) throws FileNotFoundException { 
		ArrayList<String> aDictionary = new ArrayList<String>(); 
		Scanner sc = new Scanner(new File("E:\\Notes\\twl06.txt")); 
		while (sc.hasNext()) { 
			aDictionary.add(sc.next()); 
		} 
		String sentence = "$itwasthebestoftimes"; 
		correctSentence(sentence, aDictionary); 
	} 

	private static void correctSentence(String sentence, 
			ArrayList<String> aDictionary) { 
		// TODO Auto-generated method stub 
		int n = sentence.length(); 
		boolean[] words = new boolean[n]; 
		words[0] = true; 
		int[] path = new int[n]; 
		for (int i = 1; i < n; i++) { 
			for (int k = 0; k < i; k++) { 

				if (words[k] 
						&& aDictionary.contains(sentence 
								.substring(k + 1, i + 1))) { 
					path[i]=k; 
					words[i] = true; 
				} 
			} 
		} 
		printSentence(sentence,path,n-1); 
	} 

	/**
	 * Performs printSentence operation.
	 *
	 * @param sentence the sentence parameter
	 * @param path the array to process
	 * @param n the size or count parameter
	 */
	private static void printSentence(String sentence,int[] path, int n) { 
		// TODO Auto-generated method stub 
		// Check for null/base case
		if(n==0)return; 
		printSentence(sentence, path,path[n]); 
		System.out.print(" "+sentence.substring(path[n]+1,n+1)); 
	}
} 