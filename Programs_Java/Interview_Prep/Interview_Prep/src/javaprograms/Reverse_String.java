package javaprograms;

public class Reverse_String {

static String reverse_method(String s) {
		
		int len = s.length();
		String reversed_String = "";
		
		for(int i = len-1 ; i >= 0 ; i--) {
			reversed_String += s.charAt(i);
		}
		
		return reversed_String;
	}

	public static void main(String[] args) {
		
		// Using Loop
		String s = "Kushal Gupta"; // immutable
		int len = s.length();
		String reversed_String = "";
		
		for(int i = len-1 ; i >= 0 ; i--) {
			reversed_String += s.charAt(i);
		}
		
		System.out.println(reversed_String);
		
		// Using String Builder
		StringBuilder sb = new StringBuilder(s); // mutable
		System.out.println(sb.reverse());
		
		int num = 12345;
		
		String num_String = Integer.toString(num);
		
		String int_reveresed = Reverse_String.reverse_method(num_String);
		
		System.out.println(Integer.parseInt(int_reveresed));
		
		int rev = 0;
		while(num != 0) {
			rev = rev*10 + num % 10;
			num = num / 10;
		}
		
		System.out.println(rev);

	}
}
