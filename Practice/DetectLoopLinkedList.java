package Practice;

public class DetectLoopLinkedList {
	
	private Node head;
	
	public DetectLoopLinkedList() {
		this.head = new Node("head");
	}
	
	public Node head() {
		return head;
	}
	
	public void appendToTail(Node node) {
		Node current = head;		
		while(current.next != null) {
			current = current.next;
		}		
		current.setNext(node);
	}
	
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
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node current = head.next();
		while(current.next != null) {
			sb.append(current).append("-->");
			current = current.next();
		}
		sb.delete(sb.length() - 3, sb.length());
		return sb.toString();
	}
	
	public static class Node {
		private Node next;
		private String data;
		
		public Node(String data) {
			this.data = data;
		}
		
		public String data() { return data; }
		public void setData(String data) { this.data = data; }
		
		public Node next() {
			return next;
		}
		
		public void setNext(Node next) {
			this.next = next;
		}
		
		public String toString(){
			return this.data;
		}
	}
	
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


