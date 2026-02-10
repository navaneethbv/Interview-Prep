package GeeksforGeeksPractice;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Link : http://www.geeksforgeeks.org/check-given-binary-tree-follows-height-property-red-black-tree/
 */
/**
 * Implementation of RB Tree Height Balance algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class RBTreeHeightBalance {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		TreeNode tn=new TreeNode(12);
		tn.right=new TreeNode(14);
		tn.right.right=new TreeNode(16);
		maxh=0;minh=0;
		//System.out.println(checkBalance(tn,maxh,minh));
		//System.out.println(checkBalanceAlternate(tn));

		TreeNode tn1=new TreeNode(40);
		tn1.left=new TreeNode(10);
		tn1.right=new TreeNode(100);
		tn1.right.left=new TreeNode(60);
		tn1.right.right=new TreeNode(150);
		maxh=0;minh=0;
		//System.out.println(checkBalance(tn1,maxh,minh));
		//System.out.println(checkBalanceAlternate(tn1));

		TreeNode tn2=new TreeNode(10);
		tn2.left=new TreeNode(5);
		tn2.right=new TreeNode(100);
		tn2.right.left=new TreeNode(50);
		tn2.right.right=new TreeNode(150);
		tn2.right.left.left=new TreeNode(40);
		maxh=0;minh=0;
		//System.out.println(checkBalance(tn2,maxh,minh));
		System.out.println(checkBalanceAlternate(tn2));

	}
	static int path[];
	/**
	 * Performs checkBalanceAlternate operation.
	 *
	 * @param tn the tree node to process
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkBalanceAlternate(TreeNode tn) {
		//check for maxh<=2minh
		// Check for null/base case
		if(tn!=null){
			path=new int[10];
			boolean b=getPathBalance(tn);
			if(b)
				// Recursively process left and right subtrees
				return checkBalanceAlternate(tn.left) && checkBalanceAlternate(tn.right);
			else
				return false;
		}
		return true;
	}
	static ArrayList<Integer> list=new ArrayList<>();
	/**
	 * Retrieves path balance from the data structure.
	 *
	 * @param tn the tree node to process
	 * @return true if condition is met, false otherwise
	 */
	private static boolean getPathBalance(TreeNode tn) {
		path=new int[10];
		getPath(tn,path,0);
		list=new ArrayList<>();
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)<=min)
				min=list.get(i);
			if(list.get(i)>=max)
				max=list.get(i);
		}
		return max<=2*min;
	}

	/**
	 * Retrieves path from the data structure.
	 *
	 * @param tn the tree node to process
	 * @param path the array to process
	 * @param pathLen the pathLen parameter
	 */
	private static void getPath(TreeNode tn, int[] path, int pathLen) {
		// Check for null/base case
		if(tn!=null)
		{
			path[pathLen]=tn.value;
			pathLen++;
			// Check if node is a leaf (no children)
			if(tn.left==null && tn.right==null)
			{
				System.out.println(Arrays.toString(Arrays.copyOfRange(path, 0, pathLen)));
				list.add(pathLen);
			}
			getPath(tn.left, path, pathLen);
			getPath(tn.right, path, pathLen);	
		}
	}
	static int maxh,minh;
	/**
	 * Performs checkBalance operation.
	 *
	 * @param tn the tree node to process
	 * @param maxh the maxh parameter
	 * @param minh the minh parameter
	 * @return true if condition is met, false otherwise
	 */
	private static boolean checkBalance(TreeNode tn,int maxh,int minh) {
		// Check for null/base case
		if(tn!=null)
		{
			int lmaxh = 0,lminh = 0,rmaxh = 0,rminh = 0;
			if(!checkBalance(tn.left, lmaxh, lminh))
				return false;
			if(!checkBalance(tn.right, rmaxh, rminh))
				return false;
			maxh=Math.max(lmaxh, rmaxh)+1;
			minh=Math.min(lminh,rminh)+1;
			if(maxh<=2*minh)
				return true;
			return false;
		}
		maxh=minh=0;
		return true;
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
