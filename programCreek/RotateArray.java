package programCreek;

/*
 * Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */
public class RotateArray {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		System.out.println("Rotating the array by 3 steps");
		int k = 3;
		for(int i = 0 ; i < rotateArray(array,k).length; i++){
			System.out.print(rotateArray(array,k)[i]);
		}
	}

	private static int[] rotateArray(int[] array, int k) {
		int[] result = new int[array.length];

		for(int i = 0; i < k; i++){
			result[i] = array[array.length-k+i]; 
		}
		int j = 0;
		for(int i = k; i < array.length; i++){
			result[i] = array[j];
			j++;
		}
		System.arraycopy( result, 0, array, 0, array.length );
		return result;

	}
}