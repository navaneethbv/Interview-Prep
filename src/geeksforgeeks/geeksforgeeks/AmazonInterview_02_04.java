package geeksforgeeks;

import ctci._02linkedList;
import ctci._02linkedList.Node;

/*
 * http://www.geeksforgeeks.org/amazon-interview/
 *  Clone a singly link list whose nodes contain, apart from next pointers, an extra pointer to any random node. 
 *  The random pointer of a node N could be after N, before N or the node N itself.
 *  Note:Run through the same node loop again to set the random pointer
 */
/**
 * Implementation of Amazon Interview_02_04 algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class AmazonInterview_02_04 {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		_02linkedList linkedList=new _02linkedList();
		linkedList.add(10);
		linkedList.add(11);
		linkedList.add(12);
		linkedList.add(13);
		linkedList.add(14);
		linkedList.add(15);
		linkedList.add(16);
		linkedList.add(17);
		linkedList.add(18);
		linkedList.add(19);
		linkedList.add(20);
		deepCopy(linkedList);
		clonedCopy(linkedList);

	}

	/**
	 * Performs deepCopy operation.
	 *
	 * @param linkedList the linkedList parameter
	 */
	private static void deepCopy(_02linkedList linkedList) {
		Node n=linkedList.getHeadNode();
		_02linkedList linkedListCloned=new _02linkedList();
		linkedListCloned.add(n.data);
		Node clonedNode=linkedListCloned.getHeadNode();
		while(n!=null){
			clonedNode.next=linkedListCloned.new Node(n.data,n.next);
			clonedNode=clonedNode.next;
			n=n.next;
		}
		linkedListCloned.delete();
		clonedNode=linkedListCloned.getHeadNode();
		n=linkedList.getHeadNode();
		while(clonedNode!=null){
			System.out.println(clonedNode);
			System.out.println(n);
			n=n.next;		
			clonedNode=clonedNode.next;
		}
	}
	/**
	 * Performs clonedCopy operation.
	 *
	 * @param linkedList the linkedList parameter
	 */
	private static void clonedCopy(_02linkedList linkedList) {
		Node n=linkedList.getHeadNode();
		_02linkedList linkedListCloned=new _02linkedList();
		linkedListCloned.add(n.data);
		Node clonedNode=linkedListCloned.getHeadNode();
		while(n!=null){
			clonedNode.next=n;
			clonedNode=clonedNode.next;
			n=n.next;
		}
		linkedListCloned.delete();
		clonedNode=linkedListCloned.getHeadNode();
		n=linkedList.getHeadNode();
		while(clonedNode!=null){
			System.out.println(clonedNode);
			System.out.println(n);
			n=n.next;			
			clonedNode=clonedNode.next;
		}
	}
}
