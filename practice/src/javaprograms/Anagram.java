package javaprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st1 = "listen";
		String st2 = "SILENT";
		
		String str1 = st1.replaceAll("\\s","").toLowerCase();
		String str2 = st2.replaceAll("\\s","").toLowerCase();
//		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//		System.out.println("Enter a string1: ");
//		
//		String str1 = myObj.nextLine();
//		
//		System.out.println("Enter a string2: ");
//		String str2 = myObj.nextLine();
//		
		
		boolean flag = false;
		
		if((str1.length() == str2.length()) && (str1.length()>0 && str2.length()>0)) {
			char[] c1 = new char[str1.length()];
			char[] c2 = new char[str1.length()];
			for(int i =0; i<=str1.length()-1;i++) {
				c1[i] = str1.charAt(i);
				c2[i] = str2.charAt(i);
			}
			Arrays.sort(c1);
			Arrays.sort(c2);
			for (int i = 0; i < c2.length; i++)
	            if (c1[i] != c2[i]) {
	            	flag = false;
					break;
	            }else {
	            	flag = true;
	            }
		}else {
			flag = false;
		}
		
		if(flag) {
			System.out.println(str1 + " , " +str2 + " are Anagrams");
		}else {
			System.out.println("Not an Anagram");
		}
	}

}
