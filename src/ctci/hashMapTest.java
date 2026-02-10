package ctci;

/*Implementation of Hash Map Data Structure Tester*/
/**
 * Implementation of hash Map Test algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class hashMapTest {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		_01hashMap map=new _01hashMap();
		System.out.println(map.toString());
		for (int i = 0; i < 300; i++) {
			System.out.println(map.put("navaneeth","asd"));	
		}
		
		System.out.println(map.toString());
	}
}
