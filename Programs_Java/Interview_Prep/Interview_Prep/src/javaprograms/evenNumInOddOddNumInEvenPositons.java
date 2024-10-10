package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class evenNumInOddOddNumInEvenPositons {

	public static void main(String[] args) {


		List<Integer> input = Arrays.asList(10,13,2,4,27,99);
		List<Integer> evens = new ArrayList<Integer>();
		List<Integer> odds = new ArrayList<Integer>();
		List<Integer> output = new ArrayList<Integer>();
		
		for (int i : input) {
			if(i%2==0) {
				evens.add(i);
			}else {
				odds.add(i);
			}
		}
		
		 for (int i = 0; i < evens.size(); i++) {
			 output.add(odds.get(i));
			 output.add(evens.get(i));
		 }
		 
		 System.out.println(output);

	}

}
