package LeetCodePractice;

public class PowerofTwo{
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(65));
	}
	public static boolean isPowerOfTwo(int n) {
		return n>0 && (n&n-1)==0;
	}


}

