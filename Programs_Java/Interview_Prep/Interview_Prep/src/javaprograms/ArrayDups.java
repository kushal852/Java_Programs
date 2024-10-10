package javaprograms;

import java.util.HashMap;
import java.util.*;

public class ArrayDups {

	public static void main(String[] args) {
		
		int a[] = {1,1,2,3,3,4,5,6,8,9,9,9,9};
		List<Integer> duplicates =  new ArrayList<Integer>();
		//Simple
		Arrays.sort(a);
		 for (int i = 1; i < a.length; i++) {
		 if (a[i] == a[i- 1]) {
			 duplicates.add(a[i]);
		 }
		 }
		 System.out.println(duplicates);
		
		
		// Very Complex
		List<Integer> dups =  new ArrayList<Integer>();
		HashMap<Integer, Integer> dupsOccurence = new HashMap<Integer, Integer>();
		for(int i=0; i<=a.length-1;i++) {
			if(dupsOccurence.containsKey(a[i])) {
				dupsOccurence.put(a[i], dupsOccurence.get(a[i]) + 1);
			}
			else {
				dupsOccurence.put(a[i], 1);
			}
		}
		
		System.out.println(dupsOccurence);
		
		for(int i : dupsOccurence.keySet()) {
			if(dupsOccurence.get(i) > 1) {
				dups.add(i);
			}
		}
		
		System.out.println(dups);

	}

}

