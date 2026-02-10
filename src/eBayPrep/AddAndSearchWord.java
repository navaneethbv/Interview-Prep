package eBayPrep;

import java.util.HashMap;

/**
 * Implementation of Add And Search Word algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AddAndSearchWord{

	public _211AddAndSearchWord() {
		root=new TrieNode();
	}
	// Adds a word into the data structure.
	/**
	 * Adds word to the data structure.
	 *
	 * @param word the word parameter
	 */
	public void addWord(String word) {
		TrieNode t=root;
		HashMap<Character, TrieNode> children=t.children;
		// Iterate through all elements
		for (int i = 0; i < word.length(); i++) {
			char c1=word.charAt(i);
			if(children.containsKey(c1))
			{
				t=children.get(c1);
				children=t.children;
			}
			else{
				t=new TrieNode(c1);
				children.put(c1, t);
				children=children.get(c1).children;
			}
			if(i==word.length()-1)
				t.isLeaf=true;
		}

	}

	// Returns if the word is in the data structure. A word could
	// contain the dot character '.' to represent any one letter.
	/**
	 * Searches for .
	 *
	 * @param word the word parameter
	 * @return true if condition is met, false otherwise
	 */
	public boolean search(String word) {
		HashMap<Character, TrieNode> children=root.children;
		return dfs(word,children,0);	
	}
	/**
	 * Performs dfs operation.
	 *
	 * @param word the word parameter
	 * @param children the children parameter
	 * @param i the i parameter
	 * @return true if condition is met, false otherwise
	 */
	private boolean dfs(String word, HashMap<Character, TrieNode> children, int i) {
		if(i==word.length() )
			// Check for null/base case
			if(children.size()==0) 
				return true; 
			else
				return false;
		char c1=word.charAt(i);
		if(children.containsKey(c1))
		{
			if(i == word.length()-1 && children.get(c1).isLeaf){
				return true;
			}
			// Recursively process left and right subtrees
			return dfs(word,children.get(c1).children, i+1);
		}
		else if(c1=='.')
		{
			Object[] arr=children.keySet().toArray();
			boolean val=false;
			// Inner loop to check combinations
			for (int j = 0; j < arr.length; j++) {
				if(i == word.length()-1 && children.get(arr[j]).isLeaf){
					return true;
				}
				val|=dfs(word,children.get(arr[j]).children,i+1);
			}
			return val;
		}
		return false;
	}
	TrieNode root;
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class TrieNode{
		char c;
		HashMap<Character, TrieNode> children=new HashMap<>();
		boolean isLeaf=false;
		public TrieNode() {}
		public TrieNode(char c) {
			this.c=c;
		}
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		_211AddAndSearchWord a=new _211AddAndSearchWord();
		a.addWord("bad");
		a.addWord("dad");
		a.addWord("mad");
		System.out.println(a.search("pad"));
		System.out.println(a.search("bad"));
		System.out.println(a.search(".ad"));
		System.out.println(a.search("b.."));
	}
}

