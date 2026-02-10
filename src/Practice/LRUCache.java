package Practice;

import java.util.*;
class Node{
	int key;
	int value;
	Node pre;
	Node next;

	public Node(int key, int value){
		this.key = key;
		this.value = value;
	}
}

/**
 * Implementation of LRU Cache algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class LRUCache {
	int capacity;
	HashMap<Integer, Node> map = new HashMap<Integer, Node>();
	Node head=null;
	Node end=null;

	public LRUCache(int capacity) {
		this.capacity = capacity;
	}

	/**
	 * Retrieves  from the data structure.
	 *
	 * @param key the key value
	 * @return the computed integer result
	 */
	public int get(int key) {
		if(map.containsKey(key)){
			Node n = map.get(key);
			remove(n);
			setHead(n);
			return n.value;
		}

		return -1;
	}

	/**
	 * Removes  from the data structure.
	 *
	 * @param n the size or count parameter
	 */
	public void remove(Node n){
		// Check for null/base case
		if(n.pre!=null){
			n.pre.next = n.next;
		}else{
			head = n.next;
		}

		// Check for null/base case
		if(n.next!=null){
			n.next.pre = n.pre;
		}else{
			end = n.pre;
		}

	}

	/**
	 * Sets head in the data structure.
	 *
	 * @param n the size or count parameter
	 */
	public void setHead(Node n){
		n.next = head;
		n.pre = null;

		// Check for null/base case
		if(head!=null)
			head.pre = n;

		head = n;

		// Check for null/base case
		if(end ==null)
			end = head;
	}

	/**
	 * Sets  in the data structure.
	 *
	 * @param key the key value
	 * @param value the value value
	 */
	public void set(int key, int value) {
		if(map.containsKey(key)){
			Node old = map.get(key);
			old.value = value;
			remove(old);
			setHead(old);
		}else{
			Node created = new Node(key, value);
			if(map.size()>=capacity){
				map.remove(end.key);
				remove(end);
				setHead(created);

			}else{
				setHead(created);
			}    

			map.put(key, created);
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