package hackerRank.DataStructures.Trees;

/*
 * Link:https://www.hackerrank.com/challenges/tree-inorder-traversal
 */

/**
 * Implementation of In Order Traversal algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class InOrderTraversal {

	void Inorder(Node root) {
		if(root!=null)
		{
			Inorder(root.left);
			System.out.print(root.data+" ");
			Inorder(root.right);
		}
	}

	class Node {
		int data;
		Node left;
		Node right;
	}
}
