package javaprograms;

import java.util.*;

public class Ocuurence_Of_Chars_in_a_String_sorted_based_on_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Iamasoftwareengineer";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<Character, Integer>();
		

		for (char c : str.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		System.out.println(map);

		List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
			@Override
			public int compare(Map.Entry<Character, Integer> i1, Map.Entry<Character, Integer> i2) {
				return i1.getValue().compareTo(i2.getValue());
			}
		});

		for (Map.Entry<Character, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		System.out.println(sortedMap);

	}

}
