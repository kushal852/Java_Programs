package javaprograms;

public class Swap_Two_Numbers {

	public static void main(String[] args) {
		
		int x = 1115;
		int y = 2;
		
		// using temp 
//		int temp;
//		temp = x;
//		x = y;
//		y = temp;
//		System.out.println(x);
//		System.out.println(y);
		
		// without temp
		x= x+y; // x = 15
		y = x-y; // y = 5
		x = x-y ;
		
		System.out.println(x);
		System.out.println(y);
		
		

	}

}
