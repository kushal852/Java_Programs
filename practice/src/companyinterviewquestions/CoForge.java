package companyinterviewquestions;

import java.util.*;

public class CoForge {

	public static void main(String[] args) {

		int[] a1 = { 111, 0, 1, 88 };
		int[] a2 = { 11, 1, 1, 0, 12 };
		
		// Merge 2 arrays and sort the merged array in descending order
		int[] output = new int[a1.length + a2.length];
		
		for (int i = 0; i < a1.length; i++) {
			output[i] = a1[i];
		}

		for (int i = 0; i < a2.length; i++) {
			output[a1.length + i] = a2[i];
		}

		System.out.println(Arrays.toString(output));

		int[] descendingOrderOutput = new int[output.length];

		Arrays.sort(output);

		System.out.println(Arrays.toString(output));

		for (int i = 0; i < output.length; i++) {
			descendingOrderOutput[i] = output[output.length - i - 1];
		}

		System.out.println(Arrays.toString(descendingOrderOutput));
		
		// find the occurrence of each element in merged array and remove duplicates
		HashMap<Integer, Integer> duplicates = new HashMap<Integer, Integer>();
		for (int i = 0; i < descendingOrderOutput.length; i++) {
			if (duplicates.containsKey(descendingOrderOutput[i])) {
				duplicates.put(descendingOrderOutput[i], duplicates.get(descendingOrderOutput[i]) + 1);
			} else {
				duplicates.put(descendingOrderOutput[i], 1);
			}
		}

		for (Integer key : duplicates.keySet()) {
			if (duplicates.get(key) > 1) {
				System.out.println(key);
			}
		}
		
		HashSet<Integer> unique = new HashSet<Integer>();
		for(int i : descendingOrderOutput) {
			unique.add(i);
		}
		System.out.println(unique);
		
	}
}
