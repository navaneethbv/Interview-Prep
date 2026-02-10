package hackerRank.DataStructures.Trees;

/*
 * Link:https://www.hackerrank.com/challenges/tree-postorder-traversal
 */

/**
 * Implementation of Post Order Traversal algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PostOrderTraversal {

	void Postorder(Node root) {
		if(root!=null)
		{
			Postorder(root.left);
			Postorder(root.right);
			System.out.print(root.data+" ");
		}
	}

	class Node {
		int data;
		Node left;
		Node right;
	}
}
