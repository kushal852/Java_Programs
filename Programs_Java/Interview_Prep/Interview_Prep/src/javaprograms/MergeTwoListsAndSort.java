package javaprograms;

import java.util.Arrays;

public class MergeTwoListsAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,3,5,7,9};
		int[] b = {2,4,6,8};
		int[] c = new int[a.length+b.length];
		
		System.out.println(c.length);
		
		for(int i =0; i<a.length;i++) {
			c[i] = a[i];
		}
		
		for(int i =0; i<b.length;i++) {
			c[a.length+i] = b[i];
		}
		
		Arrays.sort(c);
		
		System.out.println(Arrays.toString(c));

	}

}
