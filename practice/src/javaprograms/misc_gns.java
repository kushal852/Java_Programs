package javaprograms;

public class misc_gns {
	
	static void test(String s) {
		System.out.println("String method");
	}
	
	static void test(Object o) {
		System.out.println("Object method");
	}

	public static void main(String[] args) {
		
		//generation of numbers from 1 to 100 without using numeric values in code
		
		int one = 'A'/'A';
		String s = "..........";
		
		for(int i=one;i<=(s.length()*s.length()); i++) {
			System.out.println(i);
		}
		
		test(null); // String method will be given precdence 

	}

}
