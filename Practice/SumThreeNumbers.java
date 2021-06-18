package Practice;

// Sum of three numbers is equal to target. Numbers are in a array and are not sorted

import java.util.*;

class SumThreeNumbers {
    public static void main(String[] args) {
        int[] array = {3,5,6,12,9,4,10};
        int sum = 23;
        sumThreeNumbers(array,sum);
    }
    
     // Brute Force Method - O(n^3)
   /* static void sumThreeNumbers(int[] array, int sum) {
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
    
    
   // Complexity is O(n)
    static void sumThreeNumbers(int[] array, int sum) {
        Set<Integer> set = new HashSet<Integer>();
        int difference = 0;
        for(int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        for(int i = 0; i < array.length; i++) {
            difference = sum - array[i];
           //System.out.print("The pair of numbers are "+array[i]);
            findSumPair(set,difference,array[i],sum);
        }
    }
    
    static void findSumPair(Set<Integer> set, int difference, int num, int sum) {
        set.remove(num);
        int[] array = new int[set.size()];
        int index = 0;
        for( int i : set ) {
            array[index++] = i; 
        }
        int diff = 0;
        for(int i = 0; i < array.length; i++) {
            diff = difference - array[i];
            if((set.contains(diff))&&(num + diff +array[i] == sum)&&(array[i] != diff)) {
                System.out.println(num+" "+array[i]+" "+diff);
                set.remove(array[i]);
            }
        }
    }
}
