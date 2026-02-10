package Practice;

// Sum of three numbers is equal to target. Numbers are in a array and are not sorted

import java.util.*;

class SumThreeNumbers {
    /**
     * Main method to test the functionality of the class with various test cases.
     *
     * @param args the array to process
     */
    public static void main(String[] args) {

    }
    
     // Brute Force Method - O(n^3)
   /**
    * Performs sumThreeNumbers operation.
    *
    * @param array the array to process
    * @param sum the sum parameter
    */
   /* static void sumThreeNumbers(int[] array, int sum) {
        // Iterate through all elements
        for(int i = 0; i < array.length; i++) {
            for(int j = i+1; j < array.length; j++) {
                for(int k = j+1; k < array.length; k++) {
                    if((array[i] + array[j] + array [k]) == sum) {
                        System.out.println("The numbers adding to sum "+sum+" are "+array[i]+", "+array[j]+", "+array[k]);
                    }
                }
            }
        }
    }*/
   }
    
    
   // Complexity is O(n)
    /**
     * Performs sumThreeNumbers operation.
     *
     * @param array the array to process
     * @param sum the sum parameter
     */
    static void sumThreeNumbers(int[] array, int sum) {
        Set<Integer> set = new HashSet<Integer>();
        int difference = 0;
        // Iterate through all elements
        for(int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        // Iterate through all elements
        for(int i = 0; i < array.length; i++) {
            difference = sum - array[i];
           //System.out.print("The pair of numbers are "+array[i]);
            findSumPair(set,difference,array[i],sum);
        }
    }
    
    /**
     * Finds sum pair in the data structure.
     *
     * @param set the set parameter
     * @param difference the difference parameter
     * @param num the num parameter
     * @param sum the sum parameter
     */
    static void findSumPair(Set<Integer> set, int difference, int num, int sum) {
        set.remove(num);
        int[] array = new int[set.size()];
        int index = 0;
        for( int i : set ) {
            array[index++] = i; 
        }
        int diff = 0;
        // Iterate through all elements
        for(int i = 0; i < array.length; i++) {
            diff = difference - array[i];
            if((set.contains(diff))&&(num + diff +array[i] == sum)&&(array[i] != diff)) {
                System.out.println(num+" "+array[i]+" "+diff);
                set.remove(array[i]);
            }
        }
    }
}
