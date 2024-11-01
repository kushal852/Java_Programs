package javaprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Substrings {
	
	static ArrayList<Integer> occurenceOfCharacters(String str, String subStr) {
		ArrayList<Integer> indexes = new ArrayList<>();
        int index = str.indexOf(subStr);
        while (index >= 0) {
            indexes.add(index);
            index = str.indexOf(subStr, index + 1);
        }
        return indexes;
	}

	public static void main(String[] args) {
		
		String original = "Kushal is preparing a Test for automation testing";
		String sub = "Test";
		HashMap<String, ArrayList> output = new HashMap<String, ArrayList>();
		
		Set<String> subStrings = new HashSet<String>();
		for(int i=0 ; i<sub.length(); i++) {
			for(int j=i+1 ; j<sub.length()+1; j++) {
				subStrings.add(sub.substring(i,j));
			}
		}
		
		System.out.println(subStrings);
		for(String subString : subStrings) {
			ArrayList newArr = new ArrayList();
			List<Integer> indexes = occurenceOfCharacters(original, subString);
			int occurences = indexes.size();
			newArr.add(occurences);
			newArr.add(indexes);
			output.put(subString, newArr);
		}
		
//		Set<String> singleSubStrings = new HashSet<String>();
//		Set<String> multiSubStrings = new HashSet<String>();
//		HashMap<String, ArrayList<Integer>> occurence = new HashMap<String, ArrayList<Integer>>();
//		HashMap<String, Integer> counter = new HashMap<String, Integer>();
//		HashMap<String, ArrayList> output = new HashMap<String, ArrayList>();
//		int count = 0;
//		//original = original.toLowerCase();
//		//sub = sub.toLowerCase();
//		
//		
//		for(int i=0 ; i<sub.length(); i++) {
//			for(int j=i+1 ; j<sub.length()+1; j++) {
//				if(sub.substring(i,j).length() == 1) {
//					singleSubStrings.add(sub.substring(i,j));
//				}else {
//					multiSubStrings.add(sub.substring(i,j));
//				}
//				
//			}
//		}
//		
//		//{T:[3,[occurences]]}
//		
//		System.out.println(singleSubStrings);
//		System.out.println(multiSubStrings);
//		
//		for(String subString : singleSubStrings) {
//			for(int i =0; i<original.length();i++) {
//				if(Character.toString(original.charAt(i)).equals(subString)) {
//					ArrayList<Integer> occurences = new ArrayList<Integer>();
//					if(occurence.containsKey(subString) && counter.containsKey(subString)) {
//						occurences = occurence.get(subString);
//						occurences.add(i);	
//						occurence.put(subString,occurences);
//						counter.put(subString, counter.get(subString)+1);
//						
//					}else {
//						counter.put(subString, 1);
//						occurences.add(i);
//						occurence.put(subString,occurences);		
//					}
//				}			
//			}
//		}
//		
//		
//		
//		for(String key : occurence.keySet()) {
//			ArrayList values = new ArrayList();
//			values.add(counter.get(key));
//			values.add(occurence.get(key));
//			output.put(key, values);
//		}
				
		System.out.println(output);
	}

}
