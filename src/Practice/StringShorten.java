package Practice;

import java.util.HashSet;

public class StringShorten {
	
	private static int count;
	public static void main(String[] args) {
		String input = "Automotive";
		// is my $life where _love is #%it?

		System.out.println("\nThe shortened string is "+shortenString(input));
	}

	private static String shortenString(String input) {
		String[] array = input.split(" "); StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < array.length; i++) {
			sb.append(shortenWord(array[i]));
		}
		return sb.toString();
	}

	private static StringBuilder shortenWord(String string) {
		String[] array = string.split(""); HashSet<String> set = new HashSet<String>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1 ; i < array.length - 1; i++) {
			if(!set.contains(array[i])){
				set.add(array[i]);
				count ++;
			}
		}	sb.append(array[0]);	
		sb.append(count);
		sb.append(array[array.length-1]);
		return sb;
	}
}
