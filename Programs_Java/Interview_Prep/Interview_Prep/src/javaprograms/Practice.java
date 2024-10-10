package javaprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		//Armstrong Number
//		int r, t, cube = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int number = sc.nextInt();
//		t = number;
//		while(number>0) {
//			r = number % 10;
//			number = number/10;
//			cube += r*r*r;
//		}
//		
//		if(t==cube) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
		
		//Anagram
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a string1");
		String str1 = sc1.nextLine();
		System.out.println("Enter a string2");
		String str2 = sc1.nextLine();
		boolean flag = false;
		
		if(str1.length()==str2.length()) {
			char[] char1 = new char[str1.length()];
			char[] char2 = new char[str1.length()];
			for(int i=0; i<=str1.length()-1;i++) {
				char1[i] = str1.charAt(i);
				char2[i] = str2.charAt(i);
			}
			Arrays.sort(char1);
			Arrays.sort(char2);
			for(int i=0; i<=str1.length()-1;i++) {
				if(char1[i]!=char2[i]) {
					flag=false;
				}else {
					flag=true;
				}
			}
		}else {
			flag = false;
		}
		
		System.out.println(flag);
	}

}
