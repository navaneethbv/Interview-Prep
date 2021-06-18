package Practice;
import java.io.File;
import java.io.FileNotFoundException; 
import java.util.ArrayList; 
import java.util.Scanner; 

public class DP4 { 
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

	private static void printSentence(String sentence,int[] path, int n) { 
		// TODO Auto-generated method stub 
		if(n==0)return; 
		printSentence(sentence, path,path[n]); 
		System.out.print(" "+sentence.substring(path[n]+1,n+1)); 
	} 
} 