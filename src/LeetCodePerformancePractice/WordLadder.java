package LeetCodePerformancePractice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Implementation of Word Ladder algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class WordLadder {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("hot");
		set.add("dot");
		set.add("dog");
		set.add("lot");
		set.add("log");
		System.out.println(ladderLength("hit", "cog", set));
	}
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class WordNode{
		String str;int steps;
		public WordNode(String str,int steps) {
			this.str=str;
			this.steps=steps;
		}
	}
	/**
	 * Performs ladderLength operation.
	 *
	 * @param beginWord the beginWord parameter
	 * @param endWord the endWord parameter
	 * @param wordList the wordList parameter
	 * @return the computed integer result
	 */
	public static int ladderLength(String beginWord, String endWord, Set<String> wordList) {
		Queue<WordNode> queue=new LinkedList<>();
		queue.add(new WordNode(beginWord, 1));
		wordList.add(endWord);
		while(!queue.isEmpty())
		{
			WordNode top=queue.poll();
			if(top.str.equals(endWord))
			{
				return top.steps;
			}
			char arr[]=top.str.toCharArray();
			// Iterate through all elements
			for (int i = 0; i < arr.length; i++) {
				for (char c='a';c<='z';c++) {
					char temp=arr[i];
					arr[i]=c;
					if(wordList.contains(new String(arr)))
					{
						queue.add(new WordNode(new String(arr), top.steps+1));
						wordList.remove(new String(arr));
					}
					arr[i]=temp;
				}
			}
		}
		return 0;
	}
}
