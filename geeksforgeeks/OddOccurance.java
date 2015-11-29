package geeksforgeeks;

import java.util.HashSet;
import java.util.Set;

public class OddOccurance {
	
	public static void oddOccurance(int[] array)
	{
		Set<Integer> set = new HashSet<>();
		
			for (int i = 0; i < array.length; i++) {
				if(set.contains(array[i]))
				{
					set.remove(array[i]);
				}
				else
				{
					set.add(array[i]);
				}
			}
			System.out.println("Oddly occuring elements ");

			StringBuilder sb = new StringBuilder();
			for (Integer i : set){
			sb.append(i).append(' ');
			}

			System.out.println(sb.toString());
	}

/*	public static int oddOccurance(int[] array)
	{
		int i, res = 0;
		for(i=0;i<array.length;i++)
		{
			res = res ^ array[i];
		}
		return res;
	}*/
	public static void main(String[] args) {
		int ar[] = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		oddOccurance(ar);		
	}
}
