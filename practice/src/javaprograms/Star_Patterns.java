package javaprograms;

public class Star_Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// right angled triangle
		for(int i=0; i<=4; i++) {
			for (int j=0 ; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		// inverted right angled triangle
		for(int i=0; i<=4; i++) {
			for (int j=4 ; j>=i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------");
		// Whole triangle
		for(int i=0; i<=4; i++) {
			for (int j=0 ; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<=4; i++) {
			for (int j=4 ; j>i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int a = 1;
		for(int i=0; i<=3; i++) {
			for (int j=0 ; j<=i ; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}

	}

}
