package programCreek;

import java.util.HashMap;
import java.util.Map;

/*
 * Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic
if the characters in s can be replaced to get t.
For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.
 */


public class IsomorphicStrings {
	public static void main(String[] args) {
		String one = "foo";
		String two = "baa";
		if(isIsomorphic(one,two)){
			System.out.println("The given strings are isomorphic");
		}
		else
			System.out.println("The given strings are not isomorphic");
	}

	public static boolean isIsomorphic(String s, String t) {
		if(s == null || t == null)
			return false;

		if(s.length() != t.length())
			return false;

		if(s.length() == 0 && t.length() == 0)
			return true;

		HashMap<Character, Character> map = new HashMap<Character,Character>();

		for(int i = 0; i < s.length(); i++){
			char c1 = s.charAt(i); System.out.println(c1);
			char c2 = t.charAt(i); System.out.println(c2);
			Character c = getKey(map, c2); System.out.println(c);

			if(c != null && c!=c1) {
				return false;
			}
			else if(map.containsKey(c1)) {
				if(c2 != map.get(c1))
					return false;
			} else {
				map.put(c1,c2);
			}
		}
		return true;
	}
	// a method for getting key of a target value
	public static Character getKey(HashMap<Character,Character> map, Character target){
		for (Map.Entry<Character,Character> entry : map.entrySet()) {
			if (entry.getValue().equals(target)) {
				return entry.getKey();
			}
		}
		return null;
	}
}
