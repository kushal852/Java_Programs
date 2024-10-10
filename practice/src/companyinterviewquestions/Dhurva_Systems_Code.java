package companyinterviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dhurva_Systems_Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 5;
		int[] arr1 = {2, 3, 6, 7, 9};
		int[] arr2 = {1, 4, 8, 10};
		
		int[] output = new int[arr1.length + arr2.length];
		//List<Integer> o1 = new ArrayList<Integer>();
		
		for(int i=0; i<=arr1.length-1; i++) {
			output[i] = arr1[i];
		}
		
		for(int i=0; i<=arr2.length-1; i++) {
			output[i+arr1.length] = arr2[i];
		}
		
		System.out.println(output[k]);
		
		int temp;
		int len = output.length;
		
		// bubble sort
		for(int i=0; i<output.length;i++) {
			for(int j=i+1; j<output.length; j++) {
				if(output[i] > output[j]) {
					temp = output[i];
					output[i] = output[j];
					output[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(output));
		System.out.println(output[k]);
		
		
		int arr[] = {0,1,0,1,1,1,0};
		
		List<Integer> zero_arr = new ArrayList<Integer>();
		List<Integer> one_num = new ArrayList<Integer>();
		List<Integer> output1 = new ArrayList<Integer>();
		
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i] == 1) {
				one_num.add(arr[i]);
			}else {
				zero_arr.add(arr[i]);
			}
		}
		output1.addAll(zero_arr);
		output1.addAll(one_num);
		System.out.println(output1);
		
		
	}

}
