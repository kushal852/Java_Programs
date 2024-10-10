package oops;

import java.util.Arrays;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 3, 5, 5, 6, 8, 3, 2 , 4, 1, 5, 6};
		
		
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
				int temp = 0;
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		


	}

}
