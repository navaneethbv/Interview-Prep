package geeksforgeeks;



/*
 * http://www.geeksforgeeks.org/level-order-traversal-in-spiral-form/
 * Level order traversal in spiral form
 */;
/**
 * Implementation of Data Structures_ Binary Tree_09 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
 public class DataStructures_BinaryTree_09 {
	 /**
	  * Main method to test the functionality of the class with various test cases.
	  *
	  * @param args the array to process
	  */
	 public static void main(String[] args) {
		 _01DataStructures_BinaryTree_00 binaryTree1=new _01DataStructures_BinaryTree_00();
		 binaryTree1.insert(null,null,10);
		 binaryTree1.insert(10,"left",11);
		 binaryTree1.insert(10,"right",12);
		 binaryTree1.insert(11,"left",13);
		 binaryTree1.insert(11,"right",14);
		 binaryTree1.insert(12,"left",15);
		 binaryTree1.insert(12,"right",16);
		 binaryTree1.preOrder();
		 levelOrderSpiral(binaryTree1);
	 }

	private static void levelOrderSpiral(
			_01DataStructures_BinaryTree_00 binaryTree1) {
		// TODO Auto-generated method stub
		boolean order=false;
		for (int i = 1; i < 4; i++) {
			levelOrderSpiral(binaryTree1.rootNode,i,order);	
			order=!order;
		}
	}

	/**
	 * Performs levelOrderSpiral operation.
	 *
	 * @param node the tree node to process
	 * @param level the level parameter
	 * @param order the order parameter
	 */
	private static void levelOrderSpiral(_01DataStructures_BinaryTree_00.Node node,int level,boolean order) {
		// Check for null/base case
		if(node==null)
			return;
		else
			if(level==1)
				System.out.print(node.data+",");
			else if(level>1){
				if(order){
					levelOrderSpiral(node.left,level-1,order);
					levelOrderSpiral(node.right,level-1,order);
				}
				else{
					levelOrderSpiral(node.right,level-1,order);
					levelOrderSpiral(node.left,level-1,order);
				}
			}
		
	}



 }