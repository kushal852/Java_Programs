package javaprograms;

import java.util.HashMap;

public class OccurenceOfDigitsInGivenDecimalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String decimalNumber = "12345678901234567890.999";
		HashMap<Character,Integer> occurences = new HashMap<Character,Integer>();
		
		for(int i=0; i<decimalNumber.length();i++) {
			char c = decimalNumber.charAt(i);
			if(Character.isDigit(c)) {
				if(occurences.containsKey(c)) {
					occurences.put(c , occurences.get(c)+1);
				}else {
					occurences.put(c , 1);
				}
			}
		}
		
		System.out.println(occurences);
		
	}

}
