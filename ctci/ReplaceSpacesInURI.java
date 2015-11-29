package ctci;

public class ReplaceSpacesInURI {
	public static String replaceURI(String str)
	{
		return str.replaceAll(" ", "%20");
	}
	public static void main(String[] args)
	{
		String third = "http://www.wikipedia. org/home /wiki";
		System.out.println("The new URI is "+replaceURI(third));
	}
}
