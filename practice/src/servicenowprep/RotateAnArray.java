package servicenowprep;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateAnArray {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int[] arr = {6, 3, 5, 2, 4, 1, 8};
		int d = 100;
		int n = arr.length;
		int counter = 0;
		  
		for (int i = 0; i < d; i++) {
        	int first = arr[0];
        	try {
            	if(n%i !=0) {
		            for (int j = 0; j < n - 1; j++) {
		                arr[j] = arr[j + 1];
		            }
		            counter = counter +1;
	            }else {
	            	continue;
	            }
            }catch(ArithmeticException e){
            	for (int j = 0; j < n - 1; j++) {
	                arr[j] = arr[j + 1];
	            }
            	counter = counter +1;
            }
            
            arr[n - 1] = first;
        }
	        
	        System.out.println(counter);
	        System.out.println(Arrays.toString(arr));
	}

}