package javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class count_of_numbers_in_an_unsorted_array_within_inclusive_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3, 3, 5, 2};
		int counter = 0;
		int r1 = 1;
		int r2 = 5;
		
		for(int i=0; i<arr.length;i++) {
			if((r2<=arr[i] && r1>=arr[i]) || (r2>=arr[i] && r1<=arr[i])) {
				counter += 1;
			}
		}
		
		System.out.println(counter);
		
		List<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		List<Integer> arr2 = new ArrayList<Integer>();
		
		//int temp = 0;
		int multiple = 1;
		
//		for(int i=0; i<arr1.size();i++) {
//			temp = arr1.get(i);
//			arr1.remove(i);
//			System.out.println(arr1);
//			for(int j=0; j<arr1.size();j++) {
//				multiple *= arr1.get(j);
//			}
//			System.out.println(multiple);
//			arr2.add(multiple);
//			arr1.add(i, temp);
//			multiple = 1;
//		}
		for(int num:arr1) {
			multiple *= num;
		}
		for(int num:arr1) {
			arr2.add(multiple/num);
		}
		System.out.println(arr2);
	}

}
