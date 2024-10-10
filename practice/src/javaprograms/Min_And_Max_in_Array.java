package javaprograms;

import java.util.*;

public class Min_And_Max_in_Array {

	public static void main(String[] args) {
		
		int numbers[] = {-10, 24, 50, 999};
		// Without inbuilt
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i=0; i<=numbers.length-1;i++) {
			if(numbers[i]>largest) {
				largest = numbers[i];
			}else if(numbers[i]<smallest){
				smallest = numbers[i];
			}
		}
		
		System.out.println(smallest);
		System.out.println(largest);
		
		// With inbuilt
		 List<Integer> arr1 = Arrays.asList(4, 781, 8, 99, 103);
		 Collections.sort(arr1);
		 System.out.println(arr1.get(arr1.size()-1));
		 System.out.println(arr1.get(0));
		 int[] inputArr1 = {4, 781, 8, 99, 103};
		 Arrays.sort(inputArr1);
		 System.out.println(inputArr1[inputArr1.length-1]);
		 System.out.println(inputArr1[0]);

	}

}
