package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class greatestSumInTheSubArrays {
	
	static int sum_of_nums(List<Integer> arr) {
		int sum = 0;
		for(int i=0; i<arr.size();i++) {
			sum = sum+arr.get(i);
		}
		return sum;
	}

	public static void main(String[] args) {

	   
		Integer[] arr = {4,-1,2,1};
		List<Integer> a = Arrays.asList(arr);
		int max_sum = 0;
		int current_sum = 0;
		
		for(int i=0; i<a.size(); i++) {
			for(int j=i+1; j<a.size()+1;j++) {
				current_sum = sum_of_nums(a.subList(i, j));
				if(current_sum > max_sum) {
					max_sum = current_sum;
				}
			}
		}
		
		System.out.println(max_sum);
		

	}

}


//String s = "tree";
//String output = "";
//ArrayList<Integer> a = new  ArrayList<Integer>();
////int max = 1;
//HashMap<Character,Integer> h1 = new HashMap<Character,Integer>();
//
//for(int i=0; i<s.length(); i++){
//    if(h1.containsKey(s.charAt(i))){
//        h1.put(s.charAt(i), 
//        h1.get(s.charAt(i)) + 1);
//    }else{
//        h1.put(s.charAt(i), 1);
//    }
//}
//
//System.out.println(h1);
//
//for(Character c : h1.keySet()){
//    a.add(h1.get(c));
//}
//
//System.out.println(a);
//
//Arrays.sort(a);
//
//for(Character c : h1.keySet()){
//     
//}
//
//Given()
//
//timeout.implicitwait(20);
//WebdriverWait a = new 
