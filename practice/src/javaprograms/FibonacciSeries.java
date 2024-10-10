package javaprograms;

public class FibonacciSeries {
	
	static long fibonnaciSeriesGeneration(int n) {
		if (n==0) {
			return 0;
			 
		}else if(n==1) {
			return 1;
		}else {
			return fibonnaciSeriesGeneration(n-1)+fibonnaciSeriesGeneration(n-2);
		}
	}
	
	static long fibonnaciNumberGeneration(long n) {
		long a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long n = 100;
		System.out.println(FibonacciSeries.fibonnaciNumberGeneration(n));
		

	}

}
