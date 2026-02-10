package Practice;

import java.util.*;

class LongestSubString {
    
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
     * Performs longestWithoutRepitition operation.
     *
     * @param word the word parameter
     * @return the computed integer result
     */
    public static int longestWithoutRepitition(String word) {
        String[] array = word.split(""); int count = 0, temp = 0;
        Set<String> set = new HashSet<String>(); 
        // Iterate through all elements
        for(int i = 0 ; i < array.length; i++) {
            if(!set.contains(array[i])) {
                set.add(array[i]);
                count++;
            } else {
                if (count > temp) {
                temp = count;
                count = 1; }
                set.clear();
                set.add(array[i]);
            }
        }
        if(count > temp)
            return count;
        else
            return temp;
    }
}
