package Practice;

// Program is Incomplete

/**
 * Implementation of Print String Within Buffer Size algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrintStringWithinBufferSize {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {

	}

	/**
	 * Performs printStringWithinBufferSize operation.
	 *
	 * @param sentence the sentence parameter
	 * @return the resulting string
	 */
	private static String printStringWithinBufferSize(String sentence) {
		String[] array = sentence.split(" "); StringBuilder new_sentence = new StringBuilder("");
		// Iterate through all elements
		for(int i = 0; i < array.length;i++) {
			if(new_sentence.length() < 15){
				new_sentence.append(array);
			}
			else{
				new_sentence.append("\n");
			}
		}
		System.out.println(new_sentence);
		return new_sentence.toString();
	}
}
