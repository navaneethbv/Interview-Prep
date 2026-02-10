package geeksforgeeks;

/**
 * Implementation of Merge Array algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class MergeArray {
	/**
	 * Performs mergeSortedArray operation.
	 *
	 * @param a[] the a[] parameter
	 * @param b[] the b[] parameter
	 * @return the resulting array
	 */
	public int[] mergeSortedArray(int a[], int b[]) {
		int i = 0;
		int j = 0;
		while (i < a.length && j < b.length) {
			if (a[i] == -1) {
				a[i] = b[j];
				i++;
				j++;
			} else {
				i++;
			}
		}
		return a;
	}
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		MergeArray obj = new MergeArray();
		int a[] = { 2, -1, -1, 6, -1, 10, -1 };
		int b[] = { 4, 5, 8, 15 };
		int[] res = obj.mergeSortedArray(a, b);
		System.out.println("Merged array: ");
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}
}