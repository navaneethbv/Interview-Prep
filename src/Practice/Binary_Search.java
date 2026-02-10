package Practice;

import java.util.Scanner;

/**
 * Implementation of Binary_ Search algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
 */
public class Binary_Search {
	// Returns index of x if it is present in arr[l..r], else
    // return -1
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;
 
            // If the element is present at the middle itself
            if (arr[mid] == x)
               return mid;
 
            // If element is smaller than mid, then it can only
            // be present in left subarray
            if (arr[mid] > x)
               return binarySearch(arr, l, mid-1, x);
 
            // Else the element can only be present in right
            // subarray
            return binarySearch(arr, mid+1, r, x);
        }
 
        // We reach here when element is not present in array
        return -1;
    }
 
    // Driver method to test above
    /**
     * Main method to test the functionality of the class with various test cases.
     *
     * @param args[] the args[] parameter
     */
    public static void main(String args[])
    {
        Binary_Search ob = new Binary_Search();
        int arr[] = {2,3,4,10,40};
        int n = arr.length;
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to search");
        int x = scan.nextInt();
        int result = ob.binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "+result);
    }
}

