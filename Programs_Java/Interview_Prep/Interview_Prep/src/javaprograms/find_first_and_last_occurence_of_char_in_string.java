package javaprograms;

import java.util.ArrayList;
import java.util.Collections;

public class find_first_and_last_occurence_of_char_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "amazonaanazzz";
		int len = s.length();
		ArrayList<Integer> occurences = new ArrayList<Integer>();		
		for(int i=0; i<=len-1; i++) {
			if(s.charAt(i) == 'a') {
				occurences.add(i);
			}
		}
		
		System.out.println(Collections.max(occurences));
		System.out.println(Collections.min(occurences));

	}

}
