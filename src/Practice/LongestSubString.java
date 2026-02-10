package Practice;

import java.util.*;

class LongestSubString {
    
    public static void main(String[] args) {
        String word = "dabeabacef";
        System.out.println("The length of the longest substring without repitition is "+longestWithoutRepitition(word));
    }
    
    public static int longestWithoutRepitition(String word) {
        String[] array = word.split(""); int count = 0, temp = 0;
        Set<String> set = new HashSet<String>(); 
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
