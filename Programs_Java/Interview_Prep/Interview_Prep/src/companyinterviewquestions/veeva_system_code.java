package companyinterviewquestions;

import java.util.ArrayList;
import java.util.List;

public class veeva_system_code {
	
	static String  str[] = {"1","2"};
	
	static int sum_of_number(int num) {
		
		int r = 0;
		int sum = 0;
		
		while(num>0) {
			r = num % 10;
			num = num/10;
			sum += r;
		}
		
		return sum;
	}

	public static void main(String[] args) {		
		if(str.length>0) {
			System.out.println(true);
		}
		int num = 345;
		int sum = veeva_system_code.sum_of_number(num);
		int t = num;
		int t2 = -1;
		
		while(t2==-1) {
			t = t + 1;
			if(sum_of_number(t)==sum) {
				System.out.println(t);
				t2=t;
			}	
		}	
		
		
		int[] arr = {-3,-1,0,1,3,4,6,7};
		List<Integer> arr1 = new ArrayList<Integer>();
		int max_value = arr[arr.length-1];
		int min_value = arr[0];
		
		for(int i=0; i<=arr.length-1;i++) {
			arr1.add(arr[i]);
		}
		
		for(int i =min_value; i<=max_value;i++) {
			if(!arr1.contains(i)) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
