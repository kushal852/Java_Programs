package servicenowprep;

import java.util.Arrays;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3 }, 
					  { 4, 5, 6 }, 
					  { 7, 8, 9 }, 
					  { 10, 11, 12 } }; // 4 * 3 matrix
		
		int b[][] = new int[a[0].length][a.length];
		
		int rows = a.length;
		
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.println(a[i][j]);
				b[j][i] = a[i][j];
			}
		}
		
		for(int i=0; i<b.length; i++) {
			System.out.println(Arrays.toString(b[i]));
		}
		
		
		int a1 = 0; 
		int b1 = a1;
		b1 = a1++;
		
		System.out.println(a1 + "-" + b1);
	}
	
	
	
	

}
