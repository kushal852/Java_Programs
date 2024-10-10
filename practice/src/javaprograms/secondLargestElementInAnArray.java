package javaprograms;

import java.util.Arrays;

public class secondLargestElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// without inbuilt
		int[] arr = {12, 5, 8, 1, 29, 19};
		
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
		
		System.out.println(arr[arr.length-2]);
		
		// with inbuilt
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
		
		 String s1 = new String("xyz");
		 String s2 = "xyz";
		 System.out.println(s1.intern());
		 System.out.println(s1.intern() == s2);

	}

}
