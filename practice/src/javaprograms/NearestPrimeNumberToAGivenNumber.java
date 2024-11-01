package javaprograms;

public class NearestPrimeNumberToAGivenNumber extends Prime_Number {

	public static void main(String[] args) {
		
		
		int n = 17;
		
		if (isPrime(n)) {
	         System.out.println(n + " is a prime number.");
	         return;
	      }
	      // Find the closest prime number by checking numbers above and below the input number
	      int lower = n - 1;
	      int upper = n + 1;
	      while (true) {
	         if (isPrime(lower)) {
	            System.out.println(lower + " is the closest prime number to " + n + ".");
	            //break;
	            return;
	         } else if (isPrime(upper)) {
	            System.out.println(upper + " is the closest prime number to " + n + ".");
	            //break;
	            return;
	         }
	         lower--;
	         upper++;
	      }
	   }
		
	}


