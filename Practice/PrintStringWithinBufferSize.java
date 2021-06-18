package Practice;


// Program is Incomplete


public class PrintStringWithinBufferSize {
	public static void main(String[] args) {
		String sentence = "One two three four five six seven eight nine ten";
		System.out.println("The output is \n"+printStringWithinBufferSize(sentence));
	}

	private static String printStringWithinBufferSize(String sentence) {
		String[] array = sentence.split(" "); StringBuilder new_sentence = new StringBuilder("");
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
