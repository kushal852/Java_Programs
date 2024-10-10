package javaprograms;

public class Prime_Number {
	
	// method to check a single number is prime number
	static boolean isPrime(int num) {
		
		if (num <= 1) {
			return false;
		}
		for(int i = 2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	// return prime numbers until a given number
	static void returnPrimeNumbers(int num) {
		System.out.println();
		for(int i=2; i<=num; i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
	static void returnPrimeNumbers(int startRange, int endRange) {
		System.out.println();
		if(startRange < endRange) {
			for(int i=startRange; i<=endRange; i++) {
				if(isPrime(i)) {
					System.out.print(i + " ");
				}
			}
		}else {
			System.out.println("enter valid range");
		}
	}

	public static void main(String[] args) {
		
		int num = 19;
		if(Prime_Number.isPrime(num)) {
			System.out.println("is prime");
		}else {
			System.out.println("is not prime");
		}
		
		Prime_Number.returnPrimeNumbers(num);
		
		Prime_Number.returnPrimeNumbers(7,19);

	}

}
