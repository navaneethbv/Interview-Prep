package hackerearthPractice;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Given the size and the elements of array A , print all the elements in reverse order.
Input: First line of input contains, N
N - size of the array. 
Following N lines, each contains one integer, 
ith element of the array i.e. A[i].

Output:
Print all the elements of the array in reverse order, each element in a new line.

Constraints:
1≤N≤100
0≤A[i]≤1000
 */

class ReverseArray {
    /**
     * Main method to test the functionality of the class with various test cases.
     *
     * @param args[] the args[] parameter
     */
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of elements in the array");
        String line = br.readLine();
        int N = Integer.parseInt(line);
        
        int[] array = new int[N];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < N; i++) {
           array[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("The elements of the array in reverse order are");
		for(int i = N - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
        
    }
}
