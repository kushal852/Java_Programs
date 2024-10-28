package servicenowprep;

import java.util.ArrayList;
import java.util.Arrays;

public class pushZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(0,1,0,11,12,0,4,6));
		ArrayList<Integer> zeros = new ArrayList<Integer>();
		
		for(int i=0; i<nums.size();i++) {
			if(nums.get(i)==0) {
				zeros.add(nums.get(i));
			}
		}
		
		nums.removeAll(zeros);
		
		System.out.println(nums);
		
		nums.addAll(zeros);
		
		System.out.println(nums);
		
	}

}
