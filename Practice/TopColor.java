package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class TopColor {
	static List<String> mostCommon(List<List<String>> image) {
		Map<String, Integer> map = new HashMap<String, Integer>(); 
		List<String> list = new ArrayList<String>();
		for(int i = 0; i <image.size(); i++) {
			for(String value : image.get(i)) {
				Integer val = map.get(value);
				map.put(value, val == null ? 1 : val + 1);
			}
		}
		Entry<String, Integer> max = null;
		int count = 0;
		for (Entry<String, Integer> e : map.entrySet()) {
			if (max == null || e.getValue() > max.getValue())
				max = e;
		}
		count = max.getValue();
		for (Entry<String, Integer> entry : map.entrySet()) {
	        if (Objects.equals(count, entry.getValue())) {
	            list.add(entry.getKey());
	        }
	    }
		Collections.sort(list);
		return list;
	}


	public static void main(String[] args) {
		List<List<String>> image = new ArrayList<List<String>>();
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<String> list3 = new ArrayList<String>();
		list1.add("red");
		list1.add("red");
		list1.add("blue");
		image.add(list1);
		list2.add("black");
		list2.add("blue");
		list2.add("green");
		image.add(list2);
		list3.add("yellow");
		list3.add("green");
		list3.add("yellow");
		image.add(list3);

		System.out.println(mostCommon(image));

		//System.out.println(image.get(0));
	}
}
