package javaprograms;

import java.util.*;
import java.lang.*;

public class Ocuurence_Of_Chars_in_a_String_sorted_based_on_key {

	public static void main(String[] args) {
		
		
		String str="abcabcdef";

		TreeMap<Character,Integer> occurence = new TreeMap<Character,Integer>();

		for(char c : str.toCharArray()){
		    if(occurence.containsKey(c)){
		        occurence.put(c,
		        occurence.get(c)+1
		        );
		    }else{
		        occurence.put(c,1);
		    }
		}
		
		System.out.println(occurence);
		
		for (Map.Entry entry : occurence.entrySet()) { 
            System.out.println(entry.getKey() + "=" + entry.getValue()); 
        } 
    } 


}
