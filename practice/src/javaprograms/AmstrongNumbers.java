package javaprograms;

import java.util.Scanner;

public class AmstrongNumbers {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter a number");

		//int num = myObj.nextInt();  // Read user input
		 
		int num = 153;
		int r = 0;
		int cube = 0;
		int t = num;
		while(num>0) {
			r = num % 10; // reminder = 3
			num = num/10; // number = 15
			cube += (r*r*r); // t = 27
		}
		
		if (t==cube) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		System.out.println("Enter a number2");

		int num2 = 153;
				//myObj.nextInt();
		
		String int_to_str = Integer.toString(num2);
		int cube1 = 0;
		for(int i=0; i<int_to_str.length();i++) {
			int str_int = Character.getNumericValue(int_to_str.charAt(i));
			System.out.println(str_int);
			cube1 += (str_int*str_int*str_int);
		}
		System.out.println(cube1);
		if(num2==cube1) {
			System.out.println("true");
		}else {
		System.out.println("false");
		}
	}

}
