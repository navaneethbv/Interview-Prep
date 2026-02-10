package Practice;

class SecondHighest {

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

        public static void main(String[] args) {
                int[] array = {3, 2, 9, 7, 11, 1, 5};
                System.out.println("The second highest number in the array is "+findsecondhighest(array));
        }

}