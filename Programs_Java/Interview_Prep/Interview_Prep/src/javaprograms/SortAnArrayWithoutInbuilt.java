package javaprograms;

import java.util.Arrays;

public class SortAnArrayWithoutInbuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,8,1,9,5,2,7};
		
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
