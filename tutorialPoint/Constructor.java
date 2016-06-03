package tutorialPoint;

public class Constructor {
	//private String value;

	public Constructor() {
		
	}
	
	public Constructor(String value) {
		System.out.println("Passed value is "+value);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Constructor construct = new Constructor("Hello");
	}
}
