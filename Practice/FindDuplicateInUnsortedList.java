package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateInUnsortedList {
	
	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		list.add(4);
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(5);
		list.add(1);
		
		System.out.println("The duplicate number is "+findDuplicate(list));
	}

	private static int findDuplicate(List<Integer> list) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 1;
		for(int i = 0; i < list.size(); i++) {
			if(!map.containsKey(list.get(i))) {
				map.put(list.get(i), count);
			} else
			{
				map.put(list.get(i), count + 1);
			}
		}
		Map.Entry<Integer, Integer> maxEntry = null;

		for (Map.Entry<Integer, Integer> entry : map.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }
		}
		return maxEntry.getKey();
	}
}
