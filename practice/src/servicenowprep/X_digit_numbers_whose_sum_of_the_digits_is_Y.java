package servicenowprep;

public class X_digit_numbers_whose_sum_of_the_digits_is_Y {
	
	static Integer sumOfIntegers(int a) {
		String temp = Integer.toString(a);
		int sum = 0;
		for(int i = 0; i<temp.length(); i++) {
			sum += Integer.parseInt(Character.toString(temp.charAt(i)));	
		}
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 3;
		int y= 10;
		String max = "";
		
		for(int i =0; i<x;i++) {
			max += 9;
		}
		
		int startRange = (int) Math.pow(10, x-1);
		int endRange = Integer.parseInt(max);
		System.out.println(startRange);
		for(int i = startRange; i<endRange+1; i++) {
			if(sumOfIntegers(i)==y) {
				System.out.println(i);
			}
		}

	}

}
