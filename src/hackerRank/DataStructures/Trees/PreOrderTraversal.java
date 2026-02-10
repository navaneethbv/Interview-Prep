package hackerRank.DataStructures.Trees;

/*
 * Link:https://www.hackerrank.com/challenges/tree-preorder-traversal
 */

/**
 * Implementation of Pre Order Traversal algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PreOrderTraversal {

	void Preorder(Node root) {
		if(root!=null)
		{
			System.out.print(root.data+" ");
			Preorder(root.left);
			Preorder(root.right);
		}
	}

	class Node {
		int data;
		Node left;
		Node right;
	}
}
