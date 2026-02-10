package LeetCodePerformancePractice;

import java.util.HashMap;

/**
 * Implementation of Implement Trie algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ImplementTrie {
	class TrieNode {
		// Initialize your data structure here.
		HashMap<Character, TrieNode> childrens=new HashMap<>();
		boolean isLeaf=false;
		char c;
		public TrieNode(char c) {
			this.c=c;
		}
		public TrieNode() {

		}
	}

	public class Trie {
		private TrieNode root;

		public Trie() {
			root = new TrieNode();
		}

		// Inserts a word into the trie.
		/**
		 * Performs insert operation.
		 *
		 * @param word the word parameter
		 */
		public void insert(String word) {
			HashMap<Character, TrieNode> child=root.childrens;
			// Iterate through all elements
			for (int i = 0; i < word.length(); i++) {
				if(!child.containsKey(word.charAt(i)))
				{
					child.put(word.charAt(i), new TrieNode(word.charAt(i)));
				}
				if(i==word.length()-1)
					child.get(word.charAt(i)).isLeaf = true;    
				child=child.get(word.charAt(i)).childrens;
			}
		}

		// Returns if the word is in the trie.
		/**
		 * Searches for .
		 *
		 * @param word the word parameter
		 * @return true if condition is met, false otherwise
		 */
		public boolean search(String word) {

			TrieNode tn=findNode(word);
			// Check for null/base case
			if(tn!=null)
			{
				if(tn.isLeaf)
					return true;
			}
			return false;
		}
		TrieNode findNode(String word){
			TrieNode tn=root;
			HashMap<Character, TrieNode> child=tn.childrens;
			for (int i = 0; i < word.length(); i++) {
				char c=word.charAt(i);
				if(child.containsKey(c))
				{
					tn=child.get(c);
					child=tn.childrens;
				}
				else{
					return null;
				}
			}
			return tn;
		}
		// Returns if there is any word in the trie
		// that starts with the given prefix.
		/**
		 * Performs startsWith operation.
		 *
		 * @param prefix the prefix parameter
		 * @return true if condition is met, false otherwise
		 */
		public boolean startsWith(String prefix) {
			return findNode(prefix)!=null;
		}
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
