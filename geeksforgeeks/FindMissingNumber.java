package geeksforgeeks;

public class FindMissingNumber {
		public static int FindMissingNum(int[] A)
		{
			int num = 0, sum =0, arraysum = 0;
			sum = ((A.length+1)*(A.length+2))/2;
			for(int i =0;i<A.length;i++)
			{
				arraysum+=A[i];
			}
			num = sum - arraysum;
			return num;
		}
		public static void main(String[] args) {
			int[] A = {1,2,4,5,6,7};
			System.out.println("The missing element is "+FindMissingNum(A));
		}
}
