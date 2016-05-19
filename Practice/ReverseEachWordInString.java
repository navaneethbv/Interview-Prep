package Practice;

public class ReverseEachWordInString {
	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println(printSentence(str));
	}
	
	//Reverse characters in words and not the words themeselves	
	/*public static String printSentence(String str){
		String[] array = str.split(" "); StringBuilder sb = new StringBuilder();
		for(int i = 0; i < array.length; i++){
			sb.append(reverseChars(array[i])+ " ");
		}
		return sb.toString();
	}*/
	
	public static String printSentence(String str){
		String[] array = str.split(" "); StringBuilder sb = new StringBuilder();
		for(int i = array.length - 1; i >= 0; i--){
			sb.append(reverseChars(array[i])+ " ");
		}
		return sb.toString();
	}
	
	public static String reverseChars(String string) {
		char[] array = string.toCharArray(); StringBuilder sb = new StringBuilder();
		for(int i = array.length-1; i >= 0; i--){
			sb.append(array[i]);
		}
		return sb.toString();
	}
}
