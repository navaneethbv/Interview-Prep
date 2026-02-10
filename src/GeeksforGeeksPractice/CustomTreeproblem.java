package GeeksforGeeksPractice;

/*
 * Link : http://www.geeksforgeeks.org/custom-tree-problem/
 * To be done later
 */
/**
 * Implementation of Custom Treeproblem algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class CustomTreeproblem {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		String [] links1 = {"a b", "b c", "b d", "a e"};
        System.out.println("------------ Forest 1 ----------------");
        printForest(links1);       
         
        String [] links2 = {"a b", "a g", "b c", "c d", "d e", "c f",
                            "z y", "y x", "x w"};
        System.out.println("------------ Forest 2 ----------------");
        printForest(links2);      
	}


	/**
	 * Performs printForest operation.
	 *
	 * @param links1 the array to process
	 */
	private static void printForest(String[] links1) {
		
		
		
		
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
