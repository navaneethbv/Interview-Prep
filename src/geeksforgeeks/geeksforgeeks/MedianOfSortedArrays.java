package geeksforgeeks;

import java.util.ArrayList;

public class MedianOfSortedArrays {
	public static Integer MedianOfArrays(int[] A, int[] B)
	{
		ArrayList<Integer> list = new ArrayList<>();
		int i=0, j=0;
		while(i<A.length&&j<B.length)
		{
			if(A[i]<B[j])
			{
				System.out.println("If loop I "+i+" J "+j);
				list.add(A[i]);
				i++;
				if(list.contains(A[A.length-1]))
				{
					list.add(B[j]);
				}
			}
			else if(A[i]>=B[j])
			{
				System.out.println("If loop I "+i+" J "+j);
				list.add(B[j]);
				j++;
				if(list.contains(B[B.length-1]))
				{
					list.add(A[i]);
				}
			}
		}
		System.out.println(list);
		int median = list.size()/2-1;
		return list.get(median);				
	}

	public static void main(String[] args) {
		int[] A = {2,4,8};
		int[] B = {1,3,7};
		System.out.println(MedianOfArrays(A, B));
	}

}
