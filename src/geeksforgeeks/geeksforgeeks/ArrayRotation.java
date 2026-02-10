package geeksforgeeks;

/**
 * Implementation of Array Rotation algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class ArrayRotation {
	/**
	 * Performs rev operation.
	 *
	 * @param arr1[] the arr1[] parameter
	 * @param rotation the rotation parameter
	 * @return the resulting array
	 */
	public  static  int[]  rev(int  arr1[],  int  rotation)
	public  static  int[]  rev(int  arr1[],  int  rotation)
	{  
		int  len= arr1.length;  
		int  start= len-rotation;  
		int  arr2[]= new  int[len];  
		int  k= 0;  
		for  (int  j= rotation;  j<len;  j++)
		{  
			arr2[k]= arr1[j]; 
			k++;  
		}  
		int  l= 0;  
		for  (int  i= start;  i<len;  i++)
		{  
			arr2[i]= arr1[l];
			l++; 
		}  
		return  arr2; 
	} 
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,6};

		int arr2[] = rev(arr1,2);

		for(int j=0; j<arr1.length; j++)
		{  
			System.out.print(+arr2[j]+" ");  
		} 
	}
}


