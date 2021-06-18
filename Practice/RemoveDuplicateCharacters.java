package Practice;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		String str="aaaassssdeeefgddaa";
		System.out.println(removeChars(str));
	}

	private static String removeChars(String str) {
		StringBuilder sb = new StringBuilder();
		if(str.length() != 0) {
			sb.append(str.charAt(0));
		}
		for(int i = 0; i < str.length() - 1; i++) {
			if(str.charAt(i) != str.charAt(i+1)) {
				sb.append(str.charAt(i+1));
			}
		}
		return sb.toString();
	}
}

