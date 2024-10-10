package javaprograms;

public class Swap_Two_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "hello";
		String b = "world";
		
		a = a+b; // helloworld
		b = a.substring(0, a.length()-b.length()); // world
		a = a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);
		
		String s1 = "kushal";
		String s2 = "gupta";
		
		s1 = s1 + s2;
		s2 = s1.replace(s2, "");
		s1 = s1.replace(s2, "");
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
