package Practice;

/* Name of the class has to be "Main" only if the class is public. */
class RearrangeZeroes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] array = {2,0,0,3,7,9,1,0,5,0};
		int[] new_array = rearrange(array);
		for(int i = 0 ; i < array.length; i++) {
			System.out.print(new_array[i]+" ");
		}
	}
	
	static int[] rearrange(int[] array) {
		int[] arr = new int[array.length];
		int count = 0; int j = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 0) {
				count ++;
			} else {
				arr[j] = array[i];
				j++;
			}
		}
		for(int a = j; a < count + j; a++) {
			arr[j] = 0;
		}
		return arr;
	}
}