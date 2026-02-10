package Practice;

public class PrintPairsEqualToSum {

	public static void main(String[] args) {
		int sum = 22;
		// Sorted array with no duplicates - If not sorted, sort using Arrays.sort
		int array[] = { 3, 5, 6, 7, 8, 9, 13, 15, 17 };
		printPairsEqualToSum(array,sum);
	}

	private static void printPairsEqualToSum(int[] array, int sum) {
		int size = array.length;
		int i = 0, k = size - 1;
		int curSum;
		while(i < k)
		{
			curSum = array[i] + array[k];
			if(curSum == sum)
			{
				System.out.println("The numbers are "+array[i]+" and "+array[k]);
				i++;k--;
			}
			else if(curSum < sum)
			{
				i++;
			}
			else
			{
				k--;
			}
		}

	}

}
