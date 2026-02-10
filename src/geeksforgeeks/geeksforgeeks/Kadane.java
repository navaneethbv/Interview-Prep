package geeksforgeeks;

class Kadane
{
	/**
	 * Retrieves max sub array from the data structure.
	 *
	 * @param arr the array to process
	 * @return the resulting array
	 */
	public static int[] getMaxSubArray(int[] arr)
	{
		int startI=0,finalStart=0,endI=1,sumLocal=0,sumMax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;++i) 
		{  
			sumLocal+=arr[i];
			if(sumLocal >sumMax)
			{
				sumMax=sumLocal;
				endI=i+1;
				finalStart=startI;
			}
			if(sumLocal<=0)
			{
				sumLocal=0;
				startI=i+1;
			}
		}
		int[] res=new int[endI-finalStart];
		for(int i=finalStart;i<endI;++i) 
			res[i-finalStart]=arr[i]; 
		return  res;  
	}  
	
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param st the array to process
	 */
	public  static  void  main(String[]  st)  
	{  
	int[]  arr={-1,-1,-2,-3,-3,-4,-1,-5};
	for(int  e:getMaxSubArray(arr))  
		System.out.print(e+",  "); 
	}  
} 