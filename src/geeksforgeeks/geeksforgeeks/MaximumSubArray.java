package geeksforgeeks;

public class MaximumSubArray {
	public static int maxSubArray(int[] A) {
		int newsum=A[0];
	       int max=A[0];
	       for(int i=1;i<A.length;i++){
	           newsum=Math.max(newsum+A[i],A[i]);
	           System.out.println(newsum);
	           max= Math.max(max, newsum);
	           System.out.println(max);
	       }
	       return max;
	}
	public static void main(String[] args) {
		int[] A = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(A));
	}
}
