package eBayPrep;

import java.util.HashMap;

/**
 * Implementation of Implement Trie algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ImplementTrie{
	/**
	 * Inner class representing a node in the data structure.
	 */
	static class TrieNode{
		char c;
		boolean isLeaf=false;
		HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
		public TrieNode() {}
		public TrieNode(char c) {
			this.c=c;
		}

	}
	private TrieNode root;
	public _208ImplementTrie() {
		root = new TrieNode();
	}

	/**
	 * Performs insert operation.
	 *
	 * @param word the word parameter
	 */
	public void insert(String word) {
		HashMap<Character, TrieNode> children = root.children;
		// Iterate through all elements
		for (int i = 0; i < word.length(); i++) {
			char c1=word.charAt(i);
			TrieNode t;
			if(children.containsKey(c1))
			{
				t=children.get(c1);
			}
			else{
				t=new TrieNode(c1);
				children.put(c1, t);
			}
			children=t.children;
			if(i==word.length()-1)
				t.isLeaf=true;
		}
	}

	/**
	 * Searches for .
	 *
	 * @param word the word parameter
	 * @return true if condition is met, false otherwise
	 */
	public boolean search(String word) {
		TrieNode t = searchTrieNode(word);
        // Check for null/base case
        if(t != null && t.isLeaf) 
            return true;
        else
            return false;
	}

	/**
	 * Searches for trie node.
	 *
	 * @param word the word parameter
	 * @return the TrieNode result
	 */
	private TrieNode searchTrieNode(String word) {
		HashMap<Character, TrieNode> children=root.children;
		TrieNode pointer=null;
		// Iterate through all elements
		for (int i = 0; i < word.length(); i++) {
			char c1=word.charAt(i);
			if(children.containsKey(c1))
			{
				pointer=children.get(c1);
				children=pointer.children;
			}
			else
				return null;
		}
		return pointer;
	}

	/**
	 * Performs startsWith operation.
	 *
	 * @param prefix the prefix parameter
	 * @return true if condition is met, false otherwise
	 */
	public boolean startsWith(String prefix) {
		return searchTrieNode(prefix)!=null;
	}
	
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		_208ImplementTrie a=new _208ImplementTrie();
		a.insert("ab");
		System.out.println(a.search("a"));
		System.out.println(a.search("ab"));
		System.out.println(a.startsWith("a"));
		System.out.println(a.startsWith("ab"));
		
	}
}

