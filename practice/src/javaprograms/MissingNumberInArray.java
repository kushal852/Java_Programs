package javaprograms;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,7};
		int sum = 0;
		int sum1 = 0;
		
		
		for(int i=0; i<a.length;i++) {
			sum = sum + a[i];
		}
		
		for(int i=1; i<=7; i++) {
			sum1 = sum1 + i;
		}
		
		System.out.println(sum1 - sum);

	}

}
