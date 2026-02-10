package geeksforgeeks;

public class ReverseArray {
	public static void reverseArray(int[] arr, int start, int end)
	{
		 int temp;
		    while (start < end)
		    {
		        temp = arr[start];   
		        arr[start] = arr[end];
		        arr[end] = temp;
		        start++;
		        end--;
		    }   
	}
	public static void main(String[] args)
	{
		int A[] = {1, 2, 3, 4, 5, 6};
		reverseArray(A, 0, A.length-1);
		int i;
		  for (i=0; i < A.length; i++)
		   System.out.print(A[i]+" ");
	}
}
