package geeksforgeeks;

class LinkedList
{
	Node head; 
	static class Node 
	{
		int data; 
		Node next;  
		Node(int d)
		{ 
			data=d; next = null;
		}
	}
	void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next=head;
		head = new_node;
	}
	void insertAfter(Node prev_node, int new_data)
	{
		Node new_node = new Node(new_data);
		if(prev_node == null)
		{	
			System.out.println("Previous node cannot be null");
			return;
		}
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	} 
	void append(int new_data)
	{
		Node new_node = new Node(new_data);
		if(head == null)
		{
			head = new Node(new_data);
			return;
		}
		new_node.next = null;
		Node last = head;
		while(last.next != null)
			last = last.next;
		last.next = new_node;
		return;
	}
	public void removeFirst()
	{
		if(head==null)
		{
			System.out.println("Linked List is aleady empty");
			return;
		}
		else
		{
			if(head.next == null)
			{
				head = null;
			}
			else
			{
				Node new_head=head.next;
				head = new_head;
			}

		}
	}
	void removeall()
	{
		head=null;
	}
	void remove(int key){
		if(head == null)
	         throw new RuntimeException("cannot delete");

	      if( head.data==key )
	      {
	         head = head.next;
	         return;
	      }
	      Node curr = head;
	      Node prev = null;
	      
	      while(curr!=null && curr.data==key)
	      {
	    	  prev = curr;
	    	  curr=curr.next;
	      }
	      if(curr==null)
	    	  throw new RuntimeException("cannot delete");

	      //delete cur node
	      prev.next = curr.next;
	}
	
	public void printlist()
	{
		Node n = head;
		while(n != null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public static void main(String[] args)
	{
		LinkedList llist = new LinkedList();
		llist.append(6);
		llist.push(7);
		llist.push(1);
		llist.append(4);
		llist.insertAfter(llist.head.next,8);

		System.out.println("Created Linked List is \n");
		llist.printlist();
		System.out.println("\n\nDeletion of First Node in the Linked List \n");
		llist.removeFirst();
		llist.printlist();
		System.out.println("\n\nRemove node based on data");
		llist.remove(2);
		llist.printlist();
		System.out.println("\n\nDeletion of all nodes\n");
		llist.removeall();
		llist.printlist();		
	}
}
