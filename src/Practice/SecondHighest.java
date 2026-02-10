package Practice;

class SecondHighest {

        /**
         * Finds  in the data structure.
         *
         * @param array the array to process
         * @return the computed integer result
         */
        public static int findsecondhighest(int[] array) {
                int highest = 0, secondhighest = 0;
                if(array[0] > array[1]) {
                        highest = array[0];
                        secondhighest = array[1];
                }
                else {
                        highest = array[1];
                        secondhighest = array[0];
                }
                for(int i = 2; i < array.length; i++) {
                        if(array[i] > highest) {
                                secondhighest = highest;
                                highest = array[i];
                        }
                        else if(array[i] > secondhighest) {
                                secondhighest = array[i];
                        }

                }
                return secondhighest;
        }

        /**
         * Main method to test the functionality of the class with various test cases.
         *
         * @param args the array to process
         */
        public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
        }

}