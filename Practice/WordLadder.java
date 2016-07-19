package Practice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder {
	
	public static void main(String[] args) {
		String beginWord = "cat";
		String endWord = "map";
		Set<String> wordList = new HashSet<String>();
		wordList.add("cap");
		wordList.add("car");
		wordList.add("mar");
		System.out.println("The length of the shortest transformation sequence between beginWord to endWord is "+ladderLength(beginWord, endWord, wordList));
	}
	
	public static int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        Queue<String> q = new LinkedList<String>();
        int level = 1;
        q.offer(beginWord);
        int cnt = q.size();
        while(!q.isEmpty()){
            String tmp = (String) q.poll();
            cnt--;
            char[] cArr = tmp.toCharArray();
            for(int i = 0; i < cArr.length; i++){
                for(char c = 'a'; c <= 'z'; c++){
                    cArr[i] = c;
                    String str = new String(cArr);
                    if(str.equals(endWord)){
                        return level + 1;
                    }
                    if(wordList.contains(str)){
                        wordList.remove(str);
                        q.offer(str);
                    }
                }
                cArr[i] = tmp.charAt(i);
            }
            if(cnt == 0){
                cnt = q.size();
                level++;
            }
        }
        return 0;
    }
}
