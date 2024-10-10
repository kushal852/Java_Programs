package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortWordsInAnArray {

	public static void main(String[] args) {

		String words = "Thsi si Kushal Gupta";
		String[] words_Arr = words.split(" ");
		String sorted_string = "";
		
		for (String word : words_Arr) {
			char[] temp_arr = new char[word.length()];
			for(int i=0; i<word.length();i++) {
				temp_arr[i] = word.charAt(i);
			}
			Arrays.sort(temp_arr);
			for(int i=0; i<word.length();i++) {
				sorted_string += temp_arr[i];
			}
			sorted_string += ' ';
		}
		
		System.out.print(sorted_string);
			
		
	}

}
