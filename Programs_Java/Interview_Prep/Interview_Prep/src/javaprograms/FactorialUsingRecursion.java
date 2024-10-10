package javaprograms;

public class FactorialUsingRecursion {
	
	static int factorial(int num) {
		int fact = 1;
		if(num>0) {
			for(int i=num; i>0; i--) {
				fact = fact*i;
			}
		}
		return fact;
	}
	
	//using recursion - function called inside the same function is called recursion
	
	static int factorialusingrec(int num) {
		if(num>0) {
			return num * factorialusingrec(num-1);
		}else {
			return 1;
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println(FactorialUsingRecursion.factorial(5));
		System.out.println(FactorialUsingRecursion.factorialusingrec(5));

	}

}
