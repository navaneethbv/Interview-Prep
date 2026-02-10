package Practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

class MaximumElement {

        /**
         * Performs maxoccurance operation.
         *
         * @param array the array to process
         * @return the computed integer result
         */
        public static int maxoccurance(char[] array) {
                HashMap<Character,Integer> map = new HashMap<Character,Integer>();
                int count = 1;
                for(int i=0; i<array.length; i++) {
                        if(!map.containsKey(array[i])) {
                                map.put(array[i],count);
                        } else {
                                map.put(array[i], map.get(array[i]) + 1);
                        }
                }
                int maxValue = (Collections.max(map.values()));
                if(maxValue > array.length/2) {
                        for(Entry<Character, Integer> entry : map.entrySet()) {
                                if(entry.getValue() == maxValue) {
                                        return entry.getKey();
                                }
                        }
                }
                else {
                        return -1;
                }
				return -1;
        }

        /**
         * Main method to test the functionality of the class with various test cases.
         *
         * @param args the array to process
         */
        public static void main(String[] args) {
                char[] array = {'b','a','b','c'};
                if(maxoccurance(array) != -1) {
                        System.out.println("The maximum element in the array is "+(char)maxoccurance(array));
                } else {
                        System.out.println("There are no maximum elements in the array");
                }
        }

}