package Practice;

public class SubArray {
	public static void main(String[] args) {
		int[] array = {3,4,9,2,15,8,12,21,15,1};
		for(int i = 2; i < 5; i++){
			array[i] = array[i];
			System.out.println(array[i]);
		}
		
	}	
}
