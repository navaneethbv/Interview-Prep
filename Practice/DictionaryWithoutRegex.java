package Practice;
import java.util.ArrayList;
import java.util.List;
 
public class DictionaryWithoutRegex {
    public static void main(String args[]) {
        List<String> dict = new ArrayList<String>();
 
        //add elements to list
        dict.add("hot");
        dict.add("hit");
        dict.add("hat");
        dict.add("harsh");
        dict.add("hate");
        dict.add("hunt");
        dict.add("eat");
        dict.add("hea");
        dict.add("heahit");
        dict.add("amphitheater");
        int i;
        String pattern = "h*t";
        int patLen = pattern.length();
        char patCharsArr[] = pattern.toCharArray();
        int patCharInd;
        List<Character> patCharsList = new ArrayList<Character>();
 
        //Stores everything except * in a list
        for (i = 0; i < patLen; i++)
            if (pattern.charAt(i) != '*')
                patCharsList.add(pattern.charAt(i));
        int dictLength = dict.size();
        int ind1, ind2;
        boolean flag;
 
        //If patterns has only stars then all words in dict would be matched.
        if (patCharsList.size() > 0) {
            //iterate over the dictionary
            for (i = 0; i < dictLength; i++) {
                String str = dict.get(i);
                 
                //If string is smaller than pattern then it cannot match it.
                if (str.length() < patLen)
                    continue;
                flag = true;
 
                patCharInd = 0;
                 
                //search for the first character of pattern.
                ind1 = str.indexOf(patCharsList.get(0));
                if (ind1 == -1)
                    continue; //If it is not found then skip that word.
                for (int j = 1; j < patCharsList.size(); j++) {
 
                    //Search for next character
                    ind2 = str.indexOf(patCharsList.get(j), ind1);
                    patCharInd++;
 
                    //If not found then go the next word
                    if (ind2 == -1) {
                        flag = false;
                        break;
                    }
 
                    //If * was not at this position then the difference between indexes should be 1
                    if (patCharsArr[patCharInd] != '*' && ind1 != ind2 - 1) {
                        flag = false;
                        break;
                    }
                    ind1 = ind2;
                }
                if (flag)
                    System.out.println(str);
            }
        }
        else
            for(i=0;i<dictLength;i++)
                System.out.println(dict.get(i));
    }
}