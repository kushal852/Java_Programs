package servicenowprep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortingOccurencesBasedOnValuesIfValuesAreSameSortOccurencesBasedOnKey {

	public static void main(String[] args) {
		String str = "Iamasoftwareengineer";
		TreeMap<Character, Integer> a = new TreeMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (a.containsKey(str.charAt(i))) {
				a.put(str.charAt(i), a.get(str.charAt(i)) + 1);
			} else {
				a.put(str.charAt(i), 1);
			}
		}

		System.out.println(a);

		TreeSet<Integer> unique = new TreeSet<Integer>();
		for (Character c : a.keySet()) {
			unique.add(a.get(c));
		}
		ArrayList<Integer> frequency = new ArrayList<Integer>(unique);
		System.out.println(frequency);

		HashMap<Integer, ArrayList<Character>> sortedMap = new HashMap<Integer, ArrayList<Character>>();

		for (int i = frequency.size() - 1; i >= 0; i--) {
			ArrayList<Character> current = new ArrayList<Character>();
			for (Character c : a.keySet()) {
				if (a.get(c) == frequency.get(i)) {
					if (sortedMap.containsKey(frequency.get(i))) {
						current = sortedMap.get(frequency.get(i));
					}
					current.add(c);
					sortedMap.put(frequency.get(i), current);
				}
			}
		}

		System.out.println(sortedMap);

		for (int i = frequency.size(); i > 0; i--) {
			if (sortedMap.get(i).size() == 1) {
				System.out.println(sortedMap.get(i).get(0) + "=" + i);
			} else {
				Collections.sort(sortedMap.get(i));
				for (int j = sortedMap.get(i).size() - 1; j >= 0; j--) {
					System.out.println(sortedMap.get(i).get(j) + "=" + i);
				}
			}
		}
	}

}
