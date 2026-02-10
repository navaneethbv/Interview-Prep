package ctci;

/**
 * Implementation of Replace Spaces In URI algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ReplaceSpacesInURI {
	/**
	 * Performs replaceURI operation.
	 *
	 * @param str the str parameter
	 * @return the resulting string
	 */
	public static String replaceURI(String str)
	public static String replaceURI(String str)
	{
		return str.replaceAll(" ", "%20");
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args)
	{
		String third = "http://www.wikipedia. org/home /wiki";
		System.out.println("The new URI is "+replaceURI(third));
	}
}
