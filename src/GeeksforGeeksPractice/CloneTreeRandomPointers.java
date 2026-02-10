package GeeksforGeeksPractice;

import java.util.ArrayList;

/*
 * Link : http://www.geeksforgeeks.org/find-all-possible-interpretations/
 * To be done later
 */
/**
 * Implementation of Clone Tree Random Pointers algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CloneTreeRandomPointers {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn = new TreeNode(10);
		tn.left        = new TreeNode(12);
		tn.right       = new TreeNode(15);
		tn.left.left  = new TreeNode(25);
		tn.left.right = new TreeNode(30);
		tn.right.left = new TreeNode(36);
		list=new ArrayList<>();
		getTreeStructure(tn);
		convertStructure(list);
	}
	/**
	 * Performs convertStructure operation.
	 *
	 * @param list the list parameter
	 */
	private static void convertStructure(ArrayList<Integer> list) {
		DLLNode tn=new DLLNode(list.get(0));
		tn.prev=null;
		DLLNode headPtr=tn;
		for (int i = 1; i < list.size(); i++) {
			DLLNode temp=new DLLNode(list.get(i));
			temp.prev=tn;
			tn.next=temp;
			tn=tn.next;
		}
		while(headPtr!=null)
		{
			System.out.println(headPtr.value);
			headPtr=headPtr.next;
		}
		
	}
	static ArrayList<Integer> list;
	/**
	 * Retrieves tree structure from the data structure.
	 *
	 * @param tn the tree node to process
	 */
	private static void getTreeStructure(TreeNode tn) {
		// Check for null/base case
		if(tn!=null)
		{	
			getTreeStructure(tn.left);
			list.add(tn.value);
			getTreeStructure(tn.right);
		}
	}

	/**
	 * Inner class representing a node in the data structure.
	 */
	static class DLLNode{
		DLLNode prev,next;
		int value;
		public DLLNode(int value) {
			this.value=value;
		}
	}

	/**
	 * Inner class representing a node in the data structure.
	 */
	static class TreeNode{
		TreeNode left,right;
		int value;
		public TreeNode(int value) {
			this.value=value;
		}		
	}

}
