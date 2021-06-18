package Practice;

public class ConvertIntegerToBinary {
	public static void main(String[] args) {
		int num = 13;
		//System.out.println("Binary number is "+Integer.toBinaryString(num));
		integerToBinary(num);
	}

	private static void integerToBinary(int num) {
		int binary[] = new int[40];
	     int index = 0;
	     while(num > 0){
	       binary[index++] = num%2;
	       num = num/2;
	     }
	     for(int i = index-1;i >= 0;i--){
	         System.out.print(binary[i]);
	       }
	}
}
