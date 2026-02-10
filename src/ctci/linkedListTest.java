package ctci;

/*Implementation of Linked List Data Structure Tester*/
/**
 * Implementation of linked List Test algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class linkedListTest {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		_02linkedList ll = new _02linkedList();
		ll.add(10);
		ll.add(23123);
		ll.add(123);
		ll.add(2, 200);
		ll.add(20);
		ll.delete();
		ll.add(323);
		ll.delete();
		System.out.println(ll.toString());
		ll.delete(2);
		System.out.println("size is" + ll.size());
		System.out.println(ll.toString());
	}
}
