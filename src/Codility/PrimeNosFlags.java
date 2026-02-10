package Codility;

import java.util.ArrayList;

/*
 * Author : Navaneeth Rao
 * Link : https://codility.com/programmers/task/flags
 * To be checked later
 */

/**
 * Implementation of Prime Nos Flags algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class PrimeNosFlags {
	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args the array to process
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}
	/**
	 * Performs solution operation.
	 *
	 * @param A the array to process
	 * @return the computed integer result
	 */
	public static int solution(int[] A){
		 ArrayList<Integer> array = new ArrayList<Integer>();  
	        for (int i = 1; i < A.length - 1; i++) 
	        {  
	            if (A[i - 1] < A[i] && A[i + 1] < A[i]) 
	            {  
	                array.add(i);  
	            }  
	        }  
	   // Check for null/base case
	   if (array.size() == 1 || array.size() == 0) 
	   {  
	        return array.size();  
	   }  
	   
	   
	   
	   
	    int sf = 1;  
	    int ef = array.size();  
	    int result = 1;  
	    while (sf <= ef) 
	    {  
	        int flag = (sf + ef) / 2;  
	        boolean suc = false;  
	        int used = 0;  
	        int mark = array.get(0);  
	        for (int i = 0; i < array.size(); i++) 
	        {  
	            if (array.get(i) >= mark) 
	            {  
	                used++;  
	                mark = array.get(i) + flag;  
	                    if (used == flag) 
	                    {                       
	                        suc = true;  
	                        break;  
	                    }  
	            }  
	        }  
	        if (suc) 
	        {  
	            result = flag;  
	            sf = flag + 1;  
	        } 
	        else 
	        {  
	            ef = flag - 1;  
	        }  
	    }  
	   return result;  
	}
}