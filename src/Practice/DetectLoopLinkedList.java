package Practice;

/**
 * Implementation of Detect Loop Linked List algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class DetectLoopLinkedList {
	
	private Node head;
	
	public DetectLoopLinkedList() {
		this.head = new Node("head");
	}
	
	/**
	 * Performs head operation.
	 *
	 * @return the Node result
	 */
	public Node head() {
		return head;
	}
	
	/**
	 * Performs appendToTail operation.
	 *
	 * @param node the tree node to process
	 */
	public void appendToTail(Node node) {
		Node current = head;		
		while(current.next != null) {
			current = current.next;
		}		
		current.setNext(node);
	}
	
	/**
	 * Checks if cyclic.
	 *
	 * @return true if condition is met, false otherwise
	 */
	public boolean isCyclic() {
		Node fast = head;
		Node slow = head;
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			
			if(fast == slow) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Performs toString operation.
	 *
	 * @return the resulting string
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node current = head.next();
		while(current.next != null) {
			sb.append(current).append("-->");
			current = current.next();
		}
		sb.delete(sb.length() - 3, sb.length());
		// Recursively process left and right subtrees
		return sb.toString();
	}
	
	/**
	 * Inner class representing a node in the data structure.
	 */
	public static class Node {
		private Node next;
		private String data;
		
		public Node(String data) {
			this.data = data;
		}
		
		/**
		 * Performs data operation.
		 *
		 * @return the resulting string
		 */
		public String data() { return data; }
		/**
		 * Sets data in the data structure.
		 *
		 * @param data the data parameter
		 */
		public void setData(String data) { this.data = data; }
		
		/**
		 * Performs next operation.
		 *
		 * @return the Node result
		 */
		public Node next() {
			return next;
		}
		
		/**
		 * Sets next in the data structure.
		 *
		 * @param next the next parameter
		 */
		public void setNext(Node next) {
			this.next = next;
		}
		
		/**
		 * Performs toString operation.
		 *
		 * @return the resulting string
		 */
		public String toString(){
			return this.data;
		}
	}
	
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		//creating LinkedList with 5 elements including head
		/*DetectLoopLinkedList linkedList = new DetectLoopLinkedList();
        linkedList.appendToTail(new DetectLoopLinkedList.Node("101"));
        linkedList.appendToTail(new DetectLoopLinkedList.Node("201"));
        linkedList.appendToTail(new DetectLoopLinkedList.Node("301"));
        linkedList.appendToTail(new DetectLoopLinkedList.Node("401"));
        System.out.println("Linked List : " + linkedList); */
        
        DetectLoopLinkedList linkedList = new DetectLoopLinkedList();
        linkedList.appendToTail(new DetectLoopLinkedList.Node("101"));
        DetectLoopLinkedList.Node cycle = new DetectLoopLinkedList.Node("201");
        linkedList.appendToTail(cycle);
        linkedList.appendToTail(new DetectLoopLinkedList.Node("301"));
        linkedList.appendToTail(new DetectLoopLinkedList.Node("401"));
        linkedList.appendToTail(cycle);
     

        if(linkedList.isCyclic()) {
            System.out.println("Linked List is cyclic as it contains cycles or loop");
        } else {
            System.out.println("LinkedList is not cyclic, no loop or cycle found");
        }
    } 
}

