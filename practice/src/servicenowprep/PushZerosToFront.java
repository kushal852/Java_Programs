package servicenowprep;

import java.util.ArrayList;
import java.util.Arrays;

public class PushZerosToFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(0,1,0,11,12,0,4,6));
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for(int i=0 ;i<nums.size();i++) {
			System.out.println(nums.get(i));
			if(nums.get(i) > 0) {
				temp.add(nums.get(i));
			}
		}
		
		
		nums.removeAll(temp);
		
		nums.addAll(temp);
		
		System.out.println(nums);
	}

}
